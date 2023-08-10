/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.functions.extensions

fun Thread(name: String, runnable: () -> Unit) = Thread(runnable, name)
