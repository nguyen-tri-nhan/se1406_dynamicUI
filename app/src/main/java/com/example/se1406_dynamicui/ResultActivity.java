package com.example.se1406_dynamicui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtResult = findViewById(R.id.txtResult);

        Intent intent = this.getIntent();
        String age = intent.getStringExtra("age");
        String name = intent.getStringExtra("name");

        txtResult.setText("Name: " + name + " - Age: " + age);
    }
}