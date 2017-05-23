package com.example.android.jukeboxplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Find the Views that move us between activities
        ImageButton openNowPlaying = (ImageButton) findViewById(R.id.goToNowPlaying);
        ImageButton openPlaylist = (ImageButton) findViewById(R.id.goToPlaylist);


        // Set a click listener for the Now Playing
        openNowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Now Playing icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlaying}
                Intent nowPlayingIntent = new Intent(LibraryActivity.this, MainActivityNowPlaying.class);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Set a click listener for the Playlist
        openPlaylist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Library icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Library}
                Intent playlistIntent = new Intent(LibraryActivity.this, Playlist.class);
                // Start the new activity
                startActivity(playlistIntent);
            }
        });

    }
}
