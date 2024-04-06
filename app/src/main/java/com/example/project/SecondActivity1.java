package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity1 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);

        Toolbar toolbar= findViewById(R.id.tb);
        setSupportActionBar(toolbar);

        newArray= new int[]{
                R.id.Mountain_claimber, R.id.Basic_Crunches, R.id.Bench_dips, R.id.Bicycle_Crunches,
                R.id.Leg_Raise, R.id.leg_up_crunches, R.id.sit_up, R.id.Malternative_V_Ups, R.id.Plank_Rotation,
                R.id.Plank_With_Leg_Left, R.id.Russian_Twist, R.id.Bridge, R.id.Vertica_leg_crunches, R.id.Wind_Mill
        };
    }

    public void imagebuttonclicked1(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, mountain_claimberActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked2(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, basic_crunchesActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked3(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, bench_dipsActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked4(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, bicycle_crunchesActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked5(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, leg_raiseActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked6(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, leg_up_crunchesActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked7(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, sit_upActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked8(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, malternative_V_UpsActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked9(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, plank_rotationActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked10(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, plank_with_leg_leftActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked11(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, russian_twistActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked12(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, bridgeActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked13(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, vertica_leg_crunchesActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }

    public void imagebuttonclicked14(View view) {
        for(int i=0; i<= newArray.length; i++){
            if(view.getId()== newArray[i]){
                int value= i+1;
                Log.i("First",String.valueOf(value));
                Intent intent= new Intent(SecondActivity1.this, wind_millActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}