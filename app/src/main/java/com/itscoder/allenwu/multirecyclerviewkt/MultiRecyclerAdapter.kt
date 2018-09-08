package com.itscoder.allenwu.multirecyclerviewkt

import android.view.LayoutInflater
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.view.View


class MultiRecyclerAdapter(private var mData: List<Visitable>,
                           private val typeFactory: ItemTypeFactory) :
        RecyclerView.Adapter<BaseViewHolder<Visitable>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Visitable> {
        if (parent != null){
            val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
            return typeFactory.createViewHolder(viewType, view) as BaseViewHolder<Visitable>
        }
        throw RuntimeException("Parent is null")
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Visitable>, position: Int) {
        holder.bindViewData(mData!![position])
    }

    override fun getItemViewType(position: Int): Int {
        return mData!![position].type(typeFactory)
    }

    override fun getItemCount(): Int {
        return if (mData != null) mData!!.size else 0
    }
}