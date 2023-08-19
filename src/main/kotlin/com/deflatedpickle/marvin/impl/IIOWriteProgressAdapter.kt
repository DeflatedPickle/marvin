package com.deflatedpickle.marvin.impl

import javax.imageio.ImageWriter
import javax.imageio.event.IIOWriteProgressListener

abstract class IIOWriteProgressAdapter : IIOWriteProgressListener {
    override fun imageStarted(source: ImageWriter, imageIndex: Int) {
    }

    override fun imageProgress(source: ImageWriter, percentageDone: Float) {
    }

    override fun imageComplete(source: ImageWriter) {
    }

    override fun thumbnailStarted(source: ImageWriter, imageIndex: Int, thumbnailIndex: Int) {
    }

    override fun thumbnailProgress(source: ImageWriter, percentageDone: Float) {
    }

    override fun thumbnailComplete(source: ImageWriter) {
    }

    override fun writeAborted(source: ImageWriter) {
    }
}