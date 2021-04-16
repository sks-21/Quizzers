package com.example.quizzers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.Toast;


public class Sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
    }


    public void submitbutton(View view) {
        int score = 0;

        //for qn1
        RadioButton rd = (RadioButton) findViewById(R.id.q1op1);
        if (rd.isChecked())
            score += 1;

        //for qn2
        EditText etext = (EditText) findViewById(R.id.q2);
        String ans = etext.getText().toString();

        if (ans.compareToIgnoreCase("Josef Bican") == 0)
            score += 1;

        //for qn3
        CheckBox ch1 = (CheckBox) findViewById(R.id.q3op1);
        boolean ans1 = ch1.isChecked();

        CheckBox ch2 = (CheckBox) findViewById(R.id.q3op2);
        boolean ans2 = ch2.isChecked();

        CheckBox ch3 = (CheckBox) findViewById(R.id.q3op3);
        boolean ans3 = ch3.isChecked();

        CheckBox ch4 = (CheckBox) findViewById(R.id.q3op4);
        boolean ans4 = ch4.isChecked();


        if (!ans1 && ans2 && ans3 && ans4)
            score += 1;

        //for qn4
        RadioButton rb2 = (RadioButton) findViewById(R.id.q4op2);
        if (rb2.isChecked())
            score += 1;

        //for sending back the result(score)
        Intent intent = new Intent();
        intent.putExtra("finalscore", score);

        setResult(RESULT_OK, intent);
        finish();

    }


}