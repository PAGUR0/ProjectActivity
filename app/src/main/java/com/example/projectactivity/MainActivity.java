package com.example.projectactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton CowboysButton = findViewById(R.id.cowboys_from_hell);
        ImageButton VulgarDisplayButton = findViewById(R.id.vulgar_display_of_power);
        ImageButton FarBeyondButton = findViewById(R.id.far_beyond_driven);
        ImageButton TheGreatButton = findViewById(R.id.the_great_southern_trendkill);

        CowboysButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 1);
            startActivity(intent);
            });
        VulgarDisplayButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 2);
            startActivity(intent);
        });
        FarBeyondButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 3);
            startActivity(intent);
        });
        TheGreatButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 4);
            startActivity(intent);
        });
    }

}
