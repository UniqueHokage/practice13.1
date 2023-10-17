package com.example.practice131

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonClick(view: View) {
        val katet1: EditText = findViewById(R.id.editTextNumberDecimal)
        val katet2: EditText = findViewById(R.id.editTextNumberDecimal2)

        val ress1: TextView = findViewById(R.id.textView2)
        val ress2: TextView = findViewById(R.id.textView3)
        val ress3: TextView = findViewById(R.id.textView4)
        val res1: Double
        val res2: Double
        val res3: Double

        if (katet1.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast1, Toast.LENGTH_SHORT)
            toast.show()
            katet1.requestFocus()

        }
        else if (katet2.text.toString() == "") {
            val toast: Toast = Toast.makeText(baseContext, R.string.toast2, Toast.LENGTH_SHORT)
            toast.show()
            katet2.requestFocus()
        }
        else if (katet1.text.toString() == "0" || katet2.text.toString() == "0")
        {val toast: Toast = Toast.makeText(baseContext, R.string.toast3, Toast.LENGTH_SHORT)
            toast.show()}
        else {
            res1 = round((Math.sqrt(Math.pow(katet1.text.toString().toDouble(), 2.0) + Math.pow(katet1.text.toString().toDouble(), 2.0))) * 100) / 100
            ress1.text =
                if (res1.toInt().toDouble() == res1) res1.toInt().toString()
                else res1.toString()
            res2 = round ((res1 + katet2.text.toString().toDouble() + katet2.text.toString().toDouble() )* 100) / 100
            ress2.text =
                if (res2.toInt().toDouble() == res2) res2.toInt().toString()
                else res2.toString()
            res3 = round ((katet1.text.toString().toDouble() * katet2.text.toString().toDouble() / 2) * 100) / 100
            ress3.text =
                if (res3.toInt().toDouble() == res3) res3.toInt().toString()
                else res3.toString()
        }
    }
}