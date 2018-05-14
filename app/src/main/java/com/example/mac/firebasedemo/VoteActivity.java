package com.example.mac.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class VoteActivity extends AppCompatActivity {
    private static final String voteTAG = "VoteActivity";
    private Button song1Button, song2Button, song3Button;
    private FirebaseAuth mAuth;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private static DatabaseReference sFirebaseDatabaseReference =
            FirebaseDatabase.getInstance().getReference();
    public static final String SONGS_CHILD = "songs";
    boolean voted = false;

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
                vote1();

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

    private void vote1(){
        final DatabaseReference songRef = sFirebaseDatabaseReference.child(SONGS_CHILD);
        songRef.addListenerForSingleValueEvent(new ValueEventListener() {
            String key = "";
            Integer count;
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot songSnap : dataSnapshot.getChildren()) {
                    key = songSnap.getKey();
                    count = songSnap.child("song1count").getValue(Integer.class);
                    //System.out.println("the count is :" + count);
                    Log.d("count", count.toString());
                }
                sFirebaseDatabaseReference.child(SONGS_CHILD).child(key.toString()).child("song1count").setValue(count+1);
                voted = true;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });



//        ValueEventListener eventSongListener = new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                List<String> list = new ArrayList<>();
//                for(DataSnapshot songSnap : dataSnapshot.getChildren()) {
//
//                    String userId = songSnap.getKey();
//
//                    list.add(userId);
//                    sFirebaseDatabaseReference.child(SONGS_CHILD).child(songSnap.getKey().toString()).child("song1count").setValue(1);
//                    System.out.println("WORLDD");
//                    System.out.println(songSnap.getKey().toString());
//                }
//                Log.d("SONGS", list.toString());
////            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {}
//        };

    }



}