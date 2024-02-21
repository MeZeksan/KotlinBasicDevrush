package ru.zeksan.kotlinbasic

fun main() {
    val fruitsList = mutableListOf("Orange","Apple","Grape","DragonFruit","Mango")
    println(fruitsList)
    fruitsList.add("Pear")
    println(fruitsList)
    fruitsList.remove("Mango")
    println(fruitsList)

    val hasFruit = if(fruitsList.contains("DragonFruit")) "Has Dragon Fruit"
                            else "Hasn't DragonFruit:("
    println(hasFruit)
}