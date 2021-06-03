package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // widgets
    private Button btnGo;
    private TextView tvSum;

    // variables
    private Random randomNumber;
    private int firstNumber, secondNumber;
    private int locationOfCorrectAnswers, correctAnswer, inCorrectAnswers;
    private ArrayList<Integer> sumAnswers;

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

        correctAnswer = firstNumber + secondNumber;

        String sumText = firstNumber + " + " + secondNumber;

        tvSum.setText(sumText);

        locationOfCorrectAnswers = randomNumber.nextInt(4);

        for (int i = 0; i < 4; i++){

            if (locationOfCorrectAnswers == i) {
                sumAnswers.add(correctAnswer);
            } else {

                inCorrectAnswers = randomNumber.nextInt(41);

                while (inCorrectAnswers == correctAnswer) {

                    inCorrectAnswers = randomNumber.nextInt(41);

                }

                sumAnswers.add(inCorrectAnswers);

            }

        }
    }

}