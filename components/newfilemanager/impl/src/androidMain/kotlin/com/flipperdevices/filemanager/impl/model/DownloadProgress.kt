package com.flipperdevices.filemanager.impl.model

sealed class DownloadProgress {
    data class Fixed(
        val progressInternal: Long = 0,
        val totalSize: Long
    ) : DownloadProgress() {
        fun toProgressFloat() = if (totalSize != 0L) {
            progress.toFloat() / totalSize.toFloat()
        } else {
            0f
        }
    }

    data class Infinite(
        val progressInternal: Long = 0
    ) : DownloadProgress()

    val progress: Long
        get() = when (this) {
            is Fixed -> progressInternal
            is Infinite -> progressInternal
        }

    fun updateProgress(delta: Long): DownloadProgress {
        return when (this) {
            is Fixed -> copy(
                progressInternal = progressInternal + delta
            )
            is Infinite -> copy(
                progressInternal = progressInternal + delta
            )
        }
    }
}
