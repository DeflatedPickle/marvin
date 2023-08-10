/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.functions.extensions

import kotlin.math.abs
import kotlin.math.log10

operator fun Int.plus(other: Boolean) = this + other.toInt()

fun Int.length() = when(this) {
    0 -> 1
    else -> log10(abs(toDouble())).toInt() + 1
}
