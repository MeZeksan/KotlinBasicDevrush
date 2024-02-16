package ru.zeksan.kotlinbasic
//классы данных хранят в себе исключительно информацию, в них не создают функции и тп
data class CoffeeDetails(
    val sugarCount:Int,
    val name: String,
    val size: String,
    val creamAmount: Int)



fun main() {

    val coffeeForBulat = CoffeeDetails(2,"Bulat","XL",2)
    makeCoffee(coffeeForBulat)
//    val myBook = Book()
//    println(myBook.title)
//    val deadSouls = Book("Dead Souls","Gogol",1835)
}

fun coffeeMachine(){
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()
}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount == 1){
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
    }
    else if(coffeeDetails.sugarCount == 0){
        println("Coffee with no sugar for ${coffeeDetails.name}and cream: ${coffeeDetails.creamAmount}")
    }
    else{
       println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}and cream: ${coffeeDetails.creamAmount}")
    }
}
