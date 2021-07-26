@file:Suppress("unused")

package com.deflatedpickle.marvin.extensions

import java.io.File
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.attribute.DosFileAttributes
import java.nio.file.attribute.FileTime
import java.nio.file.attribute.PosixFileAttributes
import java.nio.file.attribute.PosixFilePermission
import java.nio.file.attribute.UserPrincipal

operator fun File.div(next: File) = this.resolve(next)
operator fun File.div(next: String) = this.resolve(next)

fun File.size() = Files.size(this.toPath())

// fun File.isDirectory() = Files.isDirectory(this.toPath())
fun File.isRegularFile() = Files.isRegularFile(this.toPath())
fun File.isSymbolicLink() = Files.isSymbolicLink(this.toPath())
// fun File.isHidden() = Files.isHidden(this.toPath())

fun File.getLastModifiedTime(vararg linkOptions: LinkOption) = Files.getLastModifiedTime(this.toPath(), *linkOptions)!!
fun File.setLastModifiedTime(fileTime: FileTime) = Files.setLastModifiedTime(this.toPath(), fileTime)!!

fun File.getOwner(vararg linkOptions: LinkOption) = Files.getOwner(this.toPath(), *linkOptions)!!
fun File.setOwner(userPrincipal: UserPrincipal) = Files.setOwner(this.toPath(), userPrincipal)!!

fun File.getPosixFilePermissions(vararg linkOptions: LinkOption): MutableSet<PosixFilePermission> =
    Files.getPosixFilePermissions(this.toPath(), *linkOptions)!!

fun File.setPosixFilePermissions(vararg filePermissions: PosixFilePermission) =
    Files.setPosixFilePermissions(this.toPath(), filePermissions.toSet())!!

fun File.getAttribute(string: String, vararg linkOptions: LinkOption) =
    Files.getAttribute(this.toPath(), string, *linkOptions)!!

fun <T : Any> File.setAttribute(string: String, obj: T, vararg linkOptions: LinkOption) =
    Files.setAttribute(this.toPath(), string, obj, *linkOptions)!!

fun File.readAttributes(string: String, vararg linkOptions: LinkOption): MutableMap<String, Any> =
    Files.readAttributes(this.toPath(), string, *linkOptions)!!

fun <T : BasicFileAttributes> File.readAttributes(clazz: Class<T>, vararg linkOptions: LinkOption) =
    Files.readAttributes(this.toPath(), clazz, *linkOptions)!!

fun File.readBasicAttributes(vararg linkOptions: LinkOption) =
    readAttributes(BasicFileAttributes::class.java, *linkOptions)

fun File.readDosAttributes(vararg linkOptions: LinkOption) =
    readAttributes(DosFileAttributes::class.java, *linkOptions)

fun File.readPosixAttributes(vararg linkOptions: LinkOption) =
    readAttributes(PosixFileAttributes::class.java, *linkOptions)

fun File.isReadable() = Files.isReadable(this.toPath())
fun File.isWritable() = Files.isWritable(this.toPath())
fun File.isExecutable() = Files.isExecutable(this.toPath())