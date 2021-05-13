import UIKit

// 오버로드 - 같은 함수, 다른 행동
func printTotalPrice(price : Int, count : Int){
    print("Total Price : \(price * count)")
}

func printTotalPrice(가격 : Int, 갯수 : Int){
    print("총 가격 : \(가격 * 갯수)")
}


// In-out parameter
// 함수 안에서 param 값 변경하고 싶을 때 param 변수 타입 앞에 inout 붙여주기
var value = 3
func incrementAndPrint(_ value : inout Int){
    value += 1
    print(value)
}
incrementAndPrint(&value)


// Function as a param
func add(_ a: Int, b: Int) -> Int {
    return a+b
}

func substract(_ a: Int, _ b: Int) -> Int {
    return a-b
}

var function = add
function(4, 2)
function = substract
function(4, 2)

func printResult(_ function: (Int, Int) -> Int, _ a: Int, _ b: Int){
    let result = function(a, b)
    print(result)
}

printResult(add, 10, 5)
printResult(substract, 10, 5)
