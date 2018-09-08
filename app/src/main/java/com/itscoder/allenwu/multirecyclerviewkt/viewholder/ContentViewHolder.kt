package com.itscoder.allenwu.multirecyclerviewkt.viewholder

import android.content.Context
import android.view.View
import android.widget.TextView

import com.itscoder.allenwu.multirecyclerviewkt.BaseViewHolder
import com.itscoder.allenwu.multirecyclerviewkt.R
import com.itscoder.allenwu.multirecyclerviewkt.bean.ContentBean
import com.itscoder.allenwu.multirecyclerviewkt.toast


class ContentViewHolder(view: View): BaseViewHolder<ContentBean>(view){
    private var mView: View? = null
    private var mTextView: TextView? = null

    init {
        mView = view
    }

    override fun bindViewData(data: ContentBean) {
        mTextView = getView(R.id.tv_content) as TextView
        mTextView!!.setText(data.content)

        mView?.setOnClickListener {
            showToast(mView!!.getContext())
        }
    }

    fun showToast(context: Context){
        context.toast("click")
    }
}