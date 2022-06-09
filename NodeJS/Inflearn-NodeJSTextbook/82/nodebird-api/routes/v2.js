// api 서버에 요청 보내는 라우터

const express = require('express');
const jwt = require('jsonwebtoken');
const cors = require('cors');

const { verifyToken, apiLimiter } = require('./middlewares');
const { Domain, User, Post, Hashtag } = require('../models');

const router = express.Router();
router.use(cors({
  origin: true,
  credentials: true,
}));

router.post('/token', apiLimiter, async (req, res) => {
  const { clientSecret } = req.body;
  try {
    const domain = await Domain.findOne({
      where: { clientSecret },
      include: {
        model: User,
        attribute: ['nick', 'id'],
      },
    });
    if (!domain) {
      return res.status(401).json({
        code: 401,
        message: '등록되지 않은 도메인입니다. 먼저 도메인을 등록하세요',
      });
    }
    const token = jwt.sign({
      id: domain.User.id,
      nick: domain.User.nick,
      // type, 요금제
    }, process.env.JWT_SECRET, {        // 노출되면 안됨
      expiresIn: '1m', // 1분
      issuer: 'nodebird',
    });
    
    // 직접 코드 대신 cors 모듈 사용
    // res.setHeader('Access-Control-Aloow-Origin', 'localhost:4000');     // * 넣으면 모두 허용
    // res.setHeader('Access-Control-Aloow-Credentials', 'true');

    // nodecat 으로 토큰 값 전송
    return res.json({
      code: 200,
      message: '토큰이 발급되었습니다',
      token,
    });
  } catch (error) {
    console.error(error);
    return res.status(500).json({
      code: 500,
      message: '서버 에러',
    });
  }
});

// verifyToken, apiLimiter 순서에 따라 다름
router.get('/test', verifyToken, apiLimiter, (req, res) => {
  res.json(req.decoded);
});

router.get('/posts/my', verifyToken, apiLimiter, (req, res) => {
    Post.findAll({ where : { userId : req.decoded.id }})
      .then((posts) => {
          res.json({
              code: 200,
              payload: posts,
          })
      })
      .catch((error) => {
          console.error(error);
          return res.status(500).json({
              code: 500,
              message: '서버 에러',
          });
      });
});

router.get('/posts/hashtag/:title', verifyToken, apiLimiter, async (req, res) => {
    try{
        const hashtag = await Hashtag.finOne({ where: { title: req.params.title }});
        if (!hashtag){
            return res.status(404).json({
                code: 404,
                message: '검색 결과가 없습니다.',
            })
        }
        const posts = await hashtag.getPosts();
        return res.json({
            code: 200,
            payload: posts,
        });
    } catch (error){
        console.error(error);
        return res.status(500).json({
            code: 500,
            message: '서버 에러',
        });
    };
});

module.exports = router;