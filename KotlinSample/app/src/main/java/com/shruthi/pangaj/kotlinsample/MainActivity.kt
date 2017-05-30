package com.shruthi.pangaj.kotlinsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnButtonClicked = findViewById(R.id.btn_button_clicked) as Button

        btnButtonClicked.setOnClickListener {
            val intent = Intent(this, KSButtonClick::class.java)
            startActivity(intent)
        }
    }
}
