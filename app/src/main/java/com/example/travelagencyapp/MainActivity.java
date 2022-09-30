package com.example.travelagencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelagencyapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btn.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,home.class));

        });

        binding.go.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,home.class));

        });
    }
}