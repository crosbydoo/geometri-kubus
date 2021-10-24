package com.example.geometrikubus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        geometrikubus()
    }

    @SuppressLint("SetTextI18n")
    private fun geometrikubus(){
        val inputangka = findViewById<EditText>(R.id.et_input)

        val luas            = findViewById<Button>(R.id.btn_luas)
        val result_luas     = findViewById<TextView>(R.id.result_luas)
        val volume          = findViewById<Button>(R.id.btn_volume)
        val result_volume   = findViewById<TextView>(R.id.result_volume)

        volume.setOnClickListener{

            val sisi = inputangka.text.toString()

            var empty = false
            if (sisi.isEmpty()){
                empty = true
                inputangka.error = "Field can't be empty"
            }
            if (!empty){

                val hitung_volume  = sisi.toDouble() * sisi.toDouble() * sisi.toDouble()
                result_volume.text = "Volume Kubus: $hitung_volume"
            }
        }

        luas.setOnClickListener{

            val sisi = inputangka.text.toString()

            var empty = false
            if (sisi.isEmpty()){
                empty = true
                inputangka.error = "Field can't be empty"
            }
            if (!empty){

                val hitung_luas    = 6 * sisi.toDouble() * sisi.toDouble()
                result_luas.text   = "Luas Kubus: $hitung_luas"
            }
        }
    }
}