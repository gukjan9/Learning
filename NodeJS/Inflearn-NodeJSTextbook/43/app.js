// const { application } = require('express');
const express = require('express');
const path = require('path');

const app = express();

// 서버에 속성을 심음
app.set('port', 3000);

// 포트 변경 가능
// app.set('port', process.env.PORT || 3000);

// 미들웨어
// 사용 후, next 선언해줘야 다음 라우터로 넘어간다.
// ((req, res)) 부터 }); 까지가 미들웨어
app.use((req, res, next) => {
    console.log('모든 요청에 실행하고 싶어요.');
    next();
}, (req, res, next) => {
    // throw new Error('에러가 났어요.');      // 이렇게 하면 서버로그에 떠야할 에러메세지가 웹페이지에 나타나게됨
    try{
        console.log('error');
    } catch(error){
        next(error);        // next 에 에러 넣으면 에러 처리 미들웨어로 이동
    }
});

// next
// next('route') -> 다음 라우터로 이동

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));       // 위에 path 에서 경로 지정
});

app.post('/', (req, res) => {
    res.send('hello express');
});

app.get('/about', (req, res) => {
    res.send('This is an example');
});

app.get('/category/Javascript', (req, res) => {
    res.send(`hello Javascript`);
});

// 와일드카드 :name
// 범위가 넓은 라우터들은 맨 밑에 위치해야함
app.get('/category/:name', (req, res) => {
    res.send(`hello ${req.params.name}`);
});

// * asterisk - 모든 주소 처리
// app.get('*', (req, res) => {
//     res.send(`hello ${req.params.name}`);
// });

app.use((req, res, next) => {
    res.send('404');
});

// error 미들웨어를 가장 마지막에
// 4개의 파라미터 필
app.use((err, req, res, next) => {
    console.error(err);
    res.status(200).send('Error occured');
});

app.listen(app.get('port'), () => {                // app.set 3000
    console.log('익스프레스 서버 실행');
});