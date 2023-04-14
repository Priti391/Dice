package com.priti.dice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imgview;
    private ImageView imgview2;
    private TextView txt;
    private TextView txt2;
    private Button btn;
    private Random myrandom = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        imgview = findViewById(R.id.imageView);
        imgview2 = findViewById(R.id.imageView1);
        txt = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView2);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int myRanNumber = myrandom.nextInt(6) + 1;

               switch (myRanNumber) {
                   case 1:
                       ;
                       imgview.setImageResource(R.drawable.dice1);
                       txt.setText("One");
                       break;
                   case 2:
                       ;
                       imgview.setImageResource(R.drawable.dice2);
                       txt.setText("Two");
                       break;
                   case 3:
                       ;
                       imgview.setImageResource(R.drawable.dice3);
                       txt.setText("Three");
                       break;
                   case 4:
                       ;
                       imgview.setImageResource(R.drawable.dice4);
                       txt.setText("Four");
                       break;
                   case 5:
                       ;
                       imgview.setImageResource(R.drawable.dice5);
                       txt.setText("Five");
                       break;
                   case 6:
                       ;
                       imgview.setImageResource(R.drawable.dice6);
                       txt.setText("Six");
                       break;
               }
               int myRanNumber2 = myrandom.nextInt(6) + 1;

               switch (myRanNumber2) {
                   case 1:
                       ;
                       imgview2.setImageResource(R.drawable.dice1);
                       txt2.setText("One");
                       break;
                   case 2:
                       ;
                       imgview2.setImageResource(R.drawable.dice2);
                       txt2.setText("Two");
                       break;
                   case 3:
                       ;
                       imgview2.setImageResource(R.drawable.dice3);
                       txt2.setText("Three");
                       break;
                   case 4:
                       ;
                       imgview2.setImageResource(R.drawable.dice4);
                       txt2.setText("Four");
                       break;
                   case 5:
                       ;
                       imgview2.setImageResource(R.drawable.dice5);
                       txt2.setText("Five");
                       break;
                   case 6:
                       ;
                       imgview2.setImageResource(R.drawable.dice6);
                       txt2.setText("Six");
                       break;
               }
           }
       });
    };
};
