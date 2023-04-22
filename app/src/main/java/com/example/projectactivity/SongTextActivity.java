package com.example.projectactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class SongTextActivity extends AppCompatActivity {

    @SuppressLint({"ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        TextView textView = findViewById(R.id.text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        int album = intent.getIntExtra("album", 0);
        int songNumber = intent.getIntExtra("songNumber", 0);
        String song;
        String[][] songs = {
                {String.valueOf((R.string.cowboys_from_hell_songtext)), String.valueOf((R.string.primal_concrete_sledge_songtext)), String.valueOf((R.string.cowboys_from_hell_songtext))},
                {},
                {},
                {}
        };
        song = getResources().getString(Integer.parseInt(songs[album][songNumber]));
        textView.setText(song);
        }

    }
