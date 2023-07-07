package com.converter.bequizzy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button start, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        start = (Button) findViewById(R.id.start);
        about = (Button) findViewById(R.id.about);
        name = (EditText) findViewById(R.id.name);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getname = name.getText().toString().trim();
                if (getname.isEmpty() || getname.length() == 0 || getname.equals("") || name == null) {
                    Toast.makeText(MainActivity.this, "First Enter Your Name To Start a Quiz", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), activity_start.class);
                    intent.putExtra("name", getname);
                    startActivity(intent);
                }

            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}