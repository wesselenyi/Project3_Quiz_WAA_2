package com.example.android.project3_quiz_waa_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This app is a quiz about the European Union.
 */

public class MainActivity extends AppCompatActivity {

    /**
     * Each radio button, checkbox, the edit text has its own id.
     * The initial score is set to zero
     * In order to save the state of the app if the screen is rotated, special score_key and submitted-key and boolean are used.
     */

    private final String SCORE_KEY = "score_key";
    private final String SUBMITTED_KEY = "submitted-key";
    RadioButton q1a1Button;
    RadioButton q1a2Button;
    RadioButton q1a3Button;
    RadioButton q1a4Button;
    RadioButton q2a1Button;
    RadioButton q2a2Button;
    RadioButton q2a3Button;
    RadioButton q2a4Button;
    CheckBox q4A1CheckBox;
    CheckBox q4A2CheckBox;
    CheckBox q4A3CheckBox;
    CheckBox q4A4CheckBox;
    CheckBox q5A1CheckBox;
    CheckBox q5A2CheckBox;
    CheckBox q5A3CheckBox;
    CheckBox q5A4CheckBox;
    RadioButton q6a1Button;
    RadioButton q6a2Button;
    RadioButton q6a3Button;
    RadioButton q6a4Button;
    RadioButton q7a1Button;
    RadioButton q7a2Button;
    RadioButton q7a3Button;
    RadioButton q7a4Button;
    EditText q3RightName;
    RadioGroup layout;
    int score = 0;
    private boolean submitted = false;


    /**
     * This saveInstance method is used to save the data if the screen is rotated.
     * the logic behind the labeling: q1a1: question 1 answer 1 - the 1st answer option for the 1st questin, and so on...
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layout = findViewById(R.id.layout1);
        q1a1Button = findViewById(R.id.q1a1);
        q1a2Button = findViewById(R.id.q1a2);
        q1a3Button = findViewById(R.id.q1a3);
        q1a4Button = findViewById(R.id.q1a4);
        q2a1Button = findViewById(R.id.q2a1);
        q2a2Button = findViewById(R.id.q2a2);
        q2a3Button = findViewById(R.id.q2a3);
        q2a4Button = findViewById(R.id.q2a4);
        q4A1CheckBox = findViewById(R.id.q4A1);
        q4A2CheckBox = findViewById(R.id.q4A2);
        q4A3CheckBox = findViewById(R.id.q4A3);
        q4A4CheckBox = findViewById(R.id.q4A4);
        q5A1CheckBox = findViewById(R.id.q5A1);
        q5A2CheckBox = findViewById(R.id.q5A2);
        q5A3CheckBox = findViewById(R.id.q5A3);
        q5A4CheckBox = findViewById(R.id.q5A4);
        q6a1Button = findViewById(R.id.q6a1);
        q6a2Button = findViewById(R.id.q6a2);
        q6a3Button = findViewById(R.id.q6a3);
        q6a4Button = findViewById(R.id.q6a4);
        q7a1Button = findViewById(R.id.q7a1);
        q7a2Button = findViewById(R.id.q7a2);
        q7a3Button = findViewById(R.id.q7a3);
        q7a4Button = findViewById(R.id.q7a4);
        q3RightName = findViewById(R.id.q3Answer);

        /**
         * if the screen is rotated, the score gets its value from the stored value. I used a log to check the stored score value
         */

        if (savedInstanceState != null) {
            score = savedInstanceState.getInt(SCORE_KEY);
            Log.d(MainActivity.class.getSimpleName(), "score value: " + score);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(SCORE_KEY, score);
        outState.putBoolean(SUBMITTED_KEY, submitted);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            submitted = savedInstanceState.getBoolean(SUBMITTED_KEY);
            inactivateUI(!submitted);
        }
    }

    /**
     * Question 1. It's a radio button choice, only 1 answer can be accepted.
     */

    public void q1RadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q1a1:

                if (checked)
                    break;

            case R.id.q1a2:
                if (checked)
                    score = score + 1;
                break;
            case R.id.q1a3:
                if (checked)
                    break;
            case R.id.q1a4:
                if (checked)
                    break;
        }

    }


    public void q2RadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q2a1:
                if (checked)
                    break;

            case R.id.q2a2:
                if (checked)

                    break;
            case R.id.q2a3:
                if (checked)
                    score = score + 1;
                break;
            case R.id.q2a4:
                if (checked)
                    break;
        }

    }

    public void checkBoxQ4(View view) {

        CheckBox q4A1CheckBox = findViewById(R.id.q4A1);
        boolean q4A1Selected = q4A1CheckBox.isChecked();

        CheckBox q4A2CheckBox = findViewById(R.id.q4A2);
        boolean q4A2Selected = q4A2CheckBox.isChecked();

        CheckBox q4A3CheckBox = findViewById(R.id.q4A3);
        boolean q4A3Selected = q4A3CheckBox.isChecked();

        CheckBox q4A4CheckBox = findViewById(R.id.q4A4);
        boolean q4A4Selected = q4A4CheckBox.isChecked();


        if ((q4A1Selected && q4A3Selected && q4A4Selected && !(q4A2Selected))) {
            score += 1;
        }
    }

    public void checkBoxQ5(View view) {

        CheckBox q5A1CheckBox = findViewById(R.id.q5A1);
        boolean q5A1Selected = q5A1CheckBox.isChecked();

        CheckBox q5A2CheckBox = findViewById(R.id.q5A2);
        boolean q5A2Selected = q5A2CheckBox.isChecked();

        CheckBox q5A3CheckBox = findViewById(R.id.q5A3);
        boolean q5A3Selected = q5A3CheckBox.isChecked();

        CheckBox q5A4CheckBox = findViewById(R.id.q5A4);
        boolean q5A4Selected = q5A4CheckBox.isChecked();


        if ((q5A2Selected && q5A3Selected && !(q5A1Selected) && !(q5A4Selected))) {
            score += 1;
        }
    }

    public void q6RadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q6a1:
                if (checked)
                    score = score + 1;
                break;

            case R.id.q6a2:
                if (checked)

                    break;
            case R.id.q6a3:
                if (checked)
                    score = score + 1;
                break;
            case R.id.q6a4:
                if (checked)
                    break;
        }

    }

    public void q7RadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.q7a1:
                if (checked)

                    break;

            case R.id.q7a2:
                if (checked)
                    score += 1;
                break;
            case R.id.q7a3:
                if (checked)

                    break;
            case R.id.q7a4:
                if (checked)
                    break;
        }

    }

    public void result(View view) {

        EditText q3RightName = findViewById(R.id.q3Answer);
        Editable nameOk = q3RightName.getText();
        String answerQuestion1 = nameOk.toString();

        if (answerQuestion1.equalsIgnoreCase("Jean-Claude Juncker")) {
            score += 1;
        }

        submitted = true;
        inactivateUI(false);

        if (score < 3) {
            Toast.makeText(this, "Not bad! Your score is " + score, Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "Congratulation! Your score is " + score, Toast.LENGTH_LONG).show();
        }
    }

    private void inactivateUI(boolean enabled) {
        q1a1Button.setEnabled(enabled);
        q1a2Button.setEnabled(enabled);
        q1a3Button.setEnabled(enabled);
        q1a4Button.setEnabled(enabled);
        q2a1Button.setEnabled(enabled);
        q2a2Button.setEnabled(enabled);
        q2a3Button.setEnabled(enabled);
        q2a4Button.setEnabled(enabled);
        q4A1CheckBox.setEnabled(enabled);
        q4A2CheckBox.setEnabled(enabled);
        q4A3CheckBox.setEnabled(enabled);
        q4A4CheckBox.setEnabled(enabled);
        q5A1CheckBox.setEnabled(enabled);
        q5A2CheckBox.setEnabled(enabled);
        q5A3CheckBox.setEnabled(enabled);
        q5A4CheckBox.setEnabled(enabled);
        q6a1Button.setEnabled(enabled);
        q6a2Button.setEnabled(enabled);
        q6a3Button.setEnabled(enabled);
        q6a4Button.setEnabled(enabled);
        q7a1Button.setEnabled(enabled);
        q7a2Button.setEnabled(enabled);
        q7a3Button.setEnabled(enabled);
        q7a4Button.setEnabled(enabled);
    }

    public void clear(View view) {

        score = 0;
        submitted = false;
        inactivateUI(true);

        EditText rightnameText = findViewById(R.id.q3Answer);
        rightnameText.getText().clear();
    }
}
