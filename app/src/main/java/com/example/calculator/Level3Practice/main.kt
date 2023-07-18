package com.example.calculator.Level3Practice



fun main() {
    val calc = Calculator()
    println("1 더하기 2 결과는 : ${calc.addOperation(AddOperation(), 1, 2)} 입니다")
    println("1 빼기 2 결과는 : ${calc.subOperation(SubOperation(), 1, 2)} 입니다")
}