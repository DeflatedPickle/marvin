/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin

class Slug(
    val author: String,
    val name: String,
    val version: Version
) : Comparable<Slug> {
    override fun toString(): String =
        "$author@$name#$version"

    override fun compareTo(other: Slug): Int =
        this.name.compareTo(other.name)

    companion object {
        val slugRegex = Regex("[a-z]+@[a-z_]+#[0-9].[0-9].[0-9]")
    }
}

/**
 * Construct a [Slug] out of this string
 */
@Throws(StringIndexOutOfBoundsException::class)
fun String.toSlug(): Slug =
    if (this.contains("@") && this.contains("#") && this.contains(".")) {
        val split = this.splitToSequence("@", "#", ".")
        var index = -1

        Slug(
            author = split.elementAt(++index),
            name = split.elementAt(++index),
            version = Version(
                major = split.elementAt(++index).toInt(),
                minor = split.elementAt(++index).toInt(),
                patch = split.elementAt(++index).toInt()
            )
        )
    } else throw StringIndexOutOfBoundsException()