package com.example.tvseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int rightAnswers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitResults(View v) {

        // get the users name
        EditText userName = (EditText) findViewById(R.id.name_field);
        String nameOfUser = userName.getText().toString();

        if (nameOfUser.equals("")) {
            nameOfUser = getString(R.string.your_name);
        }

        // find out if the number of series is bigger than 20
        EditText numSeries = (EditText) findViewById(R.id.tv_series_quantity);
        String numSeriesRight = numSeries.getText().toString();


        int numSeriesRightInt = Integer.parseInt(numSeriesRight);
        if (numSeriesRightInt > 20){
            rightAnswers += 1;
        }

        // if the two checkboxes are checked you get 1 point

        CheckBox sopranos = (CheckBox) findViewById(R.id.sopranos);
        boolean sopranosChecked = sopranos.isChecked();
        CheckBox got = (CheckBox) findViewById(R.id.got);
        boolean gotChecked = got.isChecked();

        if (gotChecked && sopranosChecked) {
            rightAnswers += 1;
        }



        // finds out if the user has checked the right answer 1
        RadioButton ans1 = (RadioButton) findViewById(R.id.ans1);
        boolean ans1Right = ans1.isChecked();

        if (ans1Right) {
            rightAnswers += 1;
        }

        // finds out if the user has checked the right answer 2
        RadioButton ans2 = (RadioButton) findViewById(R.id.ans2);
        boolean ans2Right = ans2.isChecked();

        if (ans2Right) {
            rightAnswers += 1;
        }

        // finds out if the user has checked the right answer 3
        RadioButton ans3 = (RadioButton) findViewById(R.id.ans3);
        boolean ans3Right = ans3.isChecked();

        if (ans3Right) {
            rightAnswers += 1;
        }

        // finds out if the user has checked the right answer 4
        RadioButton ans4 = (RadioButton) findViewById(R.id.ans4);
        boolean ans4Right = ans4.isChecked();

        if (ans4Right) {
            rightAnswers += 1;
        }

        // finds out if the user has checked the right answer 5
        RadioButton ans5 = (RadioButton) findViewById(R.id.ans5);
        boolean ans5Right = ans5.isChecked();

        if (ans5Right) {
            rightAnswers += 1;
        }

        // displays the score and resets the counter

        String resultMessage;
        if (rightAnswers == 7) {
            resultMessage = nameOfUser +" " + getString(R.string.perfect_score);
        } else {
            resultMessage = nameOfUser + " " + getString(R.string.you_score) + " " + rightAnswers + " " + getString(R.string.of_points);
        }

        Toast.makeText(this, resultMessage, Toast.LENGTH_SHORT).show();
        rightAnswers = 0;

    }
}