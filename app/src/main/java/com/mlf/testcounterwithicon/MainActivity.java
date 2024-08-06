package com.mlf.testcounterwithicon;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PoisonCounter textLife = findViewById(R.id.textViewPoison);
        textLife.setValue(40);
        textLife.setBackgroundColor(Color.BLUE);
    }
}