import UIKit

class Person{
    var firstName: String
    var lastName: String
    
    init(fristName: String, lastName: String){
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
let jason = Student(firstname: "Jason", lastName: "Lee")
