package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //global fields:
    int goalsForTeamA = 0;
    int goalsForTeamB = 0;
    int shotsOnTargetForTeamA = 0;
    int shotsOnTargetForTeamB = 0;
    int percentageForTeamA = 0;
    int percentageForTeamB = 0;
    int foulsForTeamA = 0;
    int foulsForTeamB = 0;


    //methods to update TextViews
    public void updateGoalsTeamA() {
        TextView goalsTeamA = (TextView) findViewById(R.id.goals_TeamA);
        goalsTeamA.setText("1");
    }


    //methods to handle events(event handlers):
    public void addOneShotOnTargetForTeamA(View view) {
    }

    public void addOneShotOnTargetForTeamB(View view) {
    }

    public void resetForTheNextGame(View view) {
    }

    public void addOneGoalForTeamA(View view) {
    }

    public void addOneGoalForTeamB(View view) {
    }

    public void addPercentageTeamA(View view) {
    }

    public void addPercentageTeamB(View view) {
    }

    public void addOneFoulForTeamA(View view) {
    }

    public void addOneFoulForTeamB(View view) {
    }
}
