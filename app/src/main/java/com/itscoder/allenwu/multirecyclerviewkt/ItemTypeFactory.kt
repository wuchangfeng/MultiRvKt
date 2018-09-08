package com.itscoder.allenwu.multirecyclerviewkt

import android.view.View
import com.itscoder.allenwu.multirecyclerviewkt.bean.ContentBean
import com.itscoder.allenwu.multirecyclerviewkt.bean.DividerBean
import com.itscoder.allenwu.multirecyclerviewkt.bean.SearchBean
import com.itscoder.allenwu.multirecyclerviewkt.viewholder.ContentViewHolder
import com.itscoder.allenwu.multirecyclerviewkt.viewholder.DividerViewHolder
import com.itscoder.allenwu.multirecyclerviewkt.viewholder.SearchViewHolder

/**
 * 获取对应的layout和viewholder
 */
class ItemTypeFactory : TypeFactory {

    override fun type(contentBean: ContentBean): Int {
        return CONTENT_ITEM_LAYOUT
    }

    override fun type(dividerBean: DividerBean): Int {
        return DIVIDER_ITEM_LAYOUT
    }

    override fun type(dividerBean: SearchBean): Int {
        return SEARCH_ITEM_LAYOUT
    }

    override fun createViewHolder(type: Int, itemView: View): BaseViewHolder<*>{
        when (type) {
            SEARCH_ITEM_LAYOUT -> return SearchViewHolder(itemView)
            CONTENT_ITEM_LAYOUT -> return ContentViewHolder(itemView)
            DIVIDER_ITEM_LAYOUT -> return DividerViewHolder(itemView)
            else -> throw RuntimeException("Illegal view type")
        }
    }

    companion object {
        const val CONTENT_ITEM_LAYOUT = R.layout.rv_item_content
        const val SEARCH_ITEM_LAYOUT = R.layout.rv_item_search
        const val DIVIDER_ITEM_LAYOUT = R.layout.rv_item_divider
    }
}