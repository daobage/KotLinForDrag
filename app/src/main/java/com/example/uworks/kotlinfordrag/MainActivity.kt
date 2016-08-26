package com.example.uworks.kotlinfordrag

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    var recycle: RecyclerView? = null
    var recycle1: RecyclerView? = null
    var list = ArrayList<String>()
    var list1 = ArrayList<String>()
    var adapter: AdapterForR? = null
    var adapter1: AdapterForR1? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycle = findViewById(R.id.id_recyclerview)as RecyclerView
        recycle1 = findViewById(R.id.id_recyclerview1) as RecyclerView
        recycle?.layoutManager = LinearLayoutManager(this)
        recycle1?.layoutManager =LinearLayoutManager(this)
        recycle?.addItemDecoration(Divider(this,LinearLayoutManager.HORIZONTAL))
        recycle1?.addItemDecoration(Divider(this,LinearLayoutManager.HORIZONTAL))
        initData()
    }
    private fun initData(){
        for (i in 0..10){
            list?.add("list：内容"+i)
            list1?.add("list1：内容"+i)
        }
         adapter = AdapterForR(this,list!!)
         adapter1 = AdapterForR1(this,list1!!)
        recycle?.adapter = adapter
        recycle1?.adapter = adapter1
    }
}
