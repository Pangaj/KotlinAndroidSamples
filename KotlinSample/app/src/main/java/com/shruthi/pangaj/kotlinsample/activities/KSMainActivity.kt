package com.shruthi.pangaj.kotlinsample.activities

class KSMainActivity : android.support.v7.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.shruthi.pangaj.kotlinsample.R.layout.activity_main)

        val btnButtonClicked = findViewById(com.shruthi.pangaj.kotlinsample.R.id.btn_button_clicked) as android.widget.Button

        btnButtonClicked.setOnClickListener {
            val intent = android.content.Intent(this, KSButtonClickActivity::class.java)
            startActivity(intent)
        }

        val btnRecyclerViewSample = findViewById(com.shruthi.pangaj.kotlinsample.R.id.btn_recycler_view) as android.widget.Button

        btnRecyclerViewSample.setOnClickListener {
            val intent = android.content.Intent(this, KSRecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}
