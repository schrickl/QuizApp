package com.example.android.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app presents a quiz about the US Summer Olympics.
 */
public class MainActivity extends AppCompatActivity {

    private static final int NUMBER_OF_QUESTIONS = 10;
    private Button mSubmitButton;
    private Button mResetButton;
    private CheckBox mAnswer8aCheckBox;
    private CheckBox mAnswer8bCheckBox;
    private CheckBox mAnswer8cCheckBox;
    private CheckBox mAnswer8dCheckBox;
    private EditText mAnswer3EditText;
    private EditText mAnswer4EditText;
    private EditText mAnswer6EditText;
    private EditText mAnswer9EditText;
    private EditText mAnswer10EditText;
    private RadioButton mAnswer1aRadioButton;
    private RadioButton mAnswer2cRadioButton;
    private RadioButton mAnswer5aRadioButton;
    private RadioButton mAnswer7cRadioButton;
    private RadioGroup mAnswer1RadioGroup;
    private RadioGroup mAnswer2RadioGroup;
    private RadioGroup mAnswer5RadioGroup;
    private RadioGroup mAnswer7RadioGroup;
    private TextView mQuestion1TextView;
    private TextView mQuestion2TextView;
    private TextView mQuestion3TextView;
    private TextView mQuestion4TextView;
    private TextView mQuestion5TextView;
    private TextView mQuestion6TextView;
    private TextView mQuestion7TextView;
    private TextView mQuestion8TextView;
    private TextView mQuestion9TextView;
    private TextView mQuestion10TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize all the views
        mQuestion1TextView = (TextView) findViewById(R.id.question1);
        mAnswer1RadioGroup = (RadioGroup) findViewById(R.id.answer1);
        mAnswer1aRadioButton = (RadioButton) findViewById(R.id.answer1a);
        mQuestion2TextView = (TextView) findViewById(R.id.question2);
        mAnswer2RadioGroup = (RadioGroup) findViewById(R.id.answer2);
        mAnswer2cRadioButton = (RadioButton) findViewById(R.id.answer2c);
        mQuestion3TextView = (TextView) findViewById(R.id.question3);
        mAnswer3EditText = (EditText) findViewById(R.id.answer3);
        mQuestion4TextView = (TextView) findViewById(R.id.question4);
        mAnswer4EditText = (EditText) findViewById(R.id.answer4);
        mQuestion5TextView = (TextView) findViewById(R.id.question5);
        mAnswer5RadioGroup = (RadioGroup) findViewById(R.id.answer5);
        mAnswer5aRadioButton = (RadioButton) findViewById(R.id.answer5a);
        mQuestion6TextView = (TextView) findViewById(R.id.question6);
        mAnswer6EditText = (EditText) findViewById(R.id.answer6);
        mQuestion7TextView = (TextView) findViewById(R.id.question7);
        mAnswer7RadioGroup = (RadioGroup) findViewById(R.id.answer7);
        mAnswer7cRadioButton = (RadioButton) findViewById(R.id.answer7c);
        mQuestion8TextView = (TextView) findViewById(R.id.question8);
        mAnswer8aCheckBox = (CheckBox) findViewById(R.id.answer8a);
        mAnswer8bCheckBox = (CheckBox) findViewById(R.id.answer8b);
        mAnswer8cCheckBox = (CheckBox) findViewById(R.id.answer8c);
        mAnswer8dCheckBox = (CheckBox) findViewById(R.id.answer8d);
        mQuestion9TextView = (TextView) findViewById(R.id.question9);
        mAnswer9EditText = (EditText) findViewById(R.id.answer9);
        mQuestion10TextView = (TextView) findViewById(R.id.question10);
        mAnswer10EditText = (EditText) findViewById(R.id.answer10);
        mSubmitButton = (Button) findViewById(R.id.submit_button);
        // Enable Submit button by default
        mSubmitButton.setEnabled(true);
        mResetButton = (Button) findViewById(R.id.reset_button);
        // Disable Reset button by default
        mResetButton.setEnabled(false);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void calculateScore(View v) {
        int numberCorrect = 0;

        // Since user has clicked the Submit button, disable it and enable
        // the Reset button.
        mSubmitButton.setEnabled(false);
        mResetButton.setEnabled(true);

        // Question 1 result: 1a (true) is the correct answer.
        if(mAnswer1aRadioButton.isChecked()) {
            numberCorrect += 1;
        } else {
            mQuestion1TextView.setBackgroundColor(Color.RED);
        }

        // Question 2 result: 2c (Los Angeles) is the correct answer.
        if(mAnswer2cRadioButton.isChecked()) {
            numberCorrect += 1;
        } else {
            mQuestion2TextView.setBackgroundColor(Color.RED);
        }

        // Question 3 result: Michael Phelps is the correct answer.
        if(mAnswer3EditText.getText().toString().equalsIgnoreCase("Michael Phelps")) {
            numberCorrect += 1;
        } else {
            mQuestion3TextView.setBackgroundColor(Color.RED);
        }

        // Question 4 result: Muhammad Ali is the correct answer.
        if(mAnswer4EditText.getText().toString().equalsIgnoreCase("Muhammad Ali")) {
            numberCorrect += 1;
        } else {
            mQuestion4TextView.setBackgroundColor(Color.RED);
        }

        // Question 5 result: 5a (7) is the correct answer.
        if(mAnswer5aRadioButton.isChecked()) {
            numberCorrect += 1;
        } else {
            mQuestion5TextView.setBackgroundColor(Color.RED);
        }

        // Question 6 result: Greg Louganis is the correct answer.
        if(mAnswer6EditText.getText().toString().equalsIgnoreCase("Greg Louganis")) {
            numberCorrect += 1;
        } else {
            mQuestion6TextView.setBackgroundColor(Color.RED);
        }

        // Question 7 result: 7c (1980) is the correct answer.
        if(mAnswer7cRadioButton.isChecked()) {
            numberCorrect += 1;
        } else {
            mQuestion7TextView.setBackgroundColor(Color.RED);
        }

        // Question 8 result: 8a (Larry Bird), 8b (Michael Jordan), and 8d (Charles Barkley)
        // are the correct answers.
        if(mAnswer8aCheckBox.isChecked() && mAnswer8bCheckBox.isChecked() &&
                mAnswer8dCheckBox.isChecked() && !mAnswer8cCheckBox.isChecked()) {
            numberCorrect += 1;
        } else {
           mQuestion8TextView.setBackgroundColor(Color.RED);
        }

        // Question 9 result: gymnastics is the correct answer.
        if(mAnswer9EditText.getText().toString().equalsIgnoreCase("gymnastics")) {
            numberCorrect += 1;
        } else {
            mQuestion9TextView.setBackgroundColor(Color.RED);
        }

        // Question 10 result: basketball is the correct answer.
        if(mAnswer10EditText.getText().toString().equalsIgnoreCase("basketball")) {
            numberCorrect += 1;
        } else {
           mQuestion10TextView.setBackgroundColor(Color.RED);
        }

        // Display a toast with the number of correct answers.
        Toast.makeText(this, "You answered " + numberCorrect + "/" + NUMBER_OF_QUESTIONS +
                " correctly!", Toast.LENGTH_LONG).show();
    }

    /**
     * This method is called when the user presses the Reset Quiz button.
     * Resets the quiz to default state.
     */
    public void resetQuiz(View v) {
        mSubmitButton.setEnabled(true);
        mResetButton.setEnabled(false);
        mQuestion1TextView.setBackgroundColor(Color.WHITE);
        mAnswer1RadioGroup.clearCheck();
        mQuestion2TextView.setBackgroundColor(Color.WHITE);
        mAnswer2RadioGroup.clearCheck();
        mQuestion3TextView.setBackgroundColor(Color.WHITE);
        mAnswer3EditText.getText().clear();
        mQuestion4TextView.setBackgroundColor(Color.WHITE);
        mAnswer4EditText.getText().clear();
        mQuestion5TextView.setBackgroundColor(Color.WHITE);
        mAnswer5RadioGroup.clearCheck();
        mQuestion6TextView.setBackgroundColor(Color.WHITE);
        mAnswer6EditText.getText().clear();
        mQuestion7TextView.setBackgroundColor(Color.WHITE);
        mAnswer7RadioGroup.clearCheck();
        mQuestion8TextView.setBackgroundColor(Color.WHITE);
        mAnswer8aCheckBox.setChecked(false);
        mAnswer8bCheckBox.setChecked(false);
        mAnswer8cCheckBox.setChecked(false);
        mAnswer8dCheckBox.setChecked(false);
        mQuestion9TextView.setBackgroundColor(Color.WHITE);
        mAnswer9EditText.getText().clear();
        mQuestion10TextView.setBackgroundColor(Color.WHITE);
        mAnswer10EditText.getText().clear();
    }
}
