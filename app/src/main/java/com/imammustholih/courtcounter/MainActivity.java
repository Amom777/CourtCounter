package com.imammustholih.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointA = 0;
    int pointB = 0;
    TextView boardA;
    TextView boardB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boardA = (TextView) findViewById(R.id.board_score_a);
        boardB = (TextView) findViewById(R.id.board_score_b);
    }
    public void a3Points(View view){
        pointA = pointA +3;
        display(pointA);
    }
    public void a2Points(View view){
        pointA = pointA +2;
        display(pointA);
    }
    public void afreeThrow(View view){
        pointA = pointA +1;
        display(pointA);
    }
    public void reset(View view){
        if(pointA>0 || pointB>0){
            pointA=0;
            pointB=0;
        }
//        displayForTeamA(scoreA);
//        displayForTeamB(scoreB);
        display(pointA);
        display1(pointB);
    }
    /**
     * Displays the given score for Team A.
     */
//    public void displayForTeamA(int score) {
//        TextView scoreView = (TextView) findViewById(R.id.board_score_a);
//        scoreView.setText(String.valueOf(score));
//    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.board_score_a);
        quantityTextView.setText("" + number);
    }
    /**
     * Displays the given score for Team B.
     */
//    public void displayForTeamB(int score) {
//        TextView scoreView = (TextView) findViewById(R.id.board_score_b);
//        scoreView.setText(String.valueOf(score));
//    }

    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.board_score_b);
        quantityTextView.setText("" + number);
    }
    public void b3Points(View view){
        pointB = pointB +3;
        display1(pointB);
    }
    public void b2Points(View view){
        pointB = pointB +2;
        display1(pointB);
    }
    public void bfreeThrow(View view){
        pointB = pointB +1;
        display1(pointB);
    }
}
