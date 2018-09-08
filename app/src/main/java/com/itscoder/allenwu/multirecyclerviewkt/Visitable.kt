package com.itscoder.allenwu.multirecyclerviewkt

/**
 * 所有的访问者都要实现这个type操作
 */
interface Visitable {
    fun type(typeFactory: TypeFactory): Int
}