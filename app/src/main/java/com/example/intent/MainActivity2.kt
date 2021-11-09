package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text = intent.getStringExtra("text")
        textView.text = text

        //Back other Activity

        button2.setOnClickListener {
            val otherActivity = Intent(this,MainActivity::class.java)
            startActivity(otherActivity)
        }







    }
}