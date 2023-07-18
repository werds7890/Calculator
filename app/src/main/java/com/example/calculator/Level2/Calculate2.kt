package com.example.calculator.Level2

fun main() {
    println("숫자를 입력해주세요")
    var num = readLine()!!.toInt()

    println("연산자를 입력해주세요")
    var operate1=readLine()!!

    println("연산할 숫자를 입력해주세요")
    var num2 = readLine()!!.toInt()

    Calculator().cal(num,num2,operate1)
}

class Calculator (){
    fun cal(number:Int,number2:Int,operate:String){
        if(operate=="+") {
            println("${number}${operate}${number2}=${number+number2}") //덧셈
        }else if(operate=="-") {
            println("${number}${operate}${number2}=${number-number2}") //뺄셈
        }else if(operate=="*") {
            println("${number}${operate}${number2}=${number*number2}") //곱셈
        }else if(operate=="/") {
            println("${number}${operate}${number2}=${number/number2}") //나눈 몫
        }else if(operate=="%"){
            println("${number}${operate}${number2}=${number%number2}") //나눈 이후 나머지
        }
    }
}