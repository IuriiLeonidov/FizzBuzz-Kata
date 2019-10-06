package com.example.android.fizzbuzzkata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView fizzBuzzOutputTextView = findViewById(R.id.fizz_buzz_output_text_view);

        for (int i = 1; i <= 100; i++) {
            String convertedValue = ConversionManager.convertNumber(i);
            fizzBuzzOutputTextView.append(convertedValue+"\n");
        }
    }
}
