package com.deflatedpickle.marvin.serializer

import com.deflatedpickle.marvin.extensions.readBase64
import com.deflatedpickle.marvin.extensions.writeBase64
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.awt.image.BufferedImage

@OptIn(ExperimentalSerializationApi::class)
@Serializer(forClass = BufferedImage::class)
object BufferedImageSerializer : KSerializer<BufferedImage> {
    override val descriptor = PrimitiveSerialDescriptor(
        serialName = "BufferedImage",
        kind = PrimitiveKind.STRING,
    )

    override fun serialize(encoder: Encoder, value: BufferedImage) =
        encoder.encodeString(writeBase64(value))

    override fun deserialize(decoder: Decoder) =
        readBase64(decoder.decodeString())
}