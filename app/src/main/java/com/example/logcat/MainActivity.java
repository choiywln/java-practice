package com.example.logcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.logcat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.i("최예원", "onCreate 실행됩니다");

        binding.button1.setOnClickListener(v -> printLog("Button1 Clicked"));
        binding.button2.setOnClickListener(v -> printLog("Button2 Clicked"));
        binding.button3.setOnClickListener(v -> printLog("Button3 Clicked"));
        binding.button4.setOnClickListener(v -> printLog("Button4 Clicked"));
        binding.buttoncenter.setOnClickListener(v -> {
            Log.i("최예원", "TextView: " + binding.textView.getText());
            Log.i("최예원", "EditTextView: " + binding.edit.getText());
        });
    }

    private void printLog(String message) {
        Log.i("최예원", message);
    }
}