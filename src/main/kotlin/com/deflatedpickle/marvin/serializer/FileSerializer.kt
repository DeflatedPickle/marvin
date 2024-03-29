package com.deflatedpickle.marvin.serializer

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.io.File

@OptIn(ExperimentalSerializationApi::class)
@Serializer(forClass = File::class)
object FileSerializer : KSerializer<File> {
    override val descriptor = PrimitiveSerialDescriptor(
        serialName = "File",
        kind = PrimitiveKind.STRING,
    )

    override fun serialize(encoder: Encoder, value: File) =
        encoder.encodeString(value.absolutePath)

    override fun deserialize(decoder: Decoder) = File(decoder.decodeString())
}