package com.example.group8_capstone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;



public class Login extends AppCompatActivity {

    EditText email, password;
    Button login, signUp;

    @SuppressLint("SourceLockedOrientationActivity")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        email = findViewById(R.id.inputEmail);
        password = findViewById(R.id.inputPassword);
        login = findViewById(R.id.login);
        signUp = findViewById(R.id.signup);

        login.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this,BotNav.class);
            if(email.getText().toString().equals("") || password.getText().toString().equals("")) {
                Toast.makeText(Login.this,"LACKING INFORMATION",Toast.LENGTH_LONG).show();
            } else {
                startActivity(intent);
            }
        });

        signUp.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this,SignUp.class);
            startActivity(intent);
        });
    }
}