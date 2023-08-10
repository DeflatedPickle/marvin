package com.deflatedpickle.marvin.functions.extensions

import java.awt.Color
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

fun Color.lighten(fraction: Double, step: Int) =
    Color(
        min(255.0, this.red + step * fraction).roundToInt(),
        min(255.0, this.green + step * fraction).roundToInt(),
        min(255.0, this.blue + step * fraction).roundToInt(),
        this.alpha
    )

fun Color.darken(fraction: Double, step: Int) =
    Color(
        max(0.0, this.red - step * fraction).roundToInt(),
        max(0.0, this.green - step * fraction).roundToInt(),
        max(0.0, this.blue - step * fraction).roundToInt(),
        this.alpha
    )