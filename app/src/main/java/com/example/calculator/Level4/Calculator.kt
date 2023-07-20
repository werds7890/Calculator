package com.example.calculator.Level4

class AddOperation(val num : Int, val num2 : Int) : AbstractOperation(){
    override fun calculateNum(): String {
        return "${num}+${num2}=${num+num2}"
    }
}

class SubstractOperation(val num : Int, val num2 : Int) : AbstractOperation() {
    override fun calculateNum(): String {
        return "${num}-${num2}=${num-num2}"
    }
}

class MultiplyOperation(val num : Int, val num2 : Int)  : AbstractOperation()  {
    override fun calculateNum(): String {
        return "${num}*${num2}=${num*num2}"
    }
}

class DivideOperation(val num : Int, val num2 : Int)  : AbstractOperation()  {
    override fun calculateNum(): String {
        return "${num}/${num2}=${num/num2}"
    }
}