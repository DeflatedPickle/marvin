/* Copyright (c) 2021 DeflatedPickle under the MIT license */

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

    operator fun String.unaryPlus(): File = file.apply {
        try {
            appendText("${this@unaryPlus}\n")
        } catch (_: Exception) {
        }
    }

    operator fun ByteArray.unaryMinus(): File = file.apply {
        try {
            appendBytes(this@unaryMinus)
        } catch (_: Exception) {
        }
    }
}

fun FileBuilder.fileNode(name: String): DSLFileNode =
    DSLFileNode(
        File(
            "${
                firstNode.get().absolutePath
            }/$name"
        )
    ).apply {
        nodeList.add(this)
    }

fun FileBuilder.dirNode(name: String): FileBuilder.DirectoryNode = dir(name).firstNode

fun cabinet(
    dir: String,
    build: Boolean = true,
    block: (@FileDSL FileBuilder).() -> Unit
) = FileBuilder(dir).apply(block).apply {
    if (build) build()
    else makelessBuild()
}

fun NodeHolder<File, FileBuilder>.file(
    name: String,
    block: (@FileDSL DSLFileNode).() -> Unit
) = this.builder.fileNode(name).apply(block)

fun NodeHolder<File, FileBuilder>.dir(
    name: String,
    build: Boolean = true,
    block: (@FileDSL FileBuilder.DirectoryNode).() -> Unit
) = this.builder.dirNode(name).apply(block).builder.apply {
    if (build) build()
    else makelessBuild()
}
