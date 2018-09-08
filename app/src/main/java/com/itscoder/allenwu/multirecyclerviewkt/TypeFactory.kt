package com.itscoder.allenwu.multirecyclerviewkt

import android.view.View
import com.itscoder.allenwu.multirecyclerviewkt.bean.ContentBean
import com.itscoder.allenwu.multirecyclerviewkt.bean.DividerBean
import com.itscoder.allenwu.multirecyclerviewkt.bean.SearchBean

/**
 * Type 类型工厂,有多种类型的item直接插进来
 */
interface TypeFactory {

    fun type(contentBean: ContentBean): Int
    fun type(searchBean: SearchBean): Int
    fun type(dividerBean: DividerBean): Int

    fun createViewHolder(type: Int,itemView: View): BaseViewHolder<*>
}