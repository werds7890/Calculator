package com.example.calculator.Level4

fun main() {
    println("연산할 숫자를 입력해주세요")
    val num = readLine()!!.toInt()

    println("연산자를 입력해주세요")
    val operate1=readLine()!!

    println("연산할 숫자를 입력해주세요")
    val num2 = readLine()!!.toInt()

    val add=AddOperation(num,num2)
    val sub=SubstractOperation(num,num2)
    val mul=MultiplyOperation(num,num2)
    val div=DivideOperation(num,num2)

   if(operate1=="+"){
       add.addDescription()
       println(add.calculateNum())
   }else if(operate1=="-"){
       sub.subDescription()
       println(sub.calculateNum())
   }else if(operate1=="*"){
       mul.mulDescription()
       println(mul.calculateNum())
   }else if(operate1=="/"){
       div.divDescription()
       println(div.calculateNum())
   }else {
       println("연산자를 다시 입력해주세요.")
   }

}