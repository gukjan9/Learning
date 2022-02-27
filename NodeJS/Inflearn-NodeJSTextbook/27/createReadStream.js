const fs = require('fs');
const readStream = fs.createReadStream('./readme.txt', {highWaterMark : 16}); // createReadStream 기본값 : 64kb (64000) highWaterMark 로 제한

const data = [];

readStream.on('data', (chunk) => {
    data.push(chunk);
    console.log('data : ', chunk, chunk.length);
});
readStream.on('end', () => {
    console.log('end : ', Buffer.concat(data).toString());
});
readStream.on('error', (err) => {
    console.log('error : ', err);
});

// buffer 보다 stream 이 메모리 효율 good