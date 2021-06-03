import UIKit

struct Lecture {
    var title: String
    var maxStudents: Int = 10
    var numOfRegistered: Int = 0
    
    func remainSeats() -> Int {
        let remainSeats = lec.maxStudents - lec.numOfRegistered
        return remainSeats
    }
    
    mutating func register() {          // Struct 내에서 func 정의시 변수를 변화시키는 func 일 경우 mutating 붙여줘야함
        // 등록된 학생 수 증가시키기
        numOfRegistered += 1
    }
    
    // Type Property, Method
    static let target: String = "Anybody want to learn something"
    static func 소속학원이름() -> String {
        return "Fast Campus"
    }
}

var lec = Lecture(title: "iOS Basic")

//func remainSeats(of lec: Lecture) -> Int {
//    let remainSeats = lec.maxStudents - lec.numOfRegistered
//    return remainSeats
//}

//remainSeats(of: lec)
lec.remainSeats()

lec.register()
lec.register()
lec.register()
lec.register()
lec.register()
lec.register()

lec.remainSeats()

Lecture.target
Lecture.소속학원이름()


// Extension
struct Math {
    static func abs(value: Int) -> Int {
        if value > 0 {
            return value
        }
        else {
            return -value
        }
    }
}

Math.abs(value: -20)

// 제곱, 반값
extension Math {
    static func square(value: Int) -> Int {
        return value * value
    }
    static func half(value: Int) -> Int {
        return value/2
    }
}

Math.square(value: 5)
Math.half(value: 20)

var value: Int = 3

extension Int {                // 이미 정의되어있는 Int에 extension
    func square() -> Int {
        return self * self
    }
    func half() -> Int {
        return self/2
    }
}
value.square()
value.half()
