package com.deflatedpickle.marvin.functions.extensions

import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.Base64
import javax.imageio.ImageIO

fun writeBase64(img: RenderedImage, format: String = "png"): String {
    val os = ByteArrayOutputStream()
    ImageIO.write(img, format, os)
    return Base64.getEncoder().encodeToString(os.toByteArray())
}

fun readBase64(data: String): BufferedImage {
    val e = ByteArrayInputStream(Base64.getDecoder().decode(data))
    return ImageIO.read(e)
}