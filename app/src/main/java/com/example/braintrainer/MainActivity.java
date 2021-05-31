package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // widgets
    private Button btnGo;

    // methods
    public void onGoClick(View view){
        btnGo.setVisibility(View.INVISIBLE);
    }

    private void findAllViews() {

        btnGo = findViewById(R.id.btnGo);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViews();
    }

}