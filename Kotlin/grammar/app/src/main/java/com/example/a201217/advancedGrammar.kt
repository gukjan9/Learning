package com.example.a201217

// 1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명 함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name : String, age : Int ->          // 람다함수는 맨마지막이 return
    "My name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("GukJang", 24))

    val a = "GukJang said"
    val b = "Windows said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("araiana", 27))
    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    invokeLamda{it > 3.22}                          // 마지막이 람다식이면 생략 가능
}
// 2. 확장 함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String{
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 3. 람다의 Return

var calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"                             // 안해주면 에러
    }
}

// 4. 람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean{
    return lamda(5.2343)
}