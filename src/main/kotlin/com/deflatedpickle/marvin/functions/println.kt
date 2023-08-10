package com.deflatedpickle.marvin.functions

fun println(vararg arg: Any, separator: String = ",") {
    kotlin.io.println(arg.joinToString(separator))
}