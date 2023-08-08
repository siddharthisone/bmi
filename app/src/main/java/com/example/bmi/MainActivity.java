package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //making objects
        TextView txtResult;
        EditText addWeight,addHeight;
        Button buttons,next;

    addWeight = findViewById(R.id.enter_weight);
    addHeight=findViewById(R.id.enter_height);
    buttons = findViewById(R.id.bts);
    txtResult=findViewById(R.id.result);
     next = findViewById(R.id.nextB);

    buttons.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

           double wt = Double.parseDouble(addWeight.getText().toString());
           double ht = Double.parseDouble(addHeight.getText().toString());
           double bmi = wt/(ht*ht);
           if(bmi>25)
           {
               txtResult.setText("YOU ARE OVERWEIGHT");
           } else if (bmi<18) {
               txtResult.setText("YOU ARE UNDERWEIGHT");
           }
           else{
               txtResult.setText("NORMAL AND HEALTHY");
           }

        }
    });

    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent iNext;
            iNext = new Intent(getApplicationContext(),resultsPage.class);
            startActivity(iNext);
        }
    });



    }

}