package com.example.classtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TestVideoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);
        String url = "https://hajifirouz2.cdn.asset.aparat.com/aparat-video/a9406f8049737951333f1f85a81852fa29203412-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6ImFlMzcxN2EyNzExYTBmOTQ5NzVmZTA1MmU3MzdhMWU4IiwiZXhwIjoxNjExMjY1NDkyLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.e0ismogPxBacU3gWU2xyIYA-e1es8yjND6a_D_VDtk8";
        VideoView video = findViewById(R.id.video);
        video.setVideoURI(Uri.parse(url));
        video.setMediaController(new MediaController(TestVideoView.this));
        video.start();
    }
}