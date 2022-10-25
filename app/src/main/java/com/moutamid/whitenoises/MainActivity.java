package com.moutamid.whitenoises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wind, sea, rain, bird, underwater;
    TextView donate, privacy;

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
        donate = findViewById(R.id.donate);
        privacy = findViewById(R.id.privacy);
        underwater = findViewById(R.id.underWater);

        donate.setOnClickListener(v -> {
            startActivity(new Intent(this, DonateActivity.class));
        });

        privacy.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/e/2PACX-1vTaamuI6mk-5pJoPbLJcPUgLgWuMWW5t-de2_mfVQtnfo9hlDBlVC68PpNkXd8PmyslfmMzylh70KC0/pub"));
            startActivity(browserIntent);
        });

        wind.setOnClickListener(v -> {
            if (windSound.isPlaying()) {
                windSound.pause();
            } else {
                if (rainSound.isPlaying()) {
                    rainSound.pause();
                }
                if (seaSound.isPlaying()) {
                    seaSound.pause();
                }
                if (birdSound.isPlaying()) {
                    birdSound.pause();
                }
                if (underSound.isPlaying()) {
                    underSound.pause();
                }

                windSound.start();
            }
        });
        rain.setOnClickListener(v -> {
            if (rainSound.isPlaying()) {
                rainSound.pause();
            } else {
                if (windSound.isPlaying()) {
                    windSound.pause();
                }
                if (seaSound.isPlaying()) {
                    seaSound.pause();
                }
                if (birdSound.isPlaying()) {
                    birdSound.pause();
                }
                if (underSound.isPlaying()) {
                    underSound.pause();
                }
                rainSound.start();
            }
        });
        sea.setOnClickListener(v -> {
            if (seaSound.isPlaying()) {
                seaSound.pause();
            } else {
                if (windSound.isPlaying()) {
                    windSound.pause();
                }
                if (rainSound.isPlaying()) {
                    rainSound.pause();
                }
                if (birdSound.isPlaying()) {
                    birdSound.pause();
                }
                if (underSound.isPlaying()) {
                    underSound.pause();
                }
                seaSound.start();
            }
        });
        bird.setOnClickListener(v -> {
            if (birdSound.isPlaying()) {
                birdSound.pause();
            } else {
                if (windSound.isPlaying()) {
                    windSound.pause();
                }
                if (rainSound.isPlaying()) {
                    rainSound.pause();
                }
                if (seaSound.isPlaying()) {
                    seaSound.pause();
                }
                if (underSound.isPlaying()) {
                    underSound.pause();
                }
                birdSound.start();
            }
        });
        underwater.setOnClickListener(v -> {
            if (underSound.isPlaying()) {
                underSound.pause();
            } else {
                if (windSound.isPlaying()) {
                    windSound.pause();
                }
                if (rainSound.isPlaying()) {
                    rainSound.pause();
                }
                if (birdSound.isPlaying()) {
                    birdSound.pause();
                }
                if (seaSound.isPlaying()) {
                    seaSound.pause();
                }
                underSound.start();
            }
        });

    }
}