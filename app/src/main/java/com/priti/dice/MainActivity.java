package com.priti.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn;
    private TextView txt;
    private Random myrandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btn = findViewById(R.id.)

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myRanNumber = myrandom.nextInt(6)+1;

                switch (myRanNumber){
                    case 1:
                        btn.setImageResource(R.drawable.dice1);
                        txt.setText("One");
                        break;
                    case 2:
                        btn.setImageResource(R.drawable.dice2);
                        txt.setText("Two");
                        break;
                    case 3:
                        btn.setImageResource(R.drawable.dice3);
                        txt.setText("Three");
                        break;
                    case 4:
                        btn.setImageResource(R.drawable.dice4);
                        txt.setText("Four");
                        break;
                    case 5:
                        btn.setImageResource(R.drawable.dice5);
                        txt.setText("Five");
                        break;
                    case 6:
                        btn.setImageResource(R.drawable.dice6);
                        txt.setText("Six");
                        break;


                }

            }
        });
    }
}