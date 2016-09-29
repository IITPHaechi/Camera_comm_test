package com.example.cholmink.camera_comm_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView)findViewById(R.id.myVideo);

        String vidAddress = "http://172.24.1.1/video";
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        mediaController.setMediaPlayer(videoView);
        Uri vidUri = Uri.parse(vidAddress);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(vidUri);

        videoView.requestFocus();
        videoView.start();


    }
}
