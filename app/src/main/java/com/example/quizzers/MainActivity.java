package com.example.quizzers;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int req_code = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TextView for Science and Technology
        TextView tv1 = (TextView) findViewById(R.id.textview_science);

        //setting up the OnClick Listener for Science and Technology for opening Science activity
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Science.class);
                startActivityForResult(intent, req_code);
            }
        });

        //TextView for Movies
        TextView tv2 = (TextView) findViewById(R.id.textview_movies);

        //setting up the OnClick Listener for Movies TextView for opening Movies activity
        tv2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent2 = new Intent(MainActivity.this, Movies.class);
                                       startActivityForResult(intent2, req_code);
                                   }
                               }
        );

        //TextView for Sports
        TextView tv3 = (TextView) findViewById(R.id.textview_sports);

        //setting up the OnClick Listener for Sports TextView for opening Sports activity
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Sports.class);
                startActivityForResult(intent3, req_code);

            }

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == req_code) {

            if (resultCode == RESULT_OK) {
                String s;
                int v = data.getIntExtra("finalscore", 0);

                if (v == 4)
                    s="Congratulations !" ;

                else if (v == 3)
                    s="Hurray !" ;

                else if (v==2)
                    s="Good Job !" ;

                else if(v==1)
                    s="Keep Improving !" ;

                    else
                s="Better Luck Next Time !" ;

                    Toast.makeText(this, s+ "\n Final Score = " + v + "/4", Toast.LENGTH_SHORT).show();

            }

        }
    }


}




