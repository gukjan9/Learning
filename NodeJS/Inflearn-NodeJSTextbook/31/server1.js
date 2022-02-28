const http = require('http');

const server = http.createServer((req, res) => {
    res.writeHead(200, {'Content-Type' : 'text/html; charset=utf-8'});
    res.write('<h1>Hello Node!</h1>');
    res.write('<p>Hello server</p>');
    res.end('<p>Hello</p>');
})
    .listen(8080, () => {
        console.log('8080 port is running...');
    });
    
    server.on('error', (error) => {
        console.error(error);
    })


// 포트번호 생략 가능
// https - 443
// http - 80