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

        val sayi1:EditText=findViewById(R.id.editText1)
        val sayi2:EditText=findViewById(R.id.editText2)
        val btnHesapla:Button=findViewById(R.id.btnHesapla)
        val sonuc:TextView=findViewById(R.id.textView5)

        btnHesapla.setOnClickListener {

        }

    }
}