import UIKit

struct Grade {
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

class Student: Person{
    var grades: [Grade] = []
}

let jay = Person(firstName: "Jay", lastName: "Lee")
let jason = Student(firstName: "Jason", lastName: "Lee")

let math = Grade(letter: "B", points: 8.5, credits: 3)
let history = Grade(letter: "A", points: 10.0, credits: 3)

jason.grades.append(math)
jason.grades.append(history)

jason.grades.count



// 학생인데 운동 선수
class StudentAthelete: Student{
    var minimumTrainingTime: Int = 2
    var trainedTime: Int = 0
    
    func train(){
        trainedTime += 1
    }
}

// 운동 선수인데 축구 선수
class FootballPlayer: StudentAthelete {
    var footballTeam = "FC Swift"
    
    override func train(){
        trainedTime += 2
    }
}

// Person > Student > Athelete > Football Player

var athelete1 = StudentAthelete(firstName: "Yuna", lastName: "Kim")
var athelete2 = FootballPlayer(firstName: "Heung", lastName: "Son")

athelete1.firstName
athelete2.firstName

athelete1.grades.append(math)
athelete2.grades.append(math)

athelete1.minimumTrainingTime
athelete2.minimumTrainingTime

// athelete1.FootballPlayer
athelete2.footballTeam

athelete1.train()
athelete1.trainedTime

athelete2.train()
athelete2.trainedTime

athelete1 = athelete2 as StudentAthelete        // uppercasting
athelete1.train()
athelete1.trainedTime

// athelete1.FootballPlayer // uppercasting 됐지만 접근 불가

if let son = athelete1 as? FootballPlayer {
    print("--> team:\(son.footballTeam)")
}

