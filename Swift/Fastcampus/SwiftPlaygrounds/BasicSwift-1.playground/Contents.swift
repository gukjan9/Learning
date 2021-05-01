import UIKit

var greeting = "Hello, playground"

let value = arc4random_uniform(100)
print("--> \(value)")


// Tuple
let coordinates = (4, 6)

let x = coordinates.0
let y = coordinates.1


let coordinatesNamed = (x: 2, y: 3)

let x2 = coordinatesNamed.x
let y2 = coordinatesNamed.y

let (x3, y3) = coordinatesNamed
x3
y3


// Boolean
let yes = true
let no = false


let isFourGreaterThanFive = 4 > 5       // false

if isFourGreaterThanFive {
    print("--> True")
}
else {
    print("--> False")
}


let a = 5
let b = 10

if a > b{
    print("--> a is bigger")
}
else{
    print("--> b is bigger")
}


let name1 = "Jin"
let name2 = "Jason"

let isTwoNameSame = name1 == name2

if isTwoNameSame{
    print("--> Same")
}
else{
    print("--> Different")
}


// 논리
let isJason = name2 == "Jason"
let isMale = false

let jasonAndMale = isJason && isMale
let jasonOrMale = isJason || isMale

//let greetingMessage: String
//if isJason{
//    greetingMessage = "Hello Jason"
//}
//else{
//    greetingMessage = "Hello Somebody"
//}
//print("Msg: \(greetingMessage)")

// 삼항 연산자
let greetingMessage: String = isJason ? "Hello Jason" : "Hello Somebody"
print("Msg: \(greetingMessage)")


// Scope
var hours = 50
let payPerHour = 10000
var salary = 0

if hours > 40{
    let extraHours = hours - 40
    salary += extraHours * payPerHour * 2
    hours -= extraHours
}

salary += hours * payPerHour
