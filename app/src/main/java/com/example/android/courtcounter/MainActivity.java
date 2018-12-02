package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Creating variables
    private TextView scoreViewTeamA;
    private TextView scoreViewTeamB;
    // Tracks the score for team A
    private int scoreTeamA = 0;
    // Tracks the score for team B
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewTeamA = (TextView) findViewById(R.id.team_a_score);
        scoreViewTeamB = (TextView) findViewById(R.id.team_b_score);

        // Calling methods to update score
        displayForTeamA(0);
        displayForTeamB(0);
    }

    // Increase the score for team A by 3 points
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    // Increase the score for team A by 2 points
    public void addTowForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    // Increase the score for team A by 1 points
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    // Increase the score for team B by 3 points
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    // Increase the score for team B by 2 points
    public void addTowForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    // Increase the score for team B by 1 points
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    // Reset the score for both team to zero
    public void resetscore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*Displays the given score for Team A.*/
    public void displayForTeamA(int score) {
        scoreViewTeamA.setText(String.valueOf(score));
    }

    /* Displays the given score for Team B.*/
    public void displayForTeamB(int score) {
        scoreViewTeamB.setText(String.valueOf(score));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("SCORETEAMA", (String) scoreViewTeamA.getText());
        outState.putString("SCORETEAMB", (String) scoreViewTeamB.getText());
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveedInstanceState) {
        super.onRestoreInstanceState(saveedInstanceState);
        scoreViewTeamA.setText(saveedInstanceState.getString("SCORETEAMA"));
        scoreViewTeamB.setText(saveedInstanceState.getString("SCORETEAMB"));
        scoreTeamA = Integer.parseInt(scoreViewTeamA.getText().toString());
        scoreTeamB = Integer.parseInt(scoreViewTeamB.getText().toString());
    }
}
