package com.example.project6_03_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart, btnStop;
        ViewFlipper viewFlipper = findViewById(R.id.viewFlipper);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        ImageView a1 = (ImageView) findViewById(R.id.cat1);
        ImageView a2 = (ImageView) findViewById(R.id.dog1);
        ImageView a3 = (ImageView) findViewById(R.id.rab);
        ImageView a4 = (ImageView) findViewById(R.id.pie);
        ImageView a5 = (ImageView) findViewById(R.id.oreo);
        ImageView a6 = (ImageView) findViewById(R.id.nougat);
        ImageView a7 = (ImageView) findViewById(R.id.marshmallow);
        ImageView a8 = (ImageView) findViewById(R.id.lollipop);
        ImageView a9 = (ImageView) findViewById(R.id.kitkat);
        ImageView a10 = (ImageView) findViewById(R.id.jellybean);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setFlipInterval(1000);
                viewFlipper.startFlipping();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.stopFlipping();
            }
        });


    }
}