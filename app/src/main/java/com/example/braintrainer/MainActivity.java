package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // constants
    private static final String TAG = "MainActivity";

    // widgets
    private Button btnGo, btn0, btn1, btn2, btn3;
    private TextView tvSum;

    // variables
    private Random randomNumber;
    private int firstNumber, secondNumber;
    private int locationOfCorrectAnswers, correctAnswer, inCorrectAnswers;
    private ArrayList<Integer> sumAnswers;

    // methods
    public void onAnswerButtonClick(View view){

        // Log.i(TAG, (String) view.getTag());

        if (view.getTag().equals(locationOfCorrectAnswers)){

            Log.i("Answer is: ", "correct");

        }

    }

    public void onGoClick(View view){
        btnGo.setVisibility(View.INVISIBLE);
    }

    private void findAllViews() {

        btnGo = findViewById(R.id.btnGo);
        tvSum = findViewById(R.id.tvSum);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViews();

        sumAnswers = new ArrayList<>();

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

        btn0.setText(Integer.toString(sumAnswers.get(0)));
        btn1.setText(Integer.toString(sumAnswers.get(1)));
        btn2.setText(Integer.toString(sumAnswers.get(2)));
        btn3.setText(Integer.toString(sumAnswers.get(3)));
    }

}