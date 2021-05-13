import UIKit

// 1
func printFullname(last : String, first : String){
    print("\(last) \(first)")
}
printFullname(last: "Kim", first: "KyeongYoon")

// 2
func printFullnameWithoutParam(_ last : String, _ first : String){
    print("\(last) \(first)")
}
printFullnameWithoutParam("Kim", "KyeongYoon")

// 3
func insFullname(_ last : String, _ first : String) -> String {
    return "\(last) \(first)"
}
print(insFullname("Kim", "KyeongYoon"))
