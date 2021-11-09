package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button1)
        val textView:TextView = findViewById(R.id.editTextTextPersonName)


        //Go other activity...


        button.setOnClickListener {
            val otherActivity = Intent(this,MainActivity2::class.java)
            otherActivity.putExtra("text",textView.text.toString())
            startActivity(otherActivity)
            }



    }
}