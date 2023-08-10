/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.functions.extensions

operator fun Int.plus(other: Boolean) = this + other.toInt()
