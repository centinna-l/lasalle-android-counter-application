package com.example.counterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // We need a constraint Layout - Done
    // We need a textview in the center of the screen - Done
    // 2 buttons
    // 1. Adding +1 to the counter - Done
    // 2. Subtracting -1 to the counter - Done

    // Linking the components in XML to the JAVA File.
    private TextView textView;
    private Button buttonPlus, buttonMinus;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Link the component
        textView = (TextView) findViewById(R.id.counter);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);

        // Button Plus
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter ++; // Adding +1 to the counter
                Log.d("BUTTON PLUS", "onCreate() "+ counter);
                textView.setText(Integer.toString(counter));
            }
        });

        // Button Minus

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter -- ; // Subtracting -1 from the counter value.
                Log.d("BUTTON MINUS", "onCreate() "+ counter);
                textView.setText(Integer.toString(counter));
            }
        });
    }
}