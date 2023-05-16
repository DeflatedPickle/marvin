@file:Suppress("SpellCheckingInspection")

package com.deflatedpickle.marvin.extensions

import java.awt.Rectangle
import java.awt.image.BufferedImage


fun BufferedImage.getSubimage(rect: Rectangle): BufferedImage =
    this.getSubimage(rect.x, rect.y, rect.width, rect.height)