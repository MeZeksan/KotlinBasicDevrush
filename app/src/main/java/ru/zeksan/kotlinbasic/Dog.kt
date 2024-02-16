package ru.zeksan.kotlinbasic

class Dog constructor(
    val name:String,
    val breed: String,
    var age: Int = 0
    ){
    init{
        bark()
    }
    fun bark(){
        println("$name WOOOOOOF")
    }
}