package com.example.android.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    int scoreA, scoreB, yellowA, yellowB, redA, redB, cornerA, cornerB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getUserData();
        Button goal1 = (Button) findViewById(R.id.goalA);
        goal1.setOnClickListener(this);
        Button yellow1 = (Button) findViewById(R.id.plusYellowA);
        yellow1.setOnClickListener(this);
        Button red1 = (Button) findViewById(R.id.plusRedA);
        red1.setOnClickListener(this);
        Button corner1 = (Button) findViewById(R.id.plusCornerA);
        corner1.setOnClickListener(this);
        Button goal2 = (Button) findViewById(R.id.goalB);
        goal2.setOnClickListener(this);
        Button yellow2 = (Button) findViewById(R.id.plusYellowB);
        yellow2.setOnClickListener(this);
        Button red2 = (Button) findViewById(R.id.plusRedB);
        red2.setOnClickListener(this);
        Button corner2 = (Button) findViewById(R.id.plusCornerB);
        corner2.setOnClickListener(this);
        Button reset = (Button) findViewById(R.id.reset1);
        reset.setOnClickListener(this);

    }

    public void onClick(View view) {



        switch (view.getId()) {

            case R.id.goalA:
                statCount(1);
                break;
            case R.id.plusYellowA:
                statCount(2);
                break;
            case R.id.plusRedA:
                statCount(3);
                break;
            case R.id.plusCornerA:
                statCount(4);
                break;
            case R.id.goalB:
                statCount(5);
                break;
            case R.id.plusYellowB:
                statCount(6);
                break;
            case R.id.plusRedB:
                statCount(7);
                break;
            case R.id.plusCornerB:
                statCount(8);
                break;
            case R.id.reset1:
                statCount(0);
                break;
        }


    }

    public void statCount(int number) {

        TextView goal1 = (TextView) findViewById(R.id.scoreTeamA);
        TextView yellow1 = (TextView) findViewById(R.id.yellowA);
        TextView red1 = (TextView) findViewById(R.id.redA);
        TextView corner1 = (TextView) findViewById(R.id.cornersA);
        TextView goal2 = (TextView) findViewById(R.id.scoreTeamB);
        TextView red2 = (TextView) findViewById(R.id.redB);
        TextView yellow2 = (TextView) findViewById(R.id.yellowB);
        TextView corner2 = (TextView) findViewById(R.id.cornersB);
        switch (number) {

            case 1:
                scoreA += 1;
                goal1.setText(String.valueOf(scoreA));
                break;
            case 2:
                yellowA += 1;
                yellow1.setText(String.valueOf(yellowA));
                break;
            case 3:
                redA += 1;
                red1.setText(String.valueOf(redA));
                break;
            case 4:
                cornerA += 1;
                corner1.setText(String.valueOf(cornerA));
                break;
            case 5:
                scoreB += 1;
                goal2.setText(String.valueOf(scoreB));
                break;
            case 6:
                yellowB += 1;
                yellow2.setText(String.valueOf(yellowB));
                break;
            case 7:
                redB +=1;
                red2.setText(String.valueOf(redB));
                break;
            case 8:
                cornerB +=1;
                corner2.setText(String.valueOf(cornerB));
                break;
            case 0:
                scoreA=0;
                scoreB=0;
                yellowA=0;
                yellowB=0;
                redA=0;
                redB=0;
                cornerA=0;
                cornerB=0;
                goal1.setText(String.valueOf(scoreA));
                yellow1.setText(String.valueOf(yellowA));
                red1.setText(String.valueOf(redA));
                corner1.setText(String.valueOf(cornerA));
                goal2.setText(String.valueOf(scoreB));
                yellow2.setText(String.valueOf(yellowB));
                red2.setText(String.valueOf(redB));
                corner2.setText(String.valueOf(cornerB));
        }

    }


    public void getUserData() {

        Bundle extras = getIntent().getExtras();
        String team1Name = extras.getString("user input1");
        TextView team1 = (TextView) findViewById(R.id.teamAName);
        team1.setText(team1Name);

        Bundle extras2 = getIntent().getExtras();
        String team2Name = extras2.getString("user input2");
        TextView team2 = (TextView) findViewById(R.id.teamBName);
        team2.setText(team2Name);


    }


}
