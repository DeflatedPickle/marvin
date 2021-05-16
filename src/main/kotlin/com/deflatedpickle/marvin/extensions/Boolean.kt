package com.deflatedpickle.marvin.extensions

fun Boolean.toInt() = if (this) 1 else 0

operator fun Boolean.plus(other: Boolean) = this.toInt() + other.toInt()
operator fun Boolean.plus(other: Int) = this.toInt() + other
