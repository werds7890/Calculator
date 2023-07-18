package com.example.calculator.Level3

fun main() {
    println("연산할 숫자를 입력해주세요")
    val num = readLine()!!.toInt()

    println("연산자를 입력해주세요")
    val operate1=readLine()!!

    println("연산할 숫자를 입력해주세요")
    val num2 = readLine()!!.toInt()

    val add=AddOperation(num,num2).cal()
    val sub=SubstractOperation(num,num2).cal()
    val mul=MultiplyOperation(num,num2).cal()
    val div=DivideOperation(num,num2).cal()

    if(operate1=="+"){
        println("${num}${operate1}${num2}=${add}")
    }else if(operate1=="-"){
        println("${num}${operate1}${num2}=${sub}")
    }else if(operate1=="*"){
        println("${num}${operate1}${num2}=${mul}")
    }else if(operate1=="/"){
        println("${num}${operate1}${num2}=${div}")
    }else {
        println("연산자를 다시 입력해주세요.")
    }

}

open class Calculator (){

    open fun cal() :Int{
        return 0
    }

}

class AddOperation(num:Int,num2:Int) : Calculator() {
    var num=0
    var num2=0
    init {
        this.num=num
        this.num2=num2
    }
    override fun cal() :Int{
        return num+num2
    }
}

class SubstractOperation(num:Int,num2:Int) :Calculator(){
    var num=0
    var num2=0
    init {
        this.num=num
        this.num2=num2
    }
    override fun cal() :Int{
        return num-num2
    }
}

class MultiplyOperation(num:Int,num2:Int) : Calculator(){
    var num=0
    var num2=0
    init {
        this.num=num
        this.num2=num2
    }
    override fun cal() :Int{
        return num*num2
    }
}

class DivideOperation(num:Int,num2:Int) : Calculator(){
    var num=0
    var num2=0
    init {
        this.num=num
        this.num2=num2
    }
    override fun cal() :Int{
        return num/num2
    }
}