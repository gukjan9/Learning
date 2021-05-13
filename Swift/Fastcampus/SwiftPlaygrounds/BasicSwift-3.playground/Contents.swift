import UIKit

func printName(){
    print("--> My name is Ray")
}

printName()

// param 1개
func printMultipleOfTen(value : Int){
    print("\(value) * 10 = \(value * 10)")
}

printMultipleOfTen(value: 5)


// param 2개
func printTotalPrice(price : Int, count : Int){
    print("Total Price : \(price * count)")
}
printTotalPrice(price : 1500, count : 5)

func printTotalPrice2(_ price : Int, _ count : Int){     // param 앞에 _ 붙이면 함수 사용할 때 param 변수명 안 붙여도 됨
    print("Total Price : \(price * count)")
}
printTotalPrice2(1500, 5)

func printTotalPrice3(가격 price : Int, 갯수 count : Int){
    print("Total Price : \(price * count)")
}
printTotalPrice3(가격 : 1500, 갯수 : 5)     // swift는 uni-code 인식 가능


// param에 Default값 설정
func printTotalPriceWithDefaultValue(price : Int = 1500, count : Int){
    print("Total Price : \(price * count)")
}

printTotalPriceWithDefaultValue(count : 5)      // Default값 설정 해줬으니 안 적어줘도 됨
printTotalPriceWithDefaultValue(price : 2500, count : 5)        // Default값 변화시 param 추가 후 적어면됨


// Int 로 반환
func totalPrice(price : Int, count: Int) -> Int {
    let totalPrice = price * count
    return totalPrice
}

let calculatedPrice = totalPrice(price: 10000, count: 77)
calculatedPrice
