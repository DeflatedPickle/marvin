package com.deflatedpickle.marvin.util

@Suppress("MemberVisibilityCanBePrivate", "unused")
object OSUtil {
    val os = System.getProperty("os.name").toLowerCase()

    fun isWindows() = os.contains("win")
    fun isLinux() = os.contains("linux")
    fun isMac() = os.contains("mac")
    fun isSolaris() = os.contains("sunos")

    fun getOS(): OS = when {
        isWindows() -> OS.WINDOWS
        isLinux() -> OS.LINUX
        isMac() -> OS.MAC
        isSolaris() -> OS.SOLARIS
        else -> OS.UNKNOWN
    }

    enum class OS {
        WINDOWS,
        LINUX,
        MAC,
        SOLARIS,

        UNKNOWN
    }
}