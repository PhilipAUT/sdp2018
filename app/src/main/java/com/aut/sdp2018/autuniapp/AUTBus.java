package com.aut.sdp2018.autuniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AUTBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autbus);
        TextView textView = (TextView) findViewById(R.id.time1);
        textView.setText("test");
    }

    public void citySouth(View view)
    {
        TextView textView = findViewById(R.id.time1);
        textView.setText("9:00");
        textView = findViewById(R.id.time2);
        textView.setText("10:00");
        textView = findViewById(R.id.time3);
        textView.setText("11:00");
        textView = findViewById(R.id.time4);
        textView.setText("12:00");
    }

    public void southCity(View view)
    {
        TextView textView = findViewById(R.id.time1);
        textView.setText("13:00");
        textView = findViewById(R.id.time2);
        textView.setText("14:00");
        textView = findViewById(R.id.time3);
        textView.setText("15:00");
        textView = findViewById(R.id.time4);
        textView.setText("16:00");
    }


}
