package com.example.mac.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;

public class VoteActivity extends AppCompatActivity {
    private static final String voteTAG = "VoteActivity";
    private Button song1Button, song2Button, song3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(voteTAG, "starting voting activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);


        //assign fields
        song1Button = (Button) findViewById(R.id.song1Vote);
        song2Button = (Button) findViewById(R.id.song2Vote);
        song3Button = (Button) findViewById(R.id.song3Vote);

        // set click listeners

        song1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        song2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        song3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}