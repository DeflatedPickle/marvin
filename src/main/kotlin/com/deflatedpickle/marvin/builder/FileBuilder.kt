/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.builder

import java.io.File

@Suppress("unused")
data class FileBuilder(
    var beginningDirectory: String,
    private var lastBuilder: FileBuilder? = null
) : Builder<FileBuilder> {
    private val beginFile: DirectoryNode

    private val fileList =
            mutableListOf<Builder.Node<File>>()

    init {
        val directoryNode = DirectoryNode(
            File(beginningDirectory), this
        )

        beginFile = directoryNode
        fileList.add(directoryNode)
    }

    @Suppress("unused")
    fun file(name: String): FileBuilder {
        fileList.add(
            FileNode(
                File(
                    "${
                    beginFile.get().absolutePath
                    }\\$name"
                )
            )
        )
        return this
    }

    @Suppress("unused")
    fun dir(name: String): FileBuilder = FileBuilder(
        "${
        beginFile.get().path
        }\\$name",
        this
    )

    override fun build(): FileBuilder {
        var last: FileBuilder? = null
        for (i in fileList) {
            if (i is DirectoryNode) {
                i.get().mkdirs()
                last = lastBuilder
                lastBuilder = i.builder
            } else if (i is FileNode) {
                i.get().parentFile.mkdirs()
                i.get().createNewFile()
            }
        }
        if (last != null) lastBuilder = last
        return lastBuilder!!
    }

    internal data class FileNode(
        private var file: File
    ) : Builder.Node<File> {
        override fun get(): File = this.file
    }

    internal data class DirectoryNode(
        private var file: File,
        var builder: FileBuilder
    ) : Builder.Node<File> {
        override fun get(): File = this.file
    }
}
