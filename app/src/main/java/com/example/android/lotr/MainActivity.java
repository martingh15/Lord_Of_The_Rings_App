package com.example.android.lotr;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int points = 0;
    MediaPlayer fellowshipSong,defeatSong, victorySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defining the songs of the app
        fellowshipSong = MediaPlayer.create(this,R.raw.fellowship);
        defeatSong = MediaPlayer.create(this,R.raw.defeat);
        victorySong = MediaPlayer.create(this,R.raw.victory);

        //Starting the initial song with a loop
        fellowshipSong.start();
        fellowshipSong.setLooping(true);

    }

    public void validateAnswers(View view) {


        // If question 1 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionOneAnswered()) {
            return;
        }

        // If question 2 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionTwoAnswered()) {
            return;
        }

        // If question 3 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionThreeAnswered()) {
            return;
        }

        // If question 4 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionFourAnswered()) {
            return;
        }

        // If question 5 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionFiveAnswered()) {
            return;
        }

        // This method updates the score, it doesn't have a return value because you can
        // leave unchecked all the checkbox as an answer
        questionSixAnswered();

        // If question 7 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionSevenAnswered()) {
            return;
        }

        // If question 8 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionEightAnswered()) {
            return;
        }

        // If question 9 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionNineAnswered()) {
            return;
        }

        // If question 10 wasnt answered it quits the method to start over
        // Updates the score if it was answered
        if(!questionTenAnswered()) {
            return;
        }

        // Defines if it is a victory song or a defeat song depending on the quantity of points achieved
        defineFinishingSong();

        // Informs the user the result of the test
        Toast.makeText(MainActivity.this,getString(R.string.submitMessage,points),Toast.LENGTH_LONG).show();

        // Reset the score to re-do the test.
        points = 0;
    }

    // Checks if the answer 1 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    private boolean questionOneAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 1 to validate the checked answer
        RadioGroup radioGroupQuestion1 = (RadioGroup) findViewById(R.id.radioGroupQuestion1);

        //Get the correct answer to compare
        RadioButton radioButton1C = (RadioButton) findViewById(R.id.RadioButtonOneC);
        int radioButtonID1 = radioGroupQuestion1.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID1 == radioButton1C.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion1.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }
        return questionAnswered;
    }

    // Checks if the answer 2 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    private boolean questionTwoAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 2 to validate the checked answer
        RadioGroup radioGroupQuestion2 = (RadioGroup) findViewById(R.id.radioGroupQuestion2);

        //Get the correct answer to compare
        RadioButton radioButton2D = (RadioButton) findViewById(R.id.RadioButtonTwoD);
        int radioButtonID2 = radioGroupQuestion2.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID2 == radioButton2D.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion2.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }
        return questionAnswered;
    }

    // Checks if the answer 3 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    private boolean questionThreeAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 3 to validate the checked answer
        RadioGroup radioGroupQuestion3 = (RadioGroup) findViewById(R.id.radioGroupQuestion3);

        //Get the correct answer to compare
        RadioButton radioButton3A = (RadioButton) findViewById(R.id.RadioButtonThreeA);
        int radioButtonID3 = radioGroupQuestion3.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID3 == radioButton3A.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion3.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }

        return questionAnswered;
    }

    // Checks if the answer 4 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    private boolean questionFourAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 4 to validate the checked answer
        RadioGroup radioGroupQuestion4 = (RadioGroup) findViewById(R.id.radioGroupQuestion4);

        //Get the correct answer to compare
        RadioButton radioButton4A = (RadioButton) findViewById(R.id.RadioButtonFourA);
        int radioButtonID4 = radioGroupQuestion4.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID4 == radioButton4A.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion4.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }

        return questionAnswered;
    }

    // Checks if the answer 5 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    private boolean questionFiveAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 5 to validate the checked answer
        RadioGroup radioGroupQuestion5 = (RadioGroup) findViewById(R.id.radioGroupQuestion5);

        //Get the correct answer to compare
        RadioButton radioButton5B = (RadioButton) findViewById(R.id.RadioButtonFiveB);
        int radioButtonID5 = radioGroupQuestion5.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID5 == radioButton5B.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion5.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }

        return questionAnswered;
    }

    // Checks if the answer 6 is correct and set the score. This method doesn't validate if the question
    // was answered beacuse not checking any checkbox is an actual answer. It always return true
    //
    // @return questionAnswered
    private void questionSixAnswered() {
        //Get the four chechBox and  its states
        CheckBox checkBox6A = (CheckBox) findViewById(R.id.CheckBoxSixA);
        CheckBox checkBox6B = (CheckBox) findViewById(R.id.CheckBoxSixB);
        CheckBox checkBox6C = (CheckBox) findViewById(R.id.CheckBoxSixC);
        CheckBox checkBox6D = (CheckBox) findViewById(R.id.CheckBoxSixD);

        //Checks if the answer is correct
        if(checkBox6A.isChecked() && checkBox6B.isChecked() && checkBox6D.isChecked() && !checkBox6C.isChecked()) {
            points++;
        }
    }

    // Checks if the answer 7 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    //
    // @return questionAnswered
    private boolean questionSevenAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 7 to validate the checked answer
        RadioGroup radioGroupQuestion7 = (RadioGroup) findViewById(R.id.radioGroupQuestion7);

        //Get the correct answer to compare
        RadioButton radioButton7B = (RadioButton) findViewById(R.id.RadioButtonSevenB);
        int radioButtonID7 = radioGroupQuestion7.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID7 == radioButton7B.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion7.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }
        return questionAnswered;
    }

    // Checks if the answer 8 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    //
    // @return questionAnswered
    private boolean questionEightAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 8 to validate the checked answer
        RadioGroup radioGroupQuestion8 = (RadioGroup) findViewById(R.id.radioGroupQuestion8);

        //Get the correct answer to compare
        RadioButton radioButton8D = (RadioButton) findViewById(R.id.RadioButtonEightD);
        int radioButtonID8 = radioGroupQuestion8.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID8 == radioButton8D.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion8.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }
        return questionAnswered;
    }

    // Checks if the answer 9 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    //
    // @return questionAnswered
    private boolean questionNineAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        // Get the EditText of question 9 to validate the checked answer
        EditText editTextQuestion9 = (EditText) findViewById(R.id.EditTextQuestion9);

        // Get the string of the EditText to compare
        String number = editTextQuestion9.getText().toString();

        // Compares the EditText text and if it matchs to an empty string then it was not answered, points is initialized
        // to 0 and it informs to the user. Also defines questionAnswered to false
        if(number.matches(""))
        {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }

        //If the answer is correct is updates the score
        else if(Integer.parseInt(number) == 9) {
            points++;
        }
        return questionAnswered;
    }

    // Checks if the answer 10 is correct and set the score. Also returns a boolean which is set to true if the question
    // was answered or false y the questions was not answered. If false the method validateAnswers quits with a return
    // informing the user that he has to answer all the questions
    //
    // @return questionAnswered
    private boolean questionTenAnswered() {
        //Define a boolean variable to return at the end of the method
        boolean questionAnswered = true;

        //Get the radio group of question 10 to validate the checked answer
        RadioGroup radioGroupQuestion10 = (RadioGroup) findViewById(R.id.radioGroupQuestion10);

        //Get the correct answer to compare
        RadioButton radioButton10C = (RadioButton) findViewById(R.id.RadioButtonTenC);
        int radioButtonID10 = radioGroupQuestion10.getCheckedRadioButtonId();

        //Checks if the anser is correct, if true it adds 1 point
        if(radioButtonID10 == radioButton10C.getId()) {
            points ++;
        }

        //If it was not answered, points is initialized to 0 and it informs to the user. Also defines questionAnswered to false
        if(radioGroupQuestion10.getCheckedRadioButtonId() == -1) {
            points = 0;
            Toast.makeText(MainActivity.this,getString(R.string.errorMissingAnswers), Toast.LENGTH_SHORT).show();
            questionAnswered = false;
        }
        return questionAnswered;
    }

    // Defines the finishing song
    private void defineFinishingSong() {
        // If the user scores more than 5 points he won.
        if(points > 5) {
            // Its starts the victory song
            victorySong.start();

            // Its makes the song shorter
            // Code copied from stackoverflow and reformat for my needs.
            CountDownTimer timer = new CountDownTimer(10000, 10000) {

                @Override
                public void onTick(long millisUntilFinished) {
                    // Nothing to do
                }

                @Override
                public void onFinish() {
                    if (victorySong.isPlaying()) {
                        victorySong.stop();
                        victorySong.release();
                    }
                }
            };
            timer.start();
        }
        // If he scores less than 5 points he lose.
        else {
            // Starts the defeat song
            // The defeat song is very short so I didn't need to cut the song.
            defeatSong.start();
        }
    }

}
