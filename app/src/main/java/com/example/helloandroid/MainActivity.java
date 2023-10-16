package com.example.helloandroid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText colorText;
    Button b0k;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorText = findViewById(R.id.colorText);
        b0k = findViewById(R.id.b0k);

        b0k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent eintent = new Intent(MainActivity.this, SecondActivity.class);
                eintent.putExtra("color", colorText.getText().toString());
                startActivity(eintent);
            }
        });
    }
}
