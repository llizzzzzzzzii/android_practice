package com.example.helloandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String color = getIntent().getStringExtra("color");

        int backgroundColor = 0;
        if (color.equalsIgnoreCase("red")) {
            backgroundColor = Color.RED;
        } else if (color.equalsIgnoreCase("green")) {
            backgroundColor = Color.GREEN;
        } else if (color.equalsIgnoreCase("blue")) {
            backgroundColor = Color.BLUE;
        }

        getWindow().getDecorView().setBackgroundColor(backgroundColor);

        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }
        );
    }
}

