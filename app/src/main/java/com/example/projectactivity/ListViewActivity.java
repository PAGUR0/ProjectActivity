package com.example.projectactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Arrays;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView songsList = findViewById(R.id.songsList);
        Intent intent = getIntent();
        int input = intent.getIntExtra("input", 0);
        String[] songs = new String[20];
        switch (input){
            case 1:
                songs = getResources().getStringArray(R.array.cowboys_from_hell_songs);
                break;
            case 2:
                songs = getResources().getStringArray(R.array.vulgar_display_of_power_songs);
                break;
            case 3:
                songs = getResources().getStringArray(R.array.far_beyond_driven_songs);
                break;
            case 4:
                songs = getResources().getStringArray(R.array.the_great_southern_trendkill_songs);
                break;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, songs);
        songsList.setAdapter(adapter);
    }
}