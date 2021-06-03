package com.example.videostreamingassignment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var playerView: PlayerView
//    var player: SimpleExoPlayer? = null
//    var playWhenReady = true
//    var currentWindow = 0
//    var playBackPosition: Long = 0
    var url = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //playerView = findViewById(R.id.video_view)

        al_fateha.setOnClickListener {
            intent("https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D9%81%D8%A7%D8%AA%D8%AD%D8%A9.mp4?alt=media&token=87a1bb09-86bb-4b57-a77e-2d0bd40866a7")
//            url = "https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D9%81%D8%A7%D8%AA%D8%AD%D8%A9.mp4?alt=media&token=87a1bb09-86bb-4b57-a77e-2d0bd40866a7"
//            releaseVideo()
//            initVideo()
        }

        al_ekhlas.setOnClickListener {
            intent("https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D8%A5%D8%AE%D9%84%D8%A7%D8%B5.mp4?alt=media&token=f9d3a36d-66a6-43e0-99cf-ac416fdb85be")
//            url = "https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D8%A5%D8%AE%D9%84%D8%A7%D8%B5.mp4?alt=media&token=f9d3a36d-66a6-43e0-99cf-ac416fdb85be"
//            releaseVideo()
//            initVideo()
        }

        al_nas.setOnClickListener {
            intent("https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D9%86%D8%A7%D8%B3.mp4?alt=media&token=c54d0d75-f350-47bb-a77f-7908e00fe529")
//            url = "https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D9%86%D8%A7%D8%B3.mp4?alt=media&token=c54d0d75-f350-47bb-a77f-7908e00fe529"
//            releaseVideo()
//            initVideo()
        }

        al_falak.setOnClickListener {
            intent("https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D9%81%D9%84%D9%82.mp4?alt=media&token=5c44e20d-121a-489a-8f09-f6fda2ecae0e")
//            url = "https://firebasestorage.googleapis.com/v0/b/cloud-project-e56e1.appspot.com/o/Vedio%2F%D8%B3%D9%88%D8%B1%D8%A9%20%D8%A7%D9%84%D9%81%D9%84%D9%82.mp4?alt=media&token=5c44e20d-121a-489a-8f09-f6fda2ecae0e"
//            releaseVideo()
//            initVideo()
        }

    }


    fun intent(url: String) {
        val i = Intent(this, VideoStreamingActivity::class.java)
        i.putExtra("URL", url)
        startActivity(i)
    }

//    fun initVideo() {
//        player = ExoPlayerFactory.newSimpleInstance(this)
//        playerView.player = player
//        var uri = Uri.parse(url)
//
//        var dataSourceFactory = DefaultDataSourceFactory(this, "exoplayer-codelab")
//        var mediaSource = ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(uri)
//
//
//        player!!.playWhenReady = playWhenReady
//        player!!.seekTo(currentWindow, playBackPosition)
//        player!!.prepare(mediaSource, false, false)
//
//    }
//
//    fun releaseVideo() {
//        if (player != null) {
//            playWhenReady = player!!.playWhenReady
//            playBackPosition = player!!.currentPosition
//            currentWindow = player!!.currentWindowIndex
//            player!!.release()
//            player = null
//        }
//    }
//
//    override fun onStart() {
//        super.onStart()
//        initVideo()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        if (player != null) {
//            initVideo()
//        }
//    }
//
//    override fun onStop() {
//        super.onStop()
//        releaseVideo()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        releaseVideo()
//    }

}