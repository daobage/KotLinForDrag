package com.example.uworks.mykotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.uworks.kotlinfordrag.R
import java.util.*

/**
 * Created by UWorks on 2016/8/19.
 */

class Adapter : RecyclerView.Adapter<Adapter.MyHolder>{
    var list = ArrayList<String>()
    var mContext : Context? = null

    constructor(list: ArrayList<String>, mContext: Context?) : super() {
        this.list = list
        this.mContext = mContext
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val holder = MyHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_item, null))
        return holder
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.text.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var text: TextView

        init {
            text = itemView.findViewById(R.id.tv_item) as TextView
        }
    }
}
