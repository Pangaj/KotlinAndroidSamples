package com.shruthi.pangaj.kotlinsample.activities

/**
 * Created by Pan on 5/31/2017.
 */

class KSRecyclerViewActivity : android.support.v7.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?, persistentState: android.os.PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(com.shruthi.pangaj.kotlinsample.R.layout.ks_activity_recycler_view)

        val rvItems = findViewById(com.shruthi.pangaj.kotlinsample.R.id.rv_items) as android.support.v7.widget.RecyclerView


    }
}