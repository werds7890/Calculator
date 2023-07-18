package com.example.calculator.Level3Practice



class Calculator {
    fun addOperation(add:AddOperation,num:Int,num2:Int): Double {
        return add.operate(num,num2)
    }
    fun subOperation(sub:SubOperation,num:Int,num2:Int): Double {
        return sub.operate(num,num2)
    }
}