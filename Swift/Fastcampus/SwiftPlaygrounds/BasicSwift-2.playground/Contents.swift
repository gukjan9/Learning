import UIKit
import Foundation   // 근본

// While

//var i = 0
//while i < 10 {
//    print(i)
//    i += 1
//}

print("--- While")
var i = 10
while i < 10 {
    print(i)
    
    if i == 5 {
        break
    }
    i += 1
}

print("--- Repeat")
i = 10
repeat {
    print(i)
    i += 1
} while i < 10

// While
// 조건 -> 코드수행

// Repeat
// 코드수행 -> 조건


// For Loop
let closedRange = 0...10
let halfClosedRange = 0..<10

var sum = 0
for i in halfClosedRange{
    print("---> \(i)")
    sum += i
}

print("---> total sum: \(sum)")

var sinValue: CGFloat = 0
for i in closedRange {
    sinValue = sin(CGFloat.pi/4 * CGFloat(i))
}

let name = "Jason"
for i in closedRange {              // _ 로 대체 가능 (코드에서 사용되지 않았기 때문)
    print("--> name : \(name)")
}

for i in closedRange{
    if i % 2 == 0 {
        print("--> 짝수 : \(i)")
    }
}

// 위랑 같음
for i in closedRange where i % 2 == 0 {
    print("--> 짝수 : \(i)")
}


for i in closedRange {
    if i == 3 {
        continue
    }
    print("--> \(i)")
}

for i in closedRange {
    for j in closedRange {
        print("gugu -> \(i) * \(j) = \(i * j)")
    }
}

