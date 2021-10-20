package com.deflatedpickle.marvin

import kotlinx.serialization.Serializable

@Serializable
data class Colour @JvmOverloads constructor(
    val r: Int = 0,
    val g: Int = 0,
    val b: Int = 0,
    val a: Int = 0,
)