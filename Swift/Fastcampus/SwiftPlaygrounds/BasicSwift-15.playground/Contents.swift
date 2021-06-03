import UIKit

// 도전과제
// 1. 강의 이름, 강사 이름, 학생 수를 가지는 Struct 만들기 (Lecture)
// 2. 강의 Array와 강사 이름을 받아서, 해당 강사의 강의 이름을 출력하는 함수 만들기
// 3. 강의 3개를 만들고 강사 이름으로 강의 찾기

struct Lecture {
    let name: String
    let instructor : String
    let numOfStudent : Int
}

func printLectureName(from instructor: String, lectures: [Lecture]){
//    <Struct>
//    var lectureName = ""
//
//    for lecture in lectures {                       // for i in range
//        if instructor == lecture.instructor{
//            lectureName = lecture.name
//        }
//    }
    
    // Closure
    let lectureName = lectures
        .first{(lec) -> Bool in
        return lec.instructor == instructor
        }?.name ?? ""
    
    // == let lectureName = lectures.first{ $0.instructor == instructor }?.name ?? ""
    
    print("그 강사님 강의는요: \(lectureName)")
}

let lec1 = Lecture(name: "iOS Basic", instructor: "Jason", numOfStudent: 5)
let lec2 = Lecture(name: "iOS Advanced", instructor: "Jack", numOfStudent: 5)
let lec3 = Lecture(name: "iOS Pro", instructor: "Jim", numOfStudent: 5)
let lectures = [lec1, lec2, lec3]

printLectureName(from: "Jason", lectures: lectures)
