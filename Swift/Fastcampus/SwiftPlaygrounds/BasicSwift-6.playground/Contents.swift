import UIKit

// optional
var carName: String?
carName = nil
carName = "BMW"

var favoriteMovieStar: String? = nil
let num = Int("10")         // num의 타입은 int?


// Forced unwrapping > 억지로 박스 까기
print(carName)      // optional("BMW")
print(carName!)

//carName = nil
//print(carName!)     // nil 값인데 강제로 출력하려 하니 error


// Optional binding (if let) > 부드럽게 박스 까기 1
if let unwrappedCarName = carName{
    print(unwrappedCarName)
}
else{
    print("Car Name NONE")
}

// 1번은 Cyclomatic Complexity (함수의 복잡도) 를 올릴 수 있다.

func printParsedInt(from: String){
    if let parsedInt = Int(from){
        print(parsedInt)
    }
    else{
        print("Cannot convert to Int")
    }
}


// Optional binding (guard) > 부드럽게 박스 까기 2
func printParsedInt2(from: String){
    guard let parsedInt2 = Int(from)
    else{
        print("Cannot convert to Int")
        return
    }
    print(parsedInt2)
}

printParsedInt(from: "100")
printParsedInt(from: "Hello")


// Nile coalescing > 박스를 까봤더니, 값이 없으면 디폴트 값을 주기
let myCarName: String = carName ?? "Model 520d"         // 변수가 nil 값이면 ?? 뒤에 "__" 값이 default 로 만든다.
