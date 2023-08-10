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
object NullableFileSerializer : KSerializer<File?> {
    override val descriptor = PrimitiveSerialDescriptor(
        serialName = "Mode",
        kind = PrimitiveKind.STRING,
    )

    override fun serialize(encoder: Encoder, value: File?) =
        encoder.encodeString(value?.absolutePath ?: "null")

    override fun deserialize(decoder: Decoder): File? {
        decoder.decodeString().let {
            return if (it == "null") {
                null
            } else {
                File(it)
            }
        }
    }
}