/* Copyright (c) 2021 DeflatedPickle under the MIT license */

package com.deflatedpickle.marvin.functions.extensions

import kotlin.reflect.typeOf

@PublishedApi
internal const val note = "Unknown numeric type"

@Throws(RuntimeException::class)
operator fun Number.plus(other: Number): Number =
    when (this) {
        is Int -> when (other) {
            is Int -> this.toInt() + other.toInt()
            is Float -> this.toInt() + other.toFloat()
            is Double -> this.toInt() + other.toDouble()
            is Long -> this.toInt() + other.toLong()
            is Short -> this.toInt() + other.toShort()
            is Byte -> this.toInt() + other.toByte()
            else -> throw RuntimeException(note)
        }
        is Float -> when (other) {
            is Int -> this.toFloat() + other.toInt()
            is Float -> this.toFloat() + other.toFloat()
            is Double -> this.toFloat() + other.toDouble()
            is Long -> this.toFloat() + other.toLong()
            is Short -> this.toFloat() + other.toShort()
            is Byte -> this.toFloat() + other.toByte()
            else -> throw RuntimeException(note)
        }
        is Double -> when (other) {
            is Int -> this.toDouble() + other.toInt()
            is Float -> this.toDouble() + other.toFloat()
            is Double -> this.toDouble() + other.toDouble()
            is Long -> this.toDouble() + other.toLong()
            is Short -> this.toDouble() + other.toShort()
            is Byte -> this.toDouble() + other.toByte()
            else -> throw RuntimeException(note)
        }
        is Long -> when (other) {
            is Int -> this.toLong() + other.toInt()
            is Float -> this.toLong() + other.toFloat()
            is Double -> this.toLong() + other.toDouble()
            is Long -> this.toLong() + other.toLong()
            is Short -> this.toLong() + other.toShort()
            is Byte -> this.toLong() + other.toByte()
            else -> throw RuntimeException(note)
        }
        is Short -> when (other) {
            is Int -> this.toShort() + other.toInt()
            is Float -> this.toShort() + other.toFloat()
            is Double -> this.toShort() + other.toDouble()
            is Long -> this.toShort() + other.toLong()
            is Short -> this.toShort() + other.toShort()
            is Byte -> this.toShort() + other.toByte()
            else -> throw RuntimeException(note)
        }
        is Byte -> when (other) {
            is Int -> this.toByte() + other.toInt()
            is Float -> this.toByte() + other.toFloat()
            is Double -> this.toByte() + other.toDouble()
            is Long -> this.toByte() + other.toLong()
            is Short -> this.toByte() + other.toShort()
            is Byte -> this.toByte() + other.toByte()
            else -> throw RuntimeException(note)
        }
        else -> throw RuntimeException(note)
    }

@Throws(RuntimeException::class)
operator fun Number.minus(other: Number): Number =
    when (this) {
        is Int -> when (other) {
            is Int -> this.toInt() - other.toInt()
            is Float -> this.toInt() - other.toFloat()
            is Double -> this.toInt() - other.toDouble()
            is Long -> this.toInt() - other.toLong()
            is Short -> this.toInt() - other.toShort()
            is Byte -> this.toInt() - other.toByte()
            else -> throw RuntimeException(note)
        }
        is Float -> when (other) {
            is Int -> this.toFloat() - other.toInt()
            is Float -> this.toFloat() - other.toFloat()
            is Double -> this.toFloat() - other.toDouble()
            is Long -> this.toFloat() - other.toLong()
            is Short -> this.toFloat() - other.toShort()
            is Byte -> this.toFloat() - other.toByte()
            else -> throw RuntimeException(note)
        }
        is Double -> when (other) {
            is Int -> this.toDouble() - other.toInt()
            is Float -> this.toDouble() - other.toFloat()
            is Double -> this.toDouble() - other.toDouble()
            is Long -> this.toDouble() - other.toLong()
            is Short -> this.toDouble() - other.toShort()
            is Byte -> this.toDouble() - other.toByte()
            else -> throw RuntimeException(note)
        }
        is Long -> when (other) {
            is Int -> this.toLong() - other.toInt()
            is Float -> this.toLong() - other.toFloat()
            is Double -> this.toLong() - other.toDouble()
            is Long -> this.toLong() - other.toLong()
            is Short -> this.toLong() - other.toShort()
            is Byte -> this.toLong() - other.toByte()
            else -> throw RuntimeException(note)
        }
        is Short -> when (other) {
            is Int -> this.toShort() - other.toInt()
            is Float -> this.toShort() - other.toFloat()
            is Double -> this.toShort() - other.toDouble()
            is Long -> this.toShort() - other.toLong()
            is Short -> this.toShort() - other.toShort()
            is Byte -> this.toShort() - other.toByte()
            else -> throw RuntimeException(note)
        }
        is Byte -> when (other) {
            is Int -> this.toByte() - other.toInt()
            is Float -> this.toByte() - other.toFloat()
            is Double -> this.toByte() - other.toDouble()
            is Long -> this.toByte() - other.toLong()
            is Short -> this.toByte() - other.toShort()
            is Byte -> this.toByte() - other.toByte()
            else -> throw RuntimeException(note)
        }
        else -> throw RuntimeException(note)
    }

@Throws(RuntimeException::class)
operator fun Number.times(other: Number): Number =
    when (this) {
        is Int -> when (other) {
            is Int -> this.toInt() * other.toInt()
            is Float -> this.toInt() * other.toFloat()
            is Double -> this.toInt() * other.toDouble()
            is Long -> this.toInt() * other.toLong()
            is Short -> this.toInt() * other.toShort()
            is Byte -> this.toInt() * other.toByte()
            else -> throw RuntimeException(note)
        }
        is Float -> when (other) {
            is Int -> this.toFloat() * other.toInt()
            is Float -> this.toFloat() * other.toFloat()
            is Double -> this.toFloat() * other.toDouble()
            is Long -> this.toFloat() * other.toLong()
            is Short -> this.toFloat() * other.toShort()
            is Byte -> this.toFloat() * other.toByte()
            else -> throw RuntimeException(note)
        }
        is Double -> when (other) {
            is Int -> this.toDouble() * other.toInt()
            is Float -> this.toDouble() * other.toFloat()
            is Double -> this.toDouble() * other.toDouble()
            is Long -> this.toDouble() * other.toLong()
            is Short -> this.toDouble() * other.toShort()
            is Byte -> this.toDouble() * other.toByte()
            else -> throw RuntimeException(note)
        }
        is Long -> when (other) {
            is Int -> this.toLong() * other.toInt()
            is Float -> this.toLong() * other.toFloat()
            is Double -> this.toLong() * other.toDouble()
            is Long -> this.toLong() * other.toLong()
            is Short -> this.toLong() * other.toShort()
            is Byte -> this.toLong() * other.toByte()
            else -> throw RuntimeException(note)
        }
        is Short -> when (other) {
            is Int -> this.toShort() * other.toInt()
            is Float -> this.toShort() * other.toFloat()
            is Double -> this.toShort() * other.toDouble()
            is Long -> this.toShort() * other.toLong()
            is Short -> this.toShort() * other.toShort()
            is Byte -> this.toShort() * other.toByte()
            else -> throw RuntimeException(note)
        }
        is Byte -> when (other) {
            is Int -> this.toByte() * other.toInt()
            is Float -> this.toByte() * other.toFloat()
            is Double -> this.toByte() * other.toDouble()
            is Long -> this.toByte() * other.toLong()
            is Short -> this.toByte() * other.toShort()
            is Byte -> this.toByte() * other.toByte()
            else -> throw RuntimeException(note)
        }
        else -> throw RuntimeException(note)
    }

@Throws(RuntimeException::class)
operator fun Number.div(other: Number): Number =
    when (this) {
        is Int -> when (other) {
            is Int -> this.toInt() / other.toInt()
            is Float -> this.toInt() / other.toFloat()
            is Double -> this.toInt() / other.toDouble()
            is Long -> this.toInt() / other.toLong()
            is Short -> this.toInt() / other.toShort()
            is Byte -> this.toInt() / other.toByte()
            else -> throw RuntimeException(note)
        }
        is Float -> when (other) {
            is Int -> this.toFloat() / other.toInt()
            is Float -> this.toFloat() / other.toFloat()
            is Double -> this.toFloat() / other.toDouble()
            is Long -> this.toFloat() / other.toLong()
            is Short -> this.toFloat() / other.toShort()
            is Byte -> this.toFloat() / other.toByte()
            else -> throw RuntimeException(note)
        }
        is Double -> when (other) {
            is Int -> this.toDouble() / other.toInt()
            is Float -> this.toDouble() / other.toFloat()
            is Double -> this.toDouble() / other.toDouble()
            is Long -> this.toDouble() / other.toLong()
            is Short -> this.toDouble() / other.toShort()
            is Byte -> this.toDouble() / other.toByte()
            else -> throw RuntimeException(note)
        }
        is Long -> when (other) {
            is Int -> this.toLong() / other.toInt()
            is Float -> this.toLong() / other.toFloat()
            is Double -> this.toLong() / other.toDouble()
            is Long -> this.toLong() / other.toLong()
            is Short -> this.toLong() / other.toShort()
            is Byte -> this.toLong() / other.toByte()
            else -> throw RuntimeException(note)
        }
        is Short -> when (other) {
            is Int -> this.toShort() / other.toInt()
            is Float -> this.toShort() / other.toFloat()
            is Double -> this.toShort() / other.toDouble()
            is Long -> this.toShort() / other.toLong()
            is Short -> this.toShort() / other.toShort()
            is Byte -> this.toShort() / other.toByte()
            else -> throw RuntimeException(note)
        }
        is Byte -> when (other) {
            is Int -> this.toByte() / other.toInt()
            is Float -> this.toByte() / other.toFloat()
            is Double -> this.toByte() / other.toDouble()
            is Long -> this.toByte() / other.toLong()
            is Short -> this.toByte() / other.toShort()
            is Byte -> this.toByte() / other.toByte()
            else -> throw RuntimeException(note)
        }
        else -> throw RuntimeException(note)
    }

@Throws(RuntimeException::class)
operator fun Number.rem(other: Number): Number =
    when (this) {
        is Int -> when (other) {
            is Int -> this.toInt() % other.toInt()
            is Float -> this.toInt() % other.toFloat()
            is Double -> this.toInt() % other.toDouble()
            is Long -> this.toInt() % other.toLong()
            is Short -> this.toInt() % other.toShort()
            is Byte -> this.toInt() % other.toByte()
            else -> throw RuntimeException(note)
        }
        is Float -> when (other) {
            is Int -> this.toFloat() % other.toInt()
            is Float -> this.toFloat() % other.toFloat()
            is Double -> this.toFloat() % other.toDouble()
            is Long -> this.toFloat() % other.toLong()
            is Short -> this.toFloat() % other.toShort()
            is Byte -> this.toFloat() % other.toByte()
            else -> throw RuntimeException(note)
        }
        is Double -> when (other) {
            is Int -> this.toDouble() % other.toInt()
            is Float -> this.toDouble() % other.toFloat()
            is Double -> this.toDouble() % other.toDouble()
            is Long -> this.toDouble() % other.toLong()
            is Short -> this.toDouble() % other.toShort()
            is Byte -> this.toDouble() % other.toByte()
            else -> throw RuntimeException(note)
        }
        is Long -> when (other) {
            is Int -> this.toLong() % other.toInt()
            is Float -> this.toLong() % other.toFloat()
            is Double -> this.toLong() % other.toDouble()
            is Long -> this.toLong() % other.toLong()
            is Short -> this.toLong() % other.toShort()
            is Byte -> this.toLong() % other.toByte()
            else -> throw RuntimeException(note)
        }
        is Short -> when (other) {
            is Int -> this.toShort() % other.toInt()
            is Float -> this.toShort() % other.toFloat()
            is Double -> this.toShort() % other.toDouble()
            is Long -> this.toShort() % other.toLong()
            is Short -> this.toShort() % other.toShort()
            is Byte -> this.toShort() % other.toByte()
            else -> throw RuntimeException(note)
        }
        is Byte -> when (other) {
            is Int -> this.toByte() % other.toInt()
            is Float -> this.toByte() % other.toFloat()
            is Double -> this.toByte() % other.toDouble()
            is Long -> this.toByte() % other.toLong()
            is Short -> this.toByte() % other.toShort()
            is Byte -> this.toByte() % other.toByte()
            else -> throw RuntimeException(note)
        }
        else -> throw RuntimeException(note)
    }

operator fun Number.compareTo(other: Number): Int =
    when (this) {
        is Int -> when (other) {
            is Int -> this.toInt().compareTo(other.toInt())
            is Float -> this.toInt().compareTo(other.toFloat())
            is Double -> this.toInt().compareTo(other.toDouble())
            is Long -> this.toInt().compareTo(other.toLong())
            is Short -> this.toInt().compareTo(other.toShort())
            is Byte -> this.toInt().compareTo(other.toByte())
            else -> throw RuntimeException(note)
        }
        is Float -> when (other) {
            is Int -> this.toFloat().compareTo(other.toInt())
            is Float -> this.toFloat().compareTo(other.toFloat())
            is Double -> this.toFloat().compareTo(other.toDouble())
            is Long -> this.toFloat().compareTo(other.toLong())
            is Short -> this.toFloat().compareTo(other.toShort())
            is Byte -> this.toFloat().compareTo(other.toByte())
            else -> throw RuntimeException(note)
        }
        is Double -> when (other) {
            is Int -> this.toDouble().compareTo(other.toInt())
            is Float -> this.toDouble().compareTo(other.toFloat())
            is Double -> this.toDouble().compareTo(other.toDouble())
            is Long -> this.toDouble().compareTo(other.toLong())
            is Short -> this.toDouble().compareTo(other.toShort())
            is Byte -> this.toDouble().compareTo(other.toByte())
            else -> throw RuntimeException(note)
        }
        is Long -> when (other) {
            is Int -> this.toLong().compareTo(other.toInt())
            is Float -> this.toLong().compareTo(other.toFloat())
            is Double -> this.toLong().compareTo(other.toDouble())
            is Long -> this.toLong().compareTo(other.toLong())
            is Short -> this.toLong().compareTo(other.toShort())
            is Byte -> this.toLong().compareTo(other.toByte())
            else -> throw RuntimeException(note)
        }
        is Short -> when (other) {
            is Int -> this.toShort().compareTo(other.toInt())
            is Float -> this.toShort().compareTo(other.toFloat())
            is Double -> this.toShort().compareTo(other.toDouble())
            is Long -> this.toShort().compareTo(other.toLong())
            is Short -> this.toShort().compareTo(other.toShort())
            is Byte -> this.toShort().compareTo(other.toByte())
            else -> throw RuntimeException(note)
        }
        is Byte -> when (other) {
            is Int -> this.toByte().compareTo(other.toInt())
            is Float -> this.toByte().compareTo(other.toFloat())
            is Double -> this.toByte().compareTo(other.toDouble())
            is Long -> this.toByte().compareTo(other.toLong())
            is Short -> this.toByte().compareTo(other.toShort())
            is Byte -> this.toByte().compareTo(other.toByte())
            else -> throw RuntimeException(note)
        }
        else -> throw RuntimeException(note)
    }

@PublishedApi
@OptIn(ExperimentalStdlibApi::class)
@Throws(RuntimeException::class)
internal inline fun <reified T : Number> Number.to() =
    when (typeOf<T>().classifier) {
        Int::class -> this.toInt()
        Float::class -> this.toFloat()
        Double::class -> this.toDouble()
        Long::class -> this.toLong()
        Short::class -> this.toShort()
        Byte::class -> this.toByte()
        else -> throw RuntimeException(note)
    }
