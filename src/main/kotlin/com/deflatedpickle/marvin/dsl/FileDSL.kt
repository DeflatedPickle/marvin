@file:Suppress("unused")

package com.deflatedpickle.marvin.dsl

import com.deflatedpickle.marvin.builder.Builder
import com.deflatedpickle.marvin.builder.FileBuilder
import com.deflatedpickle.marvin.builder.NodeHolder
import java.io.File

@DslMarker
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
annotation class FileDSL

data class DSLFileNode(
    private var file: File
) : Builder.Node<File> {
    override fun get(): File = this.file

    operator fun String.unaryPlus(): File = file.apply { appendText("${this@unaryPlus}\n") }
    operator fun ByteArray.unaryMinus(): File = file.apply { appendBytes(this@unaryMinus) }
}

fun FileBuilder.fileNode(name: String): DSLFileNode =
    DSLFileNode(
        File(
            "${
                firstNode.get().absolutePath
            }/$name"
        )
    ).apply {
        fileList.add(this)
    }

fun FileBuilder.dirNode(name: String): FileBuilder.DirectoryNode = dir(name).firstNode

fun cabinet(
    dir: String,
    block: (@FileDSL FileBuilder).() -> Unit
) = FileBuilder(dir).apply(block).build()

fun NodeHolder<File, FileBuilder>.file(
    name: String,
    block: (@FileDSL DSLFileNode).() -> Unit
) = this.builder.fileNode(name).apply(block)

fun NodeHolder<File, FileBuilder>.dir(
    name: String,
    block: (@FileDSL FileBuilder.DirectoryNode).() -> Unit
) = this.builder.dirNode(name).apply(block).builder.build()
