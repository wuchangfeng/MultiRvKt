package com.itscoder.allenwu.multirecyclerviewkt.bean

import com.itscoder.allenwu.multirecyclerviewkt.TypeFactory
import com.itscoder.allenwu.multirecyclerviewkt.Visitable


class ContentBean(var content: String) : Visitable {

    override fun type(typeFactory: TypeFactory): Int {
        return typeFactory.type(this)
    }
}