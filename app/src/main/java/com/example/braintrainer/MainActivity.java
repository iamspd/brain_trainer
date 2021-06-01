package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // widgets
    private Button btnGo;
    private TextView tvSum;

    // variables
    private Random randomNumber;
    private int firstNumber, secondNumber;

    // methods
    public void onGoClick(View view){
        btnGo.setVisibility(View.INVISIBLE);
    }

    private void findAllViews() {

        btnGo = findViewById(R.id.btnGo);
        tvSum = findViewById(R.id.tvSum);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViews();

        // generate a random number having the limit for 20 numbers (0-20)
        randomNumber = new Random();
        firstNumber = randomNumber.nextInt(21);
        secondNumber = randomNumber.nextInt(21);

        String sum = firstNumber + " + " + secondNumber;

        tvSum.setText(sum);
    }

}