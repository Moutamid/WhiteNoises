package com.moutamid.whitenoises;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wind, sea, rain, bird, underwater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer windSound = MediaPlayer.create(this, R.raw.light_wind);
        final MediaPlayer seaSound = MediaPlayer.create(this, R.raw.sea_waves_with_birds);
        final MediaPlayer rainSound = MediaPlayer.create(this, R.raw.forest_rain);
        final MediaPlayer birdSound = MediaPlayer.create(this, R.raw.forest_birds_chirp);
        final MediaPlayer underSound = MediaPlayer.create(this, R.raw.underwater_white_noise);

        wind = findViewById(R.id.wind);
        sea = findViewById(R.id.sea);
        rain = findViewById(R.id.rain);
        bird = findViewById(R.id.bird);
        underwater = findViewById(R.id.underWater);

        wind.setOnClickListener(v -> {
            if (windSound.isPlaying()) {
                windSound.pause();
            } else {
                windSound.start();
            }
        });
        rain.setOnClickListener(v -> {
            if (rainSound.isPlaying()) {
                rainSound.pause();
            } else {
                rainSound.start();
            }
        });
        sea.setOnClickListener(v -> {
            if (seaSound.isPlaying()) {
                seaSound.pause();
            } else {
                seaSound.start();
            }
        });
        bird.setOnClickListener(v -> {
            if (birdSound.isPlaying()) {
                birdSound.pause();
            } else {
                birdSound.start();
            }
        });
        underwater.setOnClickListener(v -> {
            if (underSound.isPlaying()) {
                underSound.pause();
            } else {
                underSound.start();
            }
        });

    }
}