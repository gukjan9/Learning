// const { application } = require('express');
const express = require('express');
const path = require('path');

const app = express();

// 서버에 속성을 심음
app.set('port', 3000);

// 포트 변경 가능
// app.set('port', process.env.PORT || 3000);

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));       // 위에 path 에서 경로 지정
});

app.get('/about', (req, res) => {
    res.send('This is an example');
});

app.post('/', (req, res) => {
    res.send('hello express');
});

app.listen(app.get('port'), () => {                // app.set 3000
    console.log('익스프레스 서버 실행');
});