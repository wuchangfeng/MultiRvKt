package com.itscoder.allenwu.multirecyclerviewkt

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.itscoder.allenwu.multirecyclerviewkt.bean.DividerBean
import com.itscoder.allenwu.multirecyclerviewkt.bean.ContentBean
import com.itscoder.allenwu.multirecyclerviewkt.bean.SearchBean
import android.support.v7.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private var rvContent: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContent = findViewById(R.id.rv_mulit_type)

        val beans: MutableList<Visitable> = mutableListOf()
        beans.add(SearchBean())
        beans.add(DividerBean())
        beans.add(ContentBean("one"))
        beans.add(DividerBean())
        beans.add(ContentBean("two"))
        beans.add(DividerBean())

        val typeFactory = ItemTypeFactory()
        val multiRecyclerAdapter = MultiRecyclerAdapter(beans,typeFactory)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rvContent!!.adapter = multiRecyclerAdapter
        rvContent!!.layoutManager = linearLayoutManager
    }
}
