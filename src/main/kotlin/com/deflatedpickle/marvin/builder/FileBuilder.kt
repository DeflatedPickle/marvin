/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.builder

import java.io.File

@Suppress("unused")
data class FileBuilder(
    var directory: String,
    private var lastBuilder: FileBuilder? = null
) : Builder<File>, NodeHolder<File, FileBuilder> {
    internal val fileList = mutableListOf<Builder.Node<File>>()
    internal val firstNode = DirectoryNode(File(directory), this)

    init {
        fileList.add(firstNode)
    }

    fun file(name: String): FileBuilder {
        fileList.add(
            FileNode(
                File(
                    "${
                        firstNode.get().absolutePath
                    }/$name"
                )
            )
        )
        return this
    }

    fun dir(name: String): FileBuilder = FileBuilder(
        "${
            firstNode.get().absolutePath
        }/$name",
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
        // Setting the lastBuilder here solves an issue with backtracking
        // Thanks to Zeref#2431 for figuring that out!
        if (last != null) lastBuilder = last
        return lastBuilder!!
    }

    override fun getBuilder(): FileBuilder = this

    /*internal*/ data class FileNode(
        private var file: File
    ) : Builder.Node<File> {
        override fun get(): File = this.file
    }

    /*internal*/ data class DirectoryNode(
        private var file: File,
        private var builder: FileBuilder
    ) : Builder.Node<File>, NodeHolder<File, FileBuilder> {
        override fun get(): File = this.file

        override fun getBuilder(): FileBuilder = this.builder
    }
}
