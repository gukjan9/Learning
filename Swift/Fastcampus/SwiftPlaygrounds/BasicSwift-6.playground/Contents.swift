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

// Optional binding (guard) > 부드럽게 박스 까기 2
// Nile coalescing > 박스를 까봤더니, 값이 없으면 디폴트 값을 주기
