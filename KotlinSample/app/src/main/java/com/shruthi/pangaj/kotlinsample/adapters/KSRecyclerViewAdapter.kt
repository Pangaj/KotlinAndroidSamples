package com.shruthi.pangaj.kotlinsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by Pan on 5/31/2017.
 */

class KSRecyclerViewAdapter : RecyclerView.Adapter<KSRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup?, p1: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: ViewHolder?, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ivOtherServiceLogo: ImageView = itemView.findViewById(R.id.iv_other_services_logo) as ImageView
        private val tvOtherServiceName: TextView = itemView.findViewById(R.id.tv_other_service_name) as TextView
        private val tvOtherServiceChannelNo: TextView = itemView.findViewById(R.id.tv_other_service_channel_no) as TextView
        private val tvOtherServiceType: TextView = itemView.findViewById(R.id.tv_other_service_type) as TextView
        private val relative_layout: RelativeLayout = itemView.findViewById(R.id.relative_layout) as RelativeLayout
        private val view_line: View

        init {
            view_line = itemView.findViewById(R.id.view_line)
        }
    }
}