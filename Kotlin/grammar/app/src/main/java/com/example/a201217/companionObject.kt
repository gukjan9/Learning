package com.example.a201217

class Book private constructor(val id : Int, val name : String){
    companion object BookFactory : IdProvider{                  // private property나 method를 불러올 수 있게끔
                                        // Java의 static
        override fun getId() : Int{
           return 444
                                        }
        val myBook = "new book"

        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}