package com.example.calculator.Level4

class CalculatorService(private val Calculator : AbstractOperation) {
    fun calculatorNotification() {
        println(Calculator.calculateNum())
    }
}