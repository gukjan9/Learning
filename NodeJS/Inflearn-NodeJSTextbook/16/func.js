// const value = require('./var.js');  // ./var 에서 ./ 은 지금 내가 있는 폴더
const {odd, even} = require('./var');

/*  구조 분해 할당 전
const value = requir('./var');
const odd = value.odd;
const even = value.even;
*/

function checkOddOrEven(number){
    if(number % 2) return odd;
    else return even;
}

console.log(checkOddOrEven(3));

module.exports = checkOddOrEven;