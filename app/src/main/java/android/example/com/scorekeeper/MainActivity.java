package android.example.com.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_score_textView);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_score_textView);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adding Scores for Team A
      */
    public void addThreeForTeamA (View v) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void addTwoForTeamA (View v) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void addOneForTeamA (View v) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Adding Scores for Team B
     */
    public void addThreeForTeamB (View v) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void addTwoForTeamB (View v) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void addOneForTeamB (View v) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    /**
     * Reset Team A & B Score
     */
    public void resetScore(View v) {
        teamAScore = 0;
        teamBScore = 0;

        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
