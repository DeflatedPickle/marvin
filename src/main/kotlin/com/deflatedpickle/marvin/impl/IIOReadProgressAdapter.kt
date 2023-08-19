package com.deflatedpickle.marvin.impl

import javax.imageio.ImageReader
import javax.imageio.event.IIOReadProgressListener

abstract class IIOReadProgressAdapter : IIOReadProgressListener {
    override fun sequenceStarted(source: ImageReader, minIndex: Int) {
    }

    override fun sequenceComplete(source: ImageReader) {
    }

    override fun imageStarted(source: ImageReader, imageIndex: Int) {
    }

    override fun imageProgress(source: ImageReader, percentageDone: Float) {
    }

    override fun imageComplete(source: ImageReader) {
    }

    override fun thumbnailStarted(source: ImageReader, imageIndex: Int, thumbnailIndex: Int) {
    }

    override fun thumbnailProgress(source: ImageReader, percentageDone: Float) {
    }

    override fun thumbnailComplete(source: ImageReader) {
    }

    override fun readAborted(source: ImageReader) {
    }
}