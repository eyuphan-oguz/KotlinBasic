package com.eyuphanoguz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.eyuphanoguz.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView;
    private lateinit var binding: ActivityMainBinding
    var sayi : Int=20;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





   // fun degistir(view:View){
    //    myTextView = findViewById(R.id.infoTextView) // myTextView değişkenini düzen dosyasındaki textView öğesiyle eşleştirin
    //    myTextView.text = "Merhaba Android"
    //    //myTextView.text="Merhaba Android";
       // println(myTextView.text);
    }

    //fun topla(x:Int , y:Int ):Int{
     //   myTextView = findViewById(R.id.infoTextView)
      //  myTextView.text = "${x+y}"
      //  println(myTextView.text)
    //    return x+y
  //  }


    //fun guncelle() : Int{
    //    val toplamaSonucu = topla(40,30)
        //myTextView = findViewById(R.id.textView)
        //myTextView.text="Sonuc: ${toplamaSonucu}"
        //binding.textView.text="Sonuc: ${toplamaSonucu}"
     //   return toplamaSonucu
   // }

    fun createHero(view:View){
        val isim = binding.nameText.text.toString()
        val yas = binding.ageText.text.toString()
        val meslek = binding.jobText.text.toString()

        binding.infoTextView.text="Name: ${isim}  Age: ${yas}  Job:${meslek}"
    }
}