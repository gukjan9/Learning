package com.example.a201217

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("KoreanAir", "GukJang", "2020-12-18", 14)
    val ticketB = TicketNormal("KoreanAir", "GukJang", "2020-12-18", 14)

    println(ticketA)                // 위에 그대로 출력
    println(ticketB)                // 데이터 주소값 출력
}