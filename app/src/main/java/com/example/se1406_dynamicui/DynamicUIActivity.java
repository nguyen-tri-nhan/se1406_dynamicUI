package com.example.se1406_dynamicui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicUIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView txtName = new TextView(this);
        txtName.setText("Name: ");
        txtName.setLayoutParams(params);

        EditText edtName = new EditText(this);
        edtName.setLayoutParams(params);
        edtName.setId(R.id.edtName);

        TextView txtAge = new TextView(this);
        txtAge.setText("Age: ");
        txtAge.setLayoutParams(params);

        EditText edtAge = new EditText(this);
        edtAge.setLayoutParams(params);
        edtAge.setId(R.id.edtAge);

        Button btnCreate = new Button(this);
        btnCreate.setText("Create");
        btnCreate.setLayoutParams(params);

        linearLayout.addView(txtName);
        linearLayout.addView(edtName);
        linearLayout.addView(txtAge);
        linearLayout.addView(edtAge);
        linearLayout.addView(btnCreate);

        this.addContentView(linearLayout, params);


        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtName = findViewById(R.id.edtName);
                EditText edtAge = findViewById(R.id.edtAge);
                Intent intent = new Intent(DynamicUIActivity.this, ResultActivity.class);
                intent.putExtra("name", edtName.getText().toString());
                intent.putExtra("age", edtAge.getText().toString());
                startActivity(intent);
            }
        });

    }
}