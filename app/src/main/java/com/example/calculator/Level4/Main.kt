package com.example.calculator.Level4

fun main() {
    println("연산할 숫자를 입력해주세요")
    val num = readLine()!!.toInt()

    println("연산자를 입력해주세요")
    val operate1=readLine()!!

    println("연산할 숫자를 입력해주세요")
    val num2 = readLine()!!.toInt()

    val addResult=CalculatorService(AddOperation(num,num2))
    val subResult=CalculatorService(SubstractOperation(num,num2))
    val multiplyResult=CalculatorService(MultiplyOperation(num,num2))
    val divideResult=CalculatorService(DivideOperation(num,num2))

    when(operate1) {
        "+" -> addResult.calculatorNotification()
        "-" -> subResult.calculatorNotification()
        "*" -> multiplyResult.calculatorNotification()
        "/" -> divideResult.calculatorNotification()
        else -> "연산자를 다시 입력해주세요."
    }



}