package com.example.a201217

fun main() {
    helloWorld()

    println(add(4, 5))

    // 3. String Template

    val name = "GukJang"
    val lastname = "NASA"
    println("My name is $name $lastname I'm 24") // 변수 표시 $ 다음에 한 칸 띄우거나 {} 사용
    //${name + lastname}
    println("Is this true? ${1 == 0}")
    println("This is 2\$")      // escape \
    // 구문 선택 후 'ctrl + /' 하면 전체가 주석처리

    println(maxBy(1, 2))

    checkNum(1)

    forAndWhile()

    nullcheck()
}

// 1. 함수

fun helloWorld() {              // 리턴이 없을 때 ()뒤에 : Unit 쓰지만 안 써도 됌
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {       // 리턴 있으면 리턴 타입 지정해줘야 한다. 변수 보다 타입 먼저
    return a+b
}

// 2. val (= value) vs var

fun hi() {
    val a : Int = 10    // val cannot be reassigned
    var b : Int = 9

    b = 100             // 사용하지 않으면 회색으로 뜸

    val c = 100         // 타입 안 써줘도 자동으로 추론
    var name = "GukJang"
    var e : String      // 바로 할당 안하는 경우 타입 기재
}

// 4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if (a > b) return a
    else return b
}

fun maxBy2(a : Int, b : Int) = if(a > b) a else b       // 위에 maxBy 보다 간결하게

fun checkNum(score : Int) {
    when(score) {                               // Statement when
        0 -> println("This is 0")
        1 -> println("This is 1")
        2,3 -> println("This is 2 or 3")        // 2 또는 3이면
        else -> println("I don't know")         // 여기서는 else 안 써도됌
    }

    var b = when(score){                        // Expression when
        1 -> 1
        2 -> 2
        else -> 3              // 여기는 else 써야함
    }

    println("b = ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("Not bad")
        else -> println("Okay")
    }
}

// Expression vs Statement
// Kotlin에 모든 함수는 Expression : Unit을 리턴하기 때문
// Expression : ~해서 값을 반환하면
// Statement : 이렇게 해 (명령 지시)

// 5. Array and List
// Array는 정해진 사이즈가 있음
// 1. List 2. MutableList

fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = arrayOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)        // Array는 값을 변경할 수 있지만 List는 안되고 가져올 수 있음
                                        // MutableList는 가능

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)                   // List의 주소값이 바뀌는 것이 아니기 때문에 val 사용가능
    arrayList.add(20)
}

// 6. 반복문 - For / While

fun forAndWhile(){
    val students = arrayListOf("gukjang", "1", "2", "3")

    for(name in students){
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for(i in 1..10 step 2){         // step, in 10 downTo 1, 1 until 100 (1~99)
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcheck(){
    // NPE : NULL Pointer Exception

    var name : String = "GukJang"

    var nullName : String? = null       // ? 넣으면 Nullable이 됨, 타입 생략하면 안됨

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()       // ? 붙여줘야함
                                                                    // null이면 null 반환, 아니면 실행

    // ?: (엘비스 연산자)
    val lastName : String? = null // "GukJang"
    val fullName = name+" "+ (lastName?: "No lastName")      // null이면 No lastName 출력
                                                                    // 값이 있으면 그거("GukJang") 출력

    println(fullName)
}

// !! (null 값이 아니라고 컴파일러한테 알려주는 연산자)

fun ignireNulls(str:String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "domo1997@naver.com"
    email?.let{                            // null이 아니면 let 이하 실행
        println("My email is ${email}")
    }
}