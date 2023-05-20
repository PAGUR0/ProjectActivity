package com.example.projectactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ListView;
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
        int color = 0;
        switch (album) {
            case 0:
                color = getColor(R.color.cowboys_from_hell_color);
                break;
            case 1:
                color = getColor(R.color.vulgar_display_of_power_color);
                break;
            case 2:
                color = getColor(R.color.far_beyond_driven_color);
                break;
            case 3:
                color = getColor(R.color.the_great_southern_trendkill_color);
                break;
        }
        textView.setBackgroundColor(color);
        String song;
        int[][] songs = new int[][]{
                {R.string.cowboys_from_hell_songtext, R.string.primal_concrete_sledge_songtext, R.string.psycho_holiday_songtext,
                        R.string.heresy_songtext, R.string.cemetery_gates_songtext, R.string.domination_songtext,
                        R.string.shattered_songtext, R.string.clash_with_realty_songtext, R.string.medicine_man_songtext,
                        R.string.message_in_blood_songtext, R.string.the_sleep_songtext, R.string.the_art_of_shredding_songtext},
                {R.string.mouth_for_war_songtext, R.string.a_new_level_songtext, R.string.walk_songtext,
                        R.string.fucking_hostile_songtext, R.string.this_love_songtext, R.string.rise_songtext,
                        R.string.no_good_songtext, R.string.live_in_hole_songtext, R.string.regular_people_songetext,
                        R.string.by_demons_be_driven_songtext, R.string.hollow_songtext},
                {},
                {}
        };
        song = getResources().getString(Integer.parseInt(String.valueOf(songs[album][songNumber])));
        textView.setText(song);
        }

    }
