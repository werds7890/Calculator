package com.example.calculator.Level3

fun main() {
    println("연산할 숫자를 입력해주세요")
    val num = readLine()!!.toInt()

    println("연산자를 입력해주세요")
    val operate1=readLine()!!

    println("연산할 숫자를 입력해주세요")
    val num2 = readLine()!!.toInt()

    val cal=Lv3Calculator()

    val add=cal.addCal(num,num2)
    val sub=cal.subCal(num,num2)
    val mul=cal.mulCal(num,num2)
    val div=cal.divCal(num,num2)

    if(operate1=="+"){
        println(add)
    }else if(operate1=="-"){
        println(sub)
    }else if(operate1=="*"){
        println(mul)
    }else if(operate1=="/"){
        println(div)
    }else {
        println("연산자를 다시 입력해주세요.")
    }

}



