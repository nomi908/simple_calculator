package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.concurrent.atomic.DoubleAccumulator

class MainActivity : AppCompatActivity() {
    var userinput:TextView?=null
    var result: TextView?=null
    var btn0:Button?=null
    var btn1:Button?=null
    var btn2:Button?=null
    var btn3:Button?=null
    var btn4:Button?=null
    var btn5:Button?=null
    var btn6:Button?=null
    var btn7:Button?=null
    var btn8:Button?=null
    var btn9:Button?=null
    var btn00:Button?=null
    var oneback:Button?=null
    var cls:Button?=null
    var btnadd:Button?=null
    var btnsubtract:Button?=null
    var btnmultiply:Button?=null
    var btndivide:Button?=null
    var btnpercentage:Button?=null
    var btnequal:Button?=null
    var value1:String =""
    var operator = ""
    var value2 = ""
    var firstNumber = ""



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userinput = findViewById(R.id.userinput)
        result = findViewById(R.id.result)
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn00 = findViewById(R.id.btn00)
        oneback = findViewById(R.id.oneback)
        cls = findViewById(R.id.cls)
        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmultiply = findViewById(R.id.btnmultiply)
        btndivide = findViewById(R.id.btndivide)
        btnpercentage = findViewById(R.id.btnpercentage)
        btnequal = findViewById(R.id.btnequal)
        btn0!!.setOnClickListener {
            value1 = (value1.toString() + "0")
            userinput!!.setText(value1.toString())


        }
        btn1!!.setOnClickListener {
            value1 = value1 + "1"
            userinput!!.setText(value1)
        }
        btn2!!.setOnClickListener {
            value1 = value1 + "2"
            userinput!!.setText(value1)
        }
        btn3!!.setOnClickListener {
            value1 = value1 + "3"
            userinput!!.setText(value1)
        }
        btn4!!.setOnClickListener {
            value1 = value1 + "4"
            userinput!!.setText(value1)
        }
        btn5!!.setOnClickListener {
            value1 = value1 + "5"
            userinput!!.setText(value1)
        }
        btn6!!.setOnClickListener {
            value1 = value1 + "6"
            userinput!!.setText(value1)
        }
        btn7!!.setOnClickListener {
            value1 = value1 + "7"
            userinput!!.setText(value1)
        }
        btn8!!.setOnClickListener {
            value1 = value1 + "8"
            userinput!!.setText(value1)
        }
        btn9!!.setOnClickListener {
            value1 = value1 + "9"
            userinput!!.setText(value1)
        }
        btn00!!.setOnClickListener {
            value1 = value1 + "00"
            userinput!!.setText(value1)
        }
        btnadd!!.setOnClickListener {
            value1 = ""
            firstNumber = userinput!!.text.toString()
            userinput!!.setText("")
            operator = "+"
        }
        btnsubtract!!.setOnClickListener {
            value1 = ""
            firstNumber = userinput!!.text.toString()
            operator = "-"
        }
        btndivide!!.setOnClickListener {
            value1 = ""
            firstNumber = userinput!!.text.toString()
            operator = "÷"

        }
        btnmultiply!!.setOnClickListener(){
            value1 = ""
            firstNumber = userinput!!.text.toString()
            operator = "*"
        }
        btnpercentage!!.setOnClickListener(){
            if (userinput!!.text.toString().isEmpty()){
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
            }else {
                value1 = ""
                firstNumber = userinput!!.text.toString()
                operator = "%"
                val firstNo = firstNumber.toDouble() / 100
                result!!.setText(firstNo.toString())

            }




        }
        btnequal!!.setOnClickListener {
            value2 = userinput!!.text.toString()

            if (value2.isEmpty()){
                Toast.makeText(this, "Enter second no", Toast.LENGTH_SHORT).show()
            }else{
                if (operator.equals("+")) {
                    val res: Double = firstNumber.toDouble() + value2.toDouble()
                    result!!.setText(res.toString())

                } else if (operator == "-") {
                    val sub: Double = firstNumber.toDouble() - value2.toDouble()
                    result!!.setText(sub.toString())
                } else if (operator == "÷") {
                    val divde: Double = firstNumber.toDouble() / value2.toDouble()
                    result!!.setText(divde.toString())
                } else if (operator == "*"){
                    val multiply = firstNumber.toDouble() * value2.toDouble()
                    result!!.setText(multiply.toString())
                }

            }




        }

        cls!!.setOnClickListener {
            userinput!!.text.isNotEmpty()
            userinput!!.setText("")
            result!!.setText("")
            value1 = ""
            firstNumber = ""
            value2 = ""

        }
        oneback!!.setOnClickListener {
            if (userinput!!.text.isNotEmpty()) {
            val currenttext = userinput!!.text.dropLast(1)
                userinput!!.text = currenttext

                value1 = userinput!!.text.toString().dropLast(1)
            }

        }

        }
    }



