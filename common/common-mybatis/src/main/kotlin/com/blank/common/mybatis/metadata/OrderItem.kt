package com.blank.common.mybatis.metadata

import java.io.Serializable

/**
 * 排序元素载体
 * <p>
 * <p>
 */
class OrderItem @JvmOverloads constructor(
    /**
     * 需要进行排序的字段
     */
    var column: String,
    /**
     * 是否正序排列，默认 true
     */
    var asc: Boolean = true
) : Serializable {
    companion object {
        private const val serialVersionUID = 1L

        fun asc(column: String): OrderItem {
            return build(column, true)
        }

        fun desc(column: String): OrderItem {
            return build(column, false)
        }

        fun ascs(vararg columns: String): MutableList<OrderItem> {
            return columns.map { asc(it) }.toMutableList()
        }

        fun descs(vararg columns: String): MutableList<OrderItem> {
            return columns.map { desc(it) }.toMutableList()
        }

        private fun build(column: String, asc: Boolean): OrderItem {
            return OrderItem(column, asc)
        }
    }
}
