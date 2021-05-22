import UIKit

/*
 {(param) -> return type in
    statement
    ...
 }
 */

// Example 1: Simple Closure
let simpleClosure = {
    
}
simpleClosure()


// Example 2: 코드블록을 구현한 Closure
let simpleClosure2 = {
    print("Hello, Closure")
}
simpleClosure2()


// Example 3: 인풋 파라미터를 받는 Closure
let simpleClosure3: (String) -> Void = { name in
    print("Hello, Closure. My name is \(name)!")
}
simpleClosure3("GukJang")


// Example 4: 값을 리턴하는 Closure
let simpleClosure4: (String) -> (String) = { name in
    let message = "iOS, \(name)!"
    return message
}
let result = simpleClosure4("GukJang")
print(result)


// Example 5: Closure를 파라미터로 받는 함수 구현
func someSimpleFunction(simpleClosure5: () -> Void){
    print("Call by Function")
    simpleClosure5()
}
someSimpleFunction(simpleClosure5: {
  print("Hello from Closure")
})


// Example 6: Trailing Closure
func someSimpleFunction2(message: String, simpleClosure6: () -> Void){
    print("Call by Function, message is \(message)")
    simpleClosure6()
}

someSimpleFunction2(message: "Hi", simpleClosure6: {
    print("Hello GukJang from closure")
})

// 맨끝에가 Closure인 경우 생략 가능
someSimpleFunction2(message: "Hi") {
    print("Hello GukJang from closure")
}
