package com.shruthi.pangaj.kotlinsample.activities

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
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
        val arrayList: ArrayList<String>? = ArrayList()
        arrayList?.add("Pangaj")
        arrayList?.add("Shruthi")

        rvItems.layoutManager = LinearLayoutManager(this)
        rvItems.adapter = KSRecyclerViewAdapter(arrayList)

//        TODO("Need to add RecyclerView OnClickListener")
    }
}