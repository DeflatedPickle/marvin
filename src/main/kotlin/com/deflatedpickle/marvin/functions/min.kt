@file:Suppress("unused")

package com.deflatedpickle.marvin.functions

import com.deflatedpickle.marvin.functions.extensions.note
import kotlin.math.min

@Throws(RuntimeException::class)
fun min(this_: Number, other: Number): Number =
    when (this_) {
        is Int -> min(this_.toInt(), other.toInt())
        is Float -> min(this_.toFloat(), other.toFloat())
        is Double -> min(this_.toDouble(), other.toDouble())
        is Long -> min(this_.toLong(), other.toLong())
        is Short -> if (this_.toShort() <= other.toShort()) this_ else other
        is Byte -> if (this_.toByte() <= other.toByte()) this_ else other
        else -> throw RuntimeException(note)
    }