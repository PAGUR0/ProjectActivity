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
        String[] songs = new String[20];
        int color = 0;
        switch (input){
            case 1:
                songs = getResources().getStringArray(R.array.cowboys_from_hell_songs);
                color = getColor(R.color.cowboys_from_hell_color);
                break;
            case 2:
                songs = getResources().getStringArray(R.array.vulgar_display_of_power_songs);
                color = getColor(R.color.vulgar_display_of_power_color);
                break;
            case 3:
                songs = getResources().getStringArray(R.array.far_beyond_driven_songs);
                color = getColor(R.color.far_beyond_driven_color);
                break;
            case 4:
                songs = getResources().getStringArray(R.array.the_great_southern_trendkill_songs);
                color = getColor(R.color.the_great_southern_trendkill_color);
                break;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songs);
        songsList.setAdapter(adapter);
        songsList.setBackgroundColor(color);
        songsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0,
                                    View arg1, int position, long arg3) {
                Intent intent = null;
                switch (position) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        intent = new Intent(ListViewActivity.this, SongTextActivity.class);
                        intent.putExtra("album", input);
                        intent.putExtra("songNumber", position);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}