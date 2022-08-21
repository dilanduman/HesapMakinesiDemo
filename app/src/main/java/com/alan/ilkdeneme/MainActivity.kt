package com.alan.ilkdeneme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1: EditText = findViewById(R.id.editText1)
        val editText2: EditText = findViewById(R.id.editText2)
        val btnTopla: Button = findViewById(R.id.btnSum)
        val btnCikar:Button=findViewById(R.id.btnCikar)
        val textView: TextView = findViewById(R.id.textView5)

        btnTopla.setOnClickListener {
            val sayi1 = editText1.text.toString().toInt()
            val sayi2 = editText2.text.toString().toInt()
            val toplam = sayilariTopla(sayi1, sayi2)
            textView.text = "Sonuc: $toplam"
        }

        btnCikar.setOnClickListener {
            val sayi1=editText1.text.toString().toInt()
            val sayi2=editText2.text.toString().toInt()
            val cikar=sayilariCikar(sayi1,sayi2)
            textView.text="Sonuc: $cikar"
        }

    }

    private fun sayilariCikar(sayi1: Int, sayi2: Int): Any {
        return sayi1-sayi2
    }

    private fun sayilariTopla(sayi1: Int, sayi2: Int): Int {
        return sayi1 + sayi2
    }


}