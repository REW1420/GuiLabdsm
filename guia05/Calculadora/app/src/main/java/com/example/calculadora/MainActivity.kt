package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val button=findViewById<Button>(R.id.button)

        val rbSuma = findViewById<RadioButton>(R.id.rbSumar)
        val rbResta = findViewById<RadioButton>(R.id.rbRestar)
        val rbMulti = findViewById<RadioButton>(R.id.rbMulti)
        val rbDivi = findViewById<RadioButton>(R.id.rbDivision)


        button.setOnClickListener{

            if (rbSuma.isChecked){
                tv1.text = "Resultado: ${et1.text.toString().toInt() + et2.text.
                toString().toInt()}"
            }; if (rbResta.isChecked) {
            tv1.text = "Resultado: ${et1.text.toString().toInt() - et2.text.
            toString().toInt()}"
            };if (rbMulti.isChecked){
            tv1.text = "Resultado: ${et1.text.toString().toInt() * et2.text.
            toString().toInt()}"
            };if (rbDivi.isChecked){
            tv1.text = "Resultado: ${et1.text.toString().toInt() / et2.text.
            toString().toInt()}"
            }




        }
        }
    }
