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

        CowboysButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 1);
            startActivity(intent);
            });
        CowboysButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 1);
            startActivity(intent);
        });
        CowboysButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 1);
            startActivity(intent);
        });
        CowboysButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            intent.putExtra("input", 1);
            startActivity(intent);
        });
    }

}
