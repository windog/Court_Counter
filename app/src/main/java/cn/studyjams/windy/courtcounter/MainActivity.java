package cn.studyjams.windy.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ascore; //Team A's score
    int bscore; //Team B's score
    TextView scoreViewa;
    TextView scoreViewb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* display Team A score
    * */
    public void displayForTeamA(int score) {
        scoreViewa = (TextView) findViewById(R.id.team_a_score);
        scoreViewa.setText(String.valueOf(score));
    }

    /* display Team B score
    * */
    public void displayForTeamB(int score) {
        scoreViewb = (TextView) findViewById(R.id.team_b_score);
        scoreViewb.setText(String.valueOf(score));
    }

    /*increase the score for team A by 3
    * */
    public void addThreeForA(View v) {
        ascore = ascore + 3;
        displayForTeamA(ascore);
    }

    /*increase the score for team B by 3
    * */
    public void addThreeForB(View v) {
        bscore = bscore + 3;
        displayForTeamB(bscore);
    }

    /*increase the score for team A by 2
    * */
    public void addTwoForA(View v) {
        ascore = ascore + 2;
        displayForTeamA(ascore);
    }

    /*increase the score for team B by 2
    * */
    public void addTwoForB(View v) {
        bscore = bscore + 2;
        displayForTeamB(bscore);
    }

    /*increase the score for team A by 1
    * */
    public void addOneForA(View v) {
        ascore = ascore + 1;
        displayForTeamA(ascore);
    }

    /*increase the score for team B by 1
    * */
    public void addOneForB(View v) {
        bscore = bscore + 1;
        displayForTeamB(bscore);
    }

    /* reset the scores
      要注意方法的复用!!!!!!!!
      注意值得清零!!!!!!!
    * */
    public void reset(View v) {
        displayForTeamA(0);
        displayForTeamB(0);
        ascore = 0;
        bscore = 0;
    }
}
