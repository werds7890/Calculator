package com.example.calculator.Level3

class Lv3Calculator() {
    fun addCal(num:Int, num2:Int) : Int{
        return AddOperation().operate(num,num2)
    }

    fun subCal(num:Int, num2:Int) : Int{
        return SubOperation().operate(num,num2)
    }

    fun mulCal(num:Int, num2:Int) : Int{
        return MulOperation().operate(num,num2)
    }

    fun divCal(num:Int, num2:Int) : Int{
        return DivOperation().operate(num,num2)
    }
}