package com.example.group8_capstone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class Choose extends AppCompatActivity implements View.OnClickListener {

    Button art, music, beach, romance, horror, sports;

    @SuppressLint("SourceLockedOrientationActivity")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.choose);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        art = findViewById(R.id.art);
        music = findViewById(R.id.music);
        beach = findViewById(R.id.beach);
        romance = findViewById(R.id.romance);
        horror = findViewById(R.id.horror);
        sports = findViewById(R.id.sports);

        art.setOnClickListener(this);
        music.setOnClickListener(this);
        beach.setOnClickListener(this);
        romance.setOnClickListener(this);
        horror.setOnClickListener(this);
        sports.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Choose.this, BotNav.class);
        startActivity(intent);
    }
}