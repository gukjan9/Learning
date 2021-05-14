import UIKit

// 1
let food: String? = "Chicken"

// 2
if let foodName = food{
    print(foodName)
}
else {
    print("No favorite food")
}

// 3
func printNickName(name: String?){
    guard let nickName = name
    else{
        print("make Nickname")
        return
    }
    print(nickName)
}

printNickName(name: "GukJang")


// nil or not
