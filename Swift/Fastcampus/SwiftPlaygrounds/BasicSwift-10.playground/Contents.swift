import UIKit

// 1
var myDic: [String: String] = ["name": "Jason", "job": "iOS Engineer", "city": "paju"]

// 2
myDic["city"] = "Busan"
myDic

// 3
func printNameAndCity(dic: [String: String]){
    if let name = dic["name"], let city = dic["city"]{
        print(name, city)
    }
    else{
        print("Cannot find")
    }
}

printNameAndCity(dic: myDic)
