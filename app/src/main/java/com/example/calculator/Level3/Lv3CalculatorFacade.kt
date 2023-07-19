package com.example.calculator.Level3

class CalculatorFacade {
    var receiveNum:Int=0
    var receiveNum2:Int=0
    var receiveOperate:String=""

    constructor(num:Int,num2:Int,operate:String)  {
       this.receiveNum=num
       this.receiveNum2=num2
       this.receiveOperate=operate
   }

    fun calculatorBefore() {
        val cal=Lv3Calculator()

        val add=cal.addCal(receiveNum,receiveNum2)
        val sub=cal.subCal(receiveNum,receiveNum2)
        val mul=cal.mulCal(receiveNum,receiveNum2)
        val div=cal.divCal(receiveNum,receiveNum2)

        if(receiveOperate=="+"){
            println("${receiveNum}+${receiveNum2}=${add}")
        }else if(receiveOperate=="-"){
            println("${receiveNum}-${receiveNum2}=${sub}")
        }else if(receiveOperate=="*"){
            println("${receiveNum}*${receiveNum2}=${mul}")
        }else if(receiveOperate=="/"){
            println("${receiveNum}/${receiveNum2}=${div}")
        }else {
            println("연산자를 다시 입력해주세요.")
        }
    }

}