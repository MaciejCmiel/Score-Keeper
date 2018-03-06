
package com.example.macx.score_keeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3A = findViewById(R.id.three_a_button);
        Button button2A = findViewById(R.id.two_a_button);
        Button buttonA = findViewById(R.id.one_a_button);

        Button button3B = findViewById(R.id.three_b_button);
        Button button2B = findViewById(R.id.two_b_button);
        Button buttonB = findViewById(R.id.one_b_button);


        button3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore("A", 3);
            }
        });
        button2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore("A", 2);
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore("A", 1);
            }
        });

        button3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore("B", 3);
            }
        });
        button2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore("B", 2);
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addScore("B", 1);
            }
        });
    }

    /**
     * Increase the score for Team "team" by "points" points.
     *
     * @param team describes which team score points
     * @param points describes how many points
     */
    public void addScore(String team, int points) {
        if (team.equals("A")) {
            scoreTeamA += points;
            displayScore(scoreTeamA, "A");

        } else {
            scoreTeamB += points;
            displayScore(scoreTeamB, "B");
        }
    }


    /**
     * Resets the score for both teams to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScore(scoreTeamA, "A");
        displayScore(scoreTeamB, "B");
    }

    /**
     * Displays the score for specified team.
     *
     * @param score is total amount of points for team
     * @param team describes which team needs point update
     */
    public void displayScore(int score, String team) {

        TextView scoreView;

        if (team.equals("A")) {
            scoreView = findViewById(R.id.team_a_score);
        } else {
            scoreView = findViewById(R.id.team_b_score);
        }
        scoreView.setText(String.valueOf(score));
    }

}