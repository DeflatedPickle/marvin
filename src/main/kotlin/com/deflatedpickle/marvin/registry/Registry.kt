/* Copyright (c) 2021 DeflatedPickle under the MIT license */

@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.deflatedpickle.marvin.registry

open class Registry<K, V> {
    private val items = mutableMapOf<K, V>()

    val keys: MutableCollection<K>
        get() = items.keys

    val values: MutableCollection<V>
        get() = items.values

    operator fun set(key: K, value: V) {
        this.items[key] = value
    }
    operator fun get(key: K): V? = this.items[key]

    fun has(key: K): Boolean = this.items.containsKey(key)
    fun getAll(): Map<K, V> = this.items.toMap()

    fun getOrRegister(key: K, value: V): V? {
        if (!this.has(key)) {
            this[key] = value
        }
        return this[key]
    }

    fun getOrRegister(key: K, value: () -> V): V? = getOrRegister(key, value())
}
