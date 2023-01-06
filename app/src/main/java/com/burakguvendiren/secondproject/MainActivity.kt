package com.burakguvendiren.secondproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j = 0

        if (j == 0) {
            ilkFonksiyon()
            }
            else {
            ikinciFonksiyon()
        }
        cikarma(x = 100, y = 20)
        val textView: TextView = findViewById(R.id.textView)

    }

    fun ilkFonksiyon() {
        println("ilk fonksiyon çalıştırıldı")
    }
    fun ikinciFonksiyon() {
        println("ikinci fonksiyon çalıştırıldı")
    }
        //Girdi Almak

    fun cikarma(x: Int, y:Int){
        textView.text = "Sonuç: ${x-y}"


    }
}