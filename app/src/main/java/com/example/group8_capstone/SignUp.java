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

public class SignUp extends AppCompatActivity {

    EditText username, email, password;
    Button signUp, login;

    @SuppressLint("SourceLockedOrientationActivity")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.signup);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        username = findViewById(R.id.inputName);
        email = findViewById(R.id.inputEmail2);
        password = findViewById(R.id.inputPassword2);
        signUp = findViewById(R.id.signup2);
        login = findViewById(R.id.login2);

        signUp.setOnClickListener(v -> {
            Intent intent = new Intent(SignUp.this,BotNav.class);
            if(username.getText().toString().equals("") || email.getText().toString().equals("") || password.getText().toString().equals("")) {
                Toast.makeText(SignUp.this,"LACKING INFORMATION",Toast.LENGTH_LONG).show();
            } else {
                startActivity(intent);
            }
        });

        login.setOnClickListener(v -> {
            Intent intent = new Intent(SignUp.this,Login.class);
            startActivity(intent);
        });
    }
}
