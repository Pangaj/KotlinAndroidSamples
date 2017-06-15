package com.shruthi.pangaj.kotlinsample.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.shruthi.pangaj.kotlinsample.R

class KSMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.shruthi.pangaj.kotlinsample.R.layout.activity_main)

        val btnButtonClicked = findViewById(R.id.btn_button_clicked) as android.widget.Button
        btnButtonClicked.setOnClickListener {
            val intent = Intent(this, KSButtonClickActivity::class.java)
            startActivity(intent)
        }

        val btnRecyclerViewSample = findViewById(R.id.btn_recycler_view) as android.widget.Button
        btnRecyclerViewSample.setOnClickListener {
            val intent = Intent(this, KSRecyclerViewActivity::class.java)
            startActivity(intent)
        }

        val btnRetrofit = findViewById(R.id.btn_retrofit) as Button
        btnRetrofit.setOnClickListener {
            val intent = Intent(this, KSRetrofitActivity::class.java)
            startActivity(intent)
        }
    }
}
