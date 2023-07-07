package com.converter.bequizzy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class scoreActivity extends AppCompatActivity {
    TextView correct, wrong, final_s;
    Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        correct = findViewById(R.id.textView5);
        wrong = findViewById(R.id.textView11);
        final_s = findViewById(R.id.textView12);
        restart = findViewById(R.id.button);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        int finalScore = intent.getIntExtra("score", -1);
        correct.setText("Correct answers: " + finalScore);
        wrong.setText("Wrong answers: " + (5 - finalScore));
        final_s.setText("Final score: " + (finalScore));
    }
}