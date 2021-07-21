package com.example.hermesplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.runRn);
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ReactNative.class);
            startActivity(intent);
        });
    }
}
