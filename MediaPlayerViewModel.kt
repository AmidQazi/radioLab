package com.example.radiolab

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MediaPlayerViewModel : ViewModel() {
    private var mediaPlayer: MediaPlayer? = null
    private var isPlaying: MutableState<Boolean> = mutableStateOf(false)

    fun playAudio(context: Context, url: String) {
        mediaPlayer?.let {
            if (it.isPlaying) {
                it.stop()
                it.release()
            }
        }

        mediaPlayer = MediaPlayer().apply {
            setDataSource(context, Uri.parse(url))
            prepare()
            start()
        }
        isPlaying.value = true
    }

    fun pauseAudio() {
        mediaPlayer?.pause()
        isPlaying.value = false
    }

    fun isPlaying(): Boolean {
        return isPlaying.value
    }

    override fun onCleared() {
        mediaPlayer?.release()
        super.onCleared()
    }
}