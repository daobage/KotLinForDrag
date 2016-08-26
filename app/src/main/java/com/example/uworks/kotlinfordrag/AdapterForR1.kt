package com.example.uworks.kotlinfordrag

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

/**
 * Created by UWorks on 2016/8/19.
 */
class AdapterForR1(internal var mContext:Context, internal var list: List<String>) : RecyclerView.Adapter<AdapterForR1.ViewHold>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHold? {
        var holder = ViewHold(LayoutInflater.from(mContext).inflate(R.layout.layout_item,null))
        return holder
    }

    override fun onBindViewHolder(holder: ViewHold, position: Int) {
        holder.text.text = list.get(position)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHold(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var text: TextView
        init {
            text = itemView.findViewById(R.id.tv_item) as TextView
        }
    }
}
