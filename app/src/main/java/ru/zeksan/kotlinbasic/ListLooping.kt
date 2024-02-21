package ru.zeksan.kotlinbasic

fun main() {
    val numbers = mutableListOf(3,6,9,12,15)
    for (index in 0 until numbers.size){
        numbers[index]*=2
    }
    println(numbers)
}