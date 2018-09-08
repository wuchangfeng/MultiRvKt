package com.itscoder.allenwu.multirecyclerviewkt

import android.support.v7.widget.RecyclerView
import android.view.View
import android.util.SparseArray

abstract class BaseViewHolder<T>(view: View): RecyclerView.ViewHolder(view){
    private var mViews: SparseArray<View>? = null
    private var mItemView: View? = null

    init {
        mItemView = itemView
        mViews = SparseArray()
    }

    fun getView(resId: Int): View ?{
        var view: View? = mViews!!.get(resId)
        if (view == null) {
            view = mItemView!!.findViewById(resId)
            mViews!!.put(resId, view)
        }
        return view
    }

    /**
     * 数据和视图绑定
     */
    abstract fun bindViewData(data: T)
}