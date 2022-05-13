package com.example.group8_capstone;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.pm.ActivityInfo;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.group8_capstone.databinding.BotNavBinding;

import java.util.Objects;

public class BotNav extends AppCompatActivity implements View.OnClickListener {

    BotNavBinding binding;

    @SuppressLint({"NonConstantResourceId", "SourceLockedOrientationActivity"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = BotNavBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadFragment(new HomeFragment());
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bot_home:
                    loadFragment(new HomeFragment());
                    break;
                case R.id.bot_search:
                    loadFragment(new SearchFragment());
                    break;
                case R.id.bot_notif:
                    loadFragment(new NotifFragment());
            }

            return true;
        });
    }


    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentFrameLayout,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {

    }
}
