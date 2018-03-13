package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //global fields:
    int goalsForTeamA = 0;
    int goalsForTeamB = 0;
    int shotsOnTargetForTeamA = 0;
    int shotsOnTargetForTeamB = 0;
    int percentageForTeamA = 50;
    int percentageForTeamB = 50;
    int foulsForTeamA = 0;
    int foulsForTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //methods to update TextViews

    /**
     * Displays the TextView with attribute android:id = goals_TeamA
     */
    public void updateGoalsForTeamA() {
        TextView goalsTeamA = (TextView) findViewById(R.id.goals_TeamA);
        goalsTeamA.setText(String.valueOf(this.goalsForTeamA));
    }

    /**
     * Displays the TextView with attribute android:id = goals_TeamB
     */
    public void updateGoalsForTeamB() {
        TextView goalsTeamB = (TextView) findViewById(R.id.goals_TeamB);
        goalsTeamB.setText(String.valueOf(this.goalsForTeamB));
    }

    /**
     * Displays the TextView with attribute android:id = shots_on_target_teamA
     */
    public void updateShotsOnTargetForTeamA() {
        TextView shotsTeamA = (TextView) findViewById(R.id.shots_on_target_teamA);
        shotsTeamA.setText(String.valueOf(this.shotsOnTargetForTeamA));
    }

    /**
     * Displays the TextView with attribute android:id = shots_on_target_teamB
     */
    public void updateShotsOnTargetForTeamB() {
        TextView shotsTeamB = (TextView) findViewById(R.id.shots_on_target_teamB);
        shotsTeamB.setText(String.valueOf(this.shotsOnTargetForTeamB));
    }

    /**
     * Displays the TextView with attribute android:id = possession_TeamA
     */
    public void updatePercentageTeamA() {
        TextView percentageA = (TextView) findViewById(R.id.possession_TeamA);
        percentageA.setText(String.valueOf(this.percentageForTeamA) + "%");
    }

    /**
     * Displays the TextView with attribute android:id = possession_TeamB
     */
    public void updatePercentageTeamB() {
        TextView percentageB = (TextView) findViewById(R.id.possession_TeamB);
        percentageB.setText(String.valueOf(this.percentageForTeamB) + "%");
    }

    /**
     * Displays the TextView with attribute android:id = fouls_teamA
     */
    public void updateFoulsForTeamA() {
        TextView foulsA = (TextView) findViewById(R.id.fouls_teamA);
        foulsA.setText(String.valueOf(this.foulsForTeamA));
    }

    /**
     * Displays the TextView with attribute android:id = fouls_teamB
     */
    public void updateFoulsForTeamB() {
        TextView foulsB = (TextView) findViewById(R.id.fouls_teamB);
        foulsB.setText(String.valueOf(this.foulsForTeamB));
    }


    //methods to handle events(event handlers):

    /**
     * Adds one goal to team A.
     *
     * @param view
     */
    public void addOneGoalForTeamA(View view) {
        this.goalsForTeamA += 1;
        updateGoalsForTeamA();
    }

    /**
     * Adds one goal to team B.
     *
     * @param view
     */
    public void addOneGoalForTeamB(View view) {
        this.goalsForTeamB += 1;
        updateGoalsForTeamB();
    }

    /**
     * Adds one shot on target for team A.
     *
     * @param view
     */
    public void addOneShotOnTargetForTeamA(View view) {
        this.shotsOnTargetForTeamA += 1;
        updateShotsOnTargetForTeamA();
    }

    /**
     * Adds one shot on target for team B.
     *
     * @param view
     */
    public void addOneShotOnTargetForTeamB(View view) {
        this.shotsOnTargetForTeamB += 1;
        updateShotsOnTargetForTeamB();
    }

    /**
     * Adds percentage to team A.
     *
     * @param view
     */
    public void addPercentageTeamA(View view) {
        changePercentage('A');
        updatePercentageTeamA();
        updatePercentageTeamB();
    }

    /**
     * Adds percentage to team B.
     *
     * @param view
     */
    public void addPercentageTeamB(View view) {
        changePercentage('B');
        updatePercentageTeamB();
        updatePercentageTeamA();
    }

    /**
     * Adds one foul to team A.
     *
     * @param view
     */
    public void addOneFoulForTeamA(View view) {
        this.foulsForTeamA += 1;
        updateFoulsForTeamA();
    }

    public void addOneFoulForTeamB(View view) {
        this.foulsForTeamB += 1;
        updateFoulsForTeamB();
    }

    /**
     * Resets all values ad updates all the TextViews.
     *
     * @param view
     */
    public void resetForTheNextGame(View view) {
        this.goalsForTeamA = 0;
        this.goalsForTeamB = 0;
        this.shotsOnTargetForTeamA = 0;
        this.shotsOnTargetForTeamB = 0;
        this.percentageForTeamA = 0;
        this.percentageForTeamB = 0;
        this.foulsForTeamA = 0;
        this.foulsForTeamB = 0;
        updateGoalsForTeamA();
        updateGoalsForTeamB();
        updateShotsOnTargetForTeamA();
        updateShotsOnTargetForTeamB();
        updatePercentageTeamA();
        updatePercentageTeamB();
        updateFoulsForTeamA();
        updateFoulsForTeamB();
    }


    //helper methods:

    /**
     * Increases percentage of one team while decreasing percentage of the other team.
     * It does this while keeping the sum of both percentages 100.
     *
     * @param selectTeam
     */
    private void changePercentage(char selectTeam) {
        if (selectTeam == 'A' && this.percentageForTeamA < 99) {
            this.percentageForTeamA += 1;
            this.percentageForTeamB -= 1;
        } else if (selectTeam == 'B' && this.percentageForTeamB < 99) {
            this.percentageForTeamB += 1;
            this.percentageForTeamA -= 1;
        }
    }
}
