package com.shruthi.pangaj.kotlinsample.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.shruthi.pangaj.kotlinsample.R
import com.shruthi.pangaj.kotlinsample.adapters.KSRecyclerViewAdapter

/**
 * Created by Pan on 5/31/2017.
 */

class KSRecyclerViewActivity : android.support.v7.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ks_activity_recycler_view)

        val rvItems = findViewById(R.id.rv_items) as android.support.v7.widget.RecyclerView
        var arrayList = ArrayList<String>
        arrayList.add("")
        arrayList.add("Pangaj")
        arrayList.add("Shruthi")

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        rvItems.layoutManager = linearLayoutManager
        rvItems.adapter = KSRecyclerViewAdapter(arrayList)
    }
}