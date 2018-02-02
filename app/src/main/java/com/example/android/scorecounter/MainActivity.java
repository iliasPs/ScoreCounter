package com.example.android.scorecounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input1;
    EditText input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton submit = (ImageButton) findViewById(R.id.sub);
        submit.setOnClickListener(this);

    }

        public void onClick(View view){
            input1 = findViewById(R.id.input1);
            input2 = findViewById(R.id.input2);
            final String teamA = input1.getText().toString();
            final String teamB = input2.getText().toString();
            Intent sendTeamNames = new Intent(this, Main2Activity.class);
            sendTeamNames.putExtra("user input1", teamA);
            sendTeamNames.putExtra("user input2", teamB);
            startActivity(sendTeamNames);


        }
    }


