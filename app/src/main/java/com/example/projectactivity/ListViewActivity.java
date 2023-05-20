package com.example.projectactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    @SuppressLint({"ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView songsList = findViewById(R.id.songsList);
        Intent intent = getIntent();
        int input = intent.getIntExtra("input", 0);
        int[] colorArray = new int[]{
                R.color.cowboys_from_hell_color, R.color.vulgar_display_of_power_color, R.color.far_beyond_driven_color, R.color.the_great_southern_trendkill_color
        };
        int[] songsArray = new int[]{
                R.array.cowboys_from_hell_songs, R.array.vulgar_display_of_power_songs, R.array.far_beyond_driven_songs, R.array.the_great_southern_trendkill_songs
        };
        int color = getColor(colorArray[input]);
        String[] songs = getResources().getStringArray(songsArray[input]);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songs);
        songsList.setAdapter(adapter);
        songsList.setBackgroundColor(color);
        songsList.setOnItemClickListener((arg0, arg1, position, arg3) -> {
            Intent intent1 = new Intent(ListViewActivity.this, SongTextActivity.class);
            intent1.putExtra("album", input);
            intent1.putExtra("songNumber", position);
            startActivity(intent1);
        });
}
}

