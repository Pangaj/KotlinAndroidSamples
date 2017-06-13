package com.shruthi.pangaj.kotlinsample.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.shruthi.pangaj.kotlinsample.R

class KSButtonClickActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ks_activity_button_click)

        val btnSubmit = findViewById(R.id.btn_submit) as Button
        val etText = findViewById(R.id.et_text) as EditText
        val tvText = findViewById(R.id.tv_text) as TextView

        btnSubmit.setOnClickListener {
            if (etText.text.isEmpty()) {
                Toast.makeText(applicationContext, getString(R.string.is_empty), Toast.LENGTH_SHORT).show()
            } else if (etText.text.isBlank()) {
                Toast.makeText(applicationContext, getString(R.string.contains_blank_spaces), Toast.LENGTH_SHORT).show()
                tvText.text = null
            } else if (etText.text.isNotBlank()) {
                tvText.text = etText.text
            }
        }
    }
}
