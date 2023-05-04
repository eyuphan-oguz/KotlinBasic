package com.eyuphanoguz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun degistir(view:View){
        myTextView = findViewById(R.id.textView) // myTextView değişkenini düzen dosyasındaki textView öğesiyle eşleştirin
        myTextView.text = "Merhaba Android"
        //myTextView.text="Merhaba Android";
        println(myTextView.text);
    }
}