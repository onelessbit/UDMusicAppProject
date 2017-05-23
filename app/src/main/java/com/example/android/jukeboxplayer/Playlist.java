package com.example.android.jukeboxplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Find the Views that move us between activities
        ImageButton openNowPlaying = (ImageButton) findViewById(R.id.goToNowPlaying);
        ImageButton openLibrary = (ImageButton) findViewById(R.id.goToLibrary);


        // Set a click listener for the Now Playing
        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlaying}
                Intent nowPlayingIntent = new Intent(Playlist.this, MainActivityNowPlaying.class);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Set a click listener for the Library
        openLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Library icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Library}
                Intent libraryIntent = new Intent(Playlist.this, LibraryActivity.class);
                // Start the new activity
                startActivity(libraryIntent);
            }
        });
    }
}
