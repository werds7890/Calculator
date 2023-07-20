package com.example.calculator.Level4

abstract class AbstractOperation() {
    abstract fun calculateNum() : String

    fun addDescription() {
        println("더하기 값 : ")
    }

    fun subDescription() {
        println("빼기 값 : ")
    }

    fun mulDescription() {
        println("곱하기 값 : ")
    }

    fun divDescription() {
        println("나누기 값 : ")
    }
}