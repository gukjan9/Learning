const fs = require('fs');

const readStream = fs.createReadStream('../27/readme.txt', {highWaterMark: 16});
const writeStream = fs.createWriteStream('./writeme.txt');

readStream.pipe(writeStream);