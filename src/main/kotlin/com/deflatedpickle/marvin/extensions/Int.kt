package com.deflatedpickle.marvin.extensions

operator fun Int.plus(other: Boolean) = this + other.toInt()