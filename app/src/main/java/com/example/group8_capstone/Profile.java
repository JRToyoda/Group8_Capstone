package com.example.group8_capstone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class Profile extends AppCompatActivity {
    Button back, logout, calendar, settings;

    @SuppressLint("SourceLockedOrientationActivity")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.profile);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        logout = findViewById(R.id.logout);
        back = findViewById(R.id.backProfile);
        calendar = findViewById(R.id.calendar);
        settings = findViewById(R.id.settings);

        logout.setOnClickListener(v -> {
            Intent intent = new Intent(Profile.this, Login.class);
            startActivity(intent);
        });

        back.setOnClickListener(v -> finish());

        calendar.setOnClickListener(v -> {
            Intent intent = new Intent(Profile.this, Calendar.class);
            startActivity(intent);
        });

        settings.setOnClickListener(v -> {
            Intent intent = new Intent(Profile.this, Settings.class);
            startActivity(intent);
        });
    }
}
