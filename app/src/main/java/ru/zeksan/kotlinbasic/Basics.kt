package ru.zeksan.kotlinbasic




fun main() {
    //Неизменяемый список
    //val shoppingList = listOf("Processor","RAM","Graphics card","RAM")
    //изменяемый список
    val shoppingList = mutableListOf("Processor","RAM","Graphics card RTX 3060","RAM")
    shoppingList.add("Cooling System")
    //то же самое, как использовать метод set
    shoppingList[2] ="Graphic card RTX 4090"
    println(shoppingList[2])
    shoppingList.remove("RAM")

    val hasRam = shoppingList.contains("RAM")
    if(hasRam){
        println("Has RAM in the list")
    }
    else{
        println("Adding Ram in the list")
        shoppingList.add("RAM")
    }
    println(shoppingList)


    for(index in 0 until shoppingList.size){
        println("item ${shoppingList[index]} is at index $index")
    }
}













//data class CoffeeDetails(
//    val sugarCount:Int,
//    val name: String,
//    val size: String,
//    val creamAmount: Int)

//val coffeeForBulat = CoffeeDetails(2,"Bulat","XL",2)
//    makeCoffee(coffeeForBulat)
////    val myBook = Book()
////    println(myBook.title)
////    val deadSouls = Book("Dead Souls","Gogol",1835)




/*
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
*/