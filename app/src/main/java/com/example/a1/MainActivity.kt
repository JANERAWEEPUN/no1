package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Pluss.setOnClickListener{
            var n1 = Num1.text.toString()
            var n2 = Num2.text.toString()
            if(n1 == "" || n2 == ""){
                Toast.makeText(getApplicationContext(),"Please Input all number",Toast.LENGTH_SHORT).show();
            } else {
                Process.setText("+")
                var rest = n1.toInt() + n2.toInt()
                Result.setText(rest.toString())
            }
        }
        Minus.setOnClickListener {
            var n1 = Num1.text.toString()
            var n2 = Num2.text.toString()
            if(n1 == "" || n2 == ""){
                Toast.makeText(getApplicationContext(),"Please Input all number",Toast.LENGTH_SHORT).show();
            } else {
                Process.setText("-")
                var rest = n1.toInt() - n2.toInt()
                Result.setText(rest.toString())
            }
        }
        Multiply.setOnClickListener {
            var n1 = Num1.text.toString()
            var n2 = Num2.text.toString()
            if(n1 == "" || n2 == ""){
                Toast.makeText(getApplicationContext(),"Please Input all number",Toast.LENGTH_SHORT).show();
            } else {
                Process.setText("*")
                var rest = n1.toInt() * n2.toInt()
                Result.setText(rest.toString())
            }
        }
        Divider.setOnClickListener{
            var n1 = Num1.text.toString()
            var n2 = Num2.text.toString()
            if(n1 == "" || n2 == ""){
                Toast.makeText(getApplicationContext(),"Please Input all number",Toast.LENGTH_SHORT).show();
            } else {
                Process.setText("/")
                var rest = n1.toInt() / n2.toInt()
                Result.setText(rest.toString())
            }
        }
        Modulo.setOnClickListener {
            var n1 = Num1.text.toString()
            var n2 = Num2.text.toString()
            if(n1 == "" || n2 == ""){
                Toast.makeText(getApplicationContext(),"Please Input all number",Toast.LENGTH_SHORT).show();
            } else {
                Process.setText("%")
                var rest = n1.toInt() % n2.toInt()
                Result.setText(rest.toString())
            }
        }
        Clear.setOnClickListener{
            Num1.setText("")
            Num2.setText("")
            Result.setText("")
        }
    }


}