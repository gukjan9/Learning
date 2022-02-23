const { odd, even } = require('./var'); // 구조분해는 속성, 변수명 같아야함
const checkNumber = require('./func');

function checkStringOddOrEven(str){
    if(str.length % 2) return odd;
    else return even;
}

console.log(checkNumber(10));
console.log(checkStringOddOrEven('hello'));