package com.example.group8_capstone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity implements View.OnClickListener {

    Button back, pfp, name, email, password;

    @SuppressLint("SourceLockedOrientationActivity")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.settings);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        back = findViewById(R.id.backSet);
        pfp = findViewById(R.id.changePfp);
        name = findViewById(R.id.changeName);
        email = findViewById(R.id.changeEmail);
        password = findViewById(R.id.changePassword);

        pfp.setOnClickListener(this);
        name.setOnClickListener(this);
        email.setOnClickListener(this);
        password.setOnClickListener(this);

        back.setOnClickListener(v -> finish());

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Settings.this, Custom.class);
        startActivity(intent);
    }
}
