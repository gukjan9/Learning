import UIKit

//struct Grade{
//    var letter: Character
//    var points: Double
//    var credits: Double
//}
//
//class Person{
//    var firstName: String
//    var lastName: String
//
//    init(firstName: String, lastName: String){
//        self.firstName = firstName
//        self.lastName = lastName
//    }
//
//    func printMyName(){
//        print("My name is \(firstName) \(lastName)")
//    }
//}
//
//// 학생인데 운동선수
//class Student: Person{
//    var grades: [Grade] = []
//}
//
//class StudentAthlete: Student {
//    var minimumTrainingTime: Int = 2
//    var trainedTime: Int = 0
//
//    func train(){
//        trainedTime += 1
//    }
//}
//
//// 운동선수인데 축구선수
//class FootballPlayer: StudentAthlete{
//    var footballTeam = "FC Swift"
//
//    override func train(){
//        trainedTime += 2
//    }
//}


struct Grade{
    var letter: Character
    var points: Double
    var credits: Double
}

class Person{
    var firstName: String
    var lastName: String
    
    init(firstName: String, lastName: String){
        self.firstName = firstName
        self.lastName = lastName
    }
    
    func printMyName(){
        print("My name is \(firstName) \(lastName)")
    }
}

// 학생인데 운동선수
class Student: Person{
    var grades: [Grade] = []
}

class StudentAthlete: Student {
    var minimumTrainingTime: Int = 2
    var trainedTime: Int = 0
    var sports: [String]
    
    init(firstName: String, lastName: String, sports: [String]){
        // Phase 1
        self.sports = sports
        super.init(firstName: firstName, lastName: lastName)
        
        // Phase 2
        self.train()
    }
    
    func train(){
        trainedTime += 1
    }
}

// 운동선수인데 축구선수
class FootballPlayer: StudentAthlete{
    var footballTeam = "FC Swift"
    
    override func train(){
        trainedTime += 2
    }
}

let student1 = Student(firstName: "Jason", lastName: "Lee")
let student2 = StudentAthlete(firstName: "Jay", lastName: "Lee", sports: ["Football"])
