package com.shruthi.pangaj.kotlinsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.shruthi.pangaj.kotlinsample.R

/**
 * Created by Pan on 5/31/2017.
 */

class KSRecyclerViewAdapter(arrayList: ArrayList<String>?) : RecyclerView.Adapter<KSRecyclerViewAdapter.ViewHolder>() {
    var arrayList: ArrayList<String>? = null

    init {
        this.arrayList = arrayList
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup?, p1: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup?.context).inflate(R.layout.ks_adapter_recyclerview, viewGroup, false)
        return KSRecyclerViewAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(viewGroup: ViewHolder?, position: Int) {
        viewGroup?.ivText?.text = arrayList?.get(position)
    }

    override fun getItemCount(): Int {
        return arrayList!!.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivText: TextView = itemView.findViewById(R.id.tv_text) as TextView

        /*private val view_line: View
        init {
            view_line = itemView.findViewById(R.id.view_line)
        }*/
    }
}