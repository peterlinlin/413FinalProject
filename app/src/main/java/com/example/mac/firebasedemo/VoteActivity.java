package com.example.mac.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;

public class VoteActivity extends AppCompatActivity {
    private static final String voteTAG = "VoteActivity";
    private Button djButton, viewerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(voteTAG, "starting voting activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);


    }
}
