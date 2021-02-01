package com.example.a201217

// 클래스는 final

open class Human /* constructor */(val name : String = "Anonymous"){         // default 값

    constructor(name : String, age : Int) : this(name){             // 부생성자는 주생성자를 위임받아야한다. : this(name)
        println("My name is ${name}, ${age}years old")              // property와 생성자를 한번에 사용 가능
    }

    init{                                                           // 부생성자가 위에 많아도 init 먼저 실행
        println("New human has been born !!")
    }

    fun eatingCake(){
        println("This is so delicious")
    }

    open fun singASong(){                           // 상속 클래스에서 override 하려면 open이 붙어야함
        println("lalala")
    }
}

class Korean : Human(){ // 상속
    override fun singASong(){
        super.singASong()                           // lalala 출력, super
        println("랄랄라")
        println("My name is : ${name}") // = Anonymous
                                        // Korean에 parameter가 없어서 default 값 받아온거임
    }

}





fun main(){
    val human = Human("GukJang")
    val stranger = Human()                      // default 값 주면 string 안써도 에러 안남
    human.eatingCake()

    val mom = Human("Mom", 52)

    println("This human's name is ${human.name}")
    println("This human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}