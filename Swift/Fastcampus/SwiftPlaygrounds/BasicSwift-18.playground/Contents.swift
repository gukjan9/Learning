import UIKit

struct PersonStruct{
    var firstName: String
    var lastName: String
    
    init(firstName: String, lastName: String){
        self.firstName = firstName
        self.lastName = lastName
    }
    
    var fullName: String{
        return "\(firstName) \(lastName)"
    }
    
    mutating func uppercaseName(){
        firstName = firstName.uppercased()
        lastName = lastName.uppercased()
    }
}

class PersonClass {
    var firstName: String
    var lastName: String
    
    // 값이 설정 안돼있어서 init
    init(firstName: String, lastName: String){
        self.firstName = firstName
        self.lastName = lastName
    }
    
    var fullName: String{
        return "\(firstName) \(lastName)"
    }
    
    func uppercaseName(){
        firstName = firstName.uppercased()
        lastName = lastName.uppercased()
    }
}

var personStruct1 = PersonStruct(firstName: "Jason", lastName: "Lee")
var personStruct2 = personStruct1

var personClass1 = PersonClass(firstName: "Jason", lastName: "Lee")
var personClass2 = personClass1


personStruct2.firstName = "Jay"
personStruct1.firstName
personStruct2.firstName

personClass2.firstName = "Jay"
personClass1.firstName
personClass2.firstName


personClass2 = PersonClass(firstName: "Bob", lastName: "Lee")
personClass1.firstName
personClass2.firstName

personClass1 = personClass2
personClass1.firstName
personClass2.firstName


// Struct - 1. 두 object를 "같다", "다르다"로 비교해야 하는 경우
//          2. Copy된 각 객체들이 독립적인 상태를 가져야 하는 경우
//          3. 코드에서 object의 데이터를 여러 스레드에 걸쳐 사용할 경우

// Class - 1. 두 object의 인스턴스 자체가 같음을 확인해야 할 때
//         2. 하나의 객체가 필요하고, 여러 대상에 의해 접근되고 변경이 필요한 경우
