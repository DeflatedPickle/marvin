/* Copyright (c) 2020 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin

class Version(
    val major: Int,
    val minor: Int,
    val patch: Int = 0
) : Comparable<Version> {
    constructor(
        major: String,
        minor: String,
        patch: String
    ) : this(
        major.toInt(),
        minor.toInt(),
        patch.toInt()
    )

    companion object {
        fun fromString(version: String): Version {
            val split = version.split(".")
            return Version(
                split[0].toInt(),
                split[1].toInt(),
                if (split.lastIndex == 2) split[2].toInt() else 0
            )
        }
    }

    override fun toString(): String = "$major.$minor.$patch"
    override fun equals(other: Any?): Boolean =
        if (other is Version) {
            this.major == other.major &&
                    this.minor == other.minor &&
                    this.patch == other.patch
        } else {
            false
        }

    override operator fun compareTo(other: Version): Int {
        var cmp: Int = major - other.major
        if (cmp == 0) {
            cmp = minor - other.minor
            if (cmp == 0) {
                cmp = patch - other.patch
            }
        }
        return cmp
    }

    operator fun rangeTo(that: Version): VersionProgression = VersionProgression(this, that)
    operator fun plus(i: Int): Version =
        when {
            this.patch + i < 100 -> {
                Version(this.major, this.minor, this.patch + i)
            }
            this.minor + i < 100 -> {
                Version(this.major, this.major + i, this.patch)
            }
            else -> {
                Version(this.major + i, this.minor, this.patch)
            }
        }

    override fun hashCode(): Int {
        var result = major
        result = 31 * result + minor
        result = 31 * result + patch
        return result
    }
}

class VersionIterator(
    private val start: Version,
    private val endInclusive: Version
) : Iterator<Version> {
    private var current = this.start

    override fun hasNext(): Boolean = this.current <= this.endInclusive

    override fun next(): Version {
        val next = this.current
        current = next + 1
        return next
    }
}

class VersionProgression(
    override val start: Version,
    override val endInclusive: Version
) : Iterable<Version>, ClosedRange<Version> {
    override fun toString(): String = "$start - $endInclusive"
    override fun iterator(): Iterator<Version> = VersionIterator(start, endInclusive)
}

/**
 * Construct a [Version] from a string patterned as *.*.*
 */
@Throws(StringIndexOutOfBoundsException::class)
fun String.toVersion(): Version =
    if (this.count { it == '.' } == 2) {
        val split = this.split('.')
        var index = -1

        Version(
            major = split[++index],
            minor = split[++index],
            patch = split[++index]
        )
    } else throw StringIndexOutOfBoundsException()
