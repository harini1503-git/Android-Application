package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= findViewById(R.id.tb);
        setSupportActionBar(toolbar);

        bt1= findViewById(R.id.button1);
        bt2= findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, SecondActivity1.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, SecondActivity1.class);
                startActivity(intent);
            }
        });
    }


    public void under_age_18(View view) {
        Intent intent= new Intent(MainActivity.this, SecondActivity1.class);
        startActivity(intent);
    }

    public void above_age_18(View view) {
        Intent intent= new Intent(MainActivity.this, SecondActivity1.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent= new Intent(MainActivity.this, FoodActivity.class);
        startActivity(intent);
    }
}