package com.deflatedpickle.marvin.function

fun println(vararg arg: Any, separator: String = ",") {
    kotlin.io.println(arg.joinToString(separator))
}