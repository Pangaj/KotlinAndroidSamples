package com.shruthi.pangaj.kotlinsample.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.shruthi.pangaj.kotlinsample.R

class KSButtonClickActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ks_activity_button_click)

        var btnTest = findViewById(R.id.btn_test) as Button

        btnTest.setOnClickListener {
            Toast.makeText(applicationContext, R.string.clicked, Toast.LENGTH_SHORT).show()
        }
    }
}
