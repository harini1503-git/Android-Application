package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class malternative_V_UpsActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private CountDownTimer countDownTimer;
    String buttonvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malternative_vups);

        textView = findViewById(R.id.textview);
        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long secondsUntilFinished = millisUntilFinished / 1000;
                textView.setText(String.format("%02d:%02d", secondsUntilFinished / 60, secondsUntilFinished % 60));
            }

            @Override
            public void onFinish() {
                textView.setText("00:00");
            }
        }.start();
    }
}