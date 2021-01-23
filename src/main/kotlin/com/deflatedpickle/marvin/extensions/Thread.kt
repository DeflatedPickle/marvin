package com.deflatedpickle.marvin.extensions

fun Thread(name: String, runnable: () -> Unit) = Thread(runnable, name)