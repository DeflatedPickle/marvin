@file:Suppress("unused")

package com.deflatedpickle.marvin.functions

import com.deflatedpickle.marvin.functions.extensions.note
import kotlin.math.max

@Throws(RuntimeException::class)
fun max(this_: Number, other: Number): Number =
    when (this_) {
        is Int -> max(this_.toInt(), other.toInt())
        is Float -> max(this_.toFloat(), other.toFloat())
        is Double -> max(this_.toDouble(), other.toDouble())
        is Long -> max(this_.toLong(), other.toLong())
        is Short -> if (this_.toShort() >= other.toShort()) this_ else other
        is Byte -> if (this_.toByte() >= other.toByte()) this_ else other
        else -> throw RuntimeException(note)
    }