package com.example.group8_capstone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.pm.ActivityInfo;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.group8_capstone.databinding.TpNavBinding;

import java.util.Objects;

public class TopNav extends AppCompatActivity {

    TpNavBinding binding;
    Button back;

    @SuppressLint({"NonConstantResourceId", "SourceLockedOrientationActivity", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = TpNavBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadFragment(new HomeFragment2());
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        back = findViewById(R.id.backTop);

        back.setOnClickListener(v -> finish());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.top_home:
                    loadFragment(new HomeFragment2());
                    break;
                case R.id.top_person:
                    loadFragment(new PersonFragment());
                    break;
                case R.id.top_gallery:
                    loadFragment(new GalleryFragment());
                    break;
                case R.id.top_reviews:
                    loadFragment(new ReviewsFragment());
            }

            return true;
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentFrameLayout2,fragment);
        fragmentTransaction.commit();
    }
}