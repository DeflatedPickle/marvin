/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.extensions

operator fun Int.plus(other: Boolean) = this + other.toInt()
