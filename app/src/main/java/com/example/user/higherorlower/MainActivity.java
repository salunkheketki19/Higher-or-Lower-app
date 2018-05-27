package com.example.user.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;

    public void guessButton(View view){

        EditText numberText = (EditText) findViewById(R.id.numberText);

        int guessNumber =  Integer.parseInt(numberText.getText().toString());

        if( guessNumber > n){
            Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_LONG).show();
        }
        else if( guessNumber < n){
            Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Yeah Ur Righ!! Try again!", Toast.LENGTH_LONG).show();

            Random rand = new Random();
            n = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        n = rand.nextInt(20) + 1;
    }
}
