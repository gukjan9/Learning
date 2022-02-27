const fs = require('fs');
const zlib = require('zlib'); // 압축

const readStream = fs.createReadStream('../27/readme.txt', {highWaterMark: 16});
const zlibStream = zlib.createGzip();
// const writeStream = fs.createWriteStream('./writeme.txt');
const writeStream = fs.createWriteStream('./writeme.txt.gz');

readStream.pipe(writeStream);