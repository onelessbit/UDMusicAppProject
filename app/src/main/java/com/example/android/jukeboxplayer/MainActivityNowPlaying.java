package com.example.android.jukeboxplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivityNowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_now_playing);

        // Find the Views that move us between activities
        ImageButton openPlaylist = (ImageButton) findViewById(R.id.goToPlaylist);
        ImageButton openLibrary = (ImageButton) findViewById(R.id.goToLibrary);


        // Set a click listener for the Playlist
        openPlaylist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlist icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Playlist}
                Intent playlistIntent = new Intent(MainActivityNowPlaying.this, Playlist.class);
                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // Set a click listener for the Library
        openLibrary.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Library icon is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Library}
                Intent libraryIntent = new Intent(MainActivityNowPlaying.this, LibraryActivity.class);
                // Start the new activity
                startActivity(libraryIntent);
            }
        });


    }

}
