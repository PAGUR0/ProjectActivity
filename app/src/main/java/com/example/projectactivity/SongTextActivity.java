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
        int[] colorArray = new int[]{
                R.color.cowboys_from_hell_color, R.color.vulgar_display_of_power_color, R.color.far_beyond_driven_color, R.color.the_great_southern_trendkill_color
        };
        color = getColor(colorArray[album]);
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
                {R.string.Strength_Beyond_Strength_songtext,R.string.Becoming_songtext,R.string.Five_Minutes_Alone_songtext,
                R.string.im_Broken_songtext,R.string.Good_Friends_and_a_Bottle_Of_Pills_songtext,R.string.Hard_Lines_Sunken_Cheeks_songtext,
                R.string.twenty_five_years_songtext,R.string.Shedding_Skin_songtext,R.string.Use_My_Third_Arm_songtext,R.string.Throes_OfRejection_songtext,
                R.string.Planet_Caravan_songtext},
                {R.string.The_Great_Southern_Trendkill_songtext,R.string.War_Nerve_songtext,R.string.Drag_The_Waters_songtext,
                R.string.tens_songtext,R.string.thirteen_steps_to_nowhere_songtext,R.string.Suicide_Note_pt1_songtext,R.string.Suicide_Note_pt2_songtext,
                        R.string.Living_Through_Me_songtext_Hells_Wrath_songetxt,R.string.Floods_songtext,R.string.The_Underground_In_Amerika_songtext,R.string.Reprise_Sandblasted_Skin_songtext
                }
        };
        song = getResources().getString(Integer.parseInt(String.valueOf(songs[album][songNumber])));
        textView.setText(song);
        }

    }
