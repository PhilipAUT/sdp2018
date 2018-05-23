package com.aut.sdp2018.autuniapp;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AUTBus extends AppCompatActivity {

    private ArrayList<TextView> textViewarray = new ArrayList<>();
    private View linearLayout;
    private Calendar currentTime;
    private boolean added;
    private boolean removed;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autbus);
        linearLayout = findViewById(R.id.linear1);
        currentTime = Calendar.getInstance();
        System.out.println(currentTime.get(Calendar.DATE));
        System.out.println(currentTime.get(Calendar.HOUR_OF_DAY));
        System.out.println(currentTime.get(Calendar.MINUTE));
        added = false;
        removed = true;
//        TextView textView = findViewById(R.id.time1);
//        textView.setText("test");
//        View linearLayout = findViewById(R.id.linear1);
//        TextView test1 = new TextView(this);
//        test1.setText("testText");
//        test1.setId(View.generateViewId());
//        test1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        ((LinearLayout) linearLayout).addView(test1);
    }

    public void citySouth(View view)
    {
//        TextView textView = findViewById(R.id.time1);
//        textView.setText("9:00");
//        textView = findViewById(R.id.time2);
//        textView.setText("10:00");
//        textView = findViewById(R.id.time3);
//        textView.setText("11:00");
//        textView = findViewById(R.id.time4);
//        textView.setText("12:00");

        clearList();
        added = false;
//        for(int i = 0; i < textViewarray.size(); i++)
//        {
//            textViewarray.remove(i);
//            System.out.println("removing");
//        }


    }

    public void southCity(View view)
    {

//        TextView textView = findViewById(R.id.time1);
//        textView.setText("test");


        //BusTime b1 = new BusTime(10,00,23,00);
        TimeTableManager t1 = new TimeTableManager();

        clearList();
        if(textViewarray.size()==0)
        {
            for(int i = 0; i < t1.testSize(1); i++)
            {
                TextView test1 = new TextView(this);
                test1.setText(t1.testTimes(i,1));
                test1.setId(View.generateViewId());
                test1.setTextSize(36);
                if(i==0)
                {
                    test1.setTextColor(Color.GREEN);
                }
                test1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                textViewarray.add(test1);
            }
        }



        if(!added && removed)
        {
            for(int i = 0; i < textViewarray.size(); i++)
            {
                ((LinearLayout) linearLayout).addView(textViewarray.get(i));
                System.out.println("adding");
            }
        }
        added = true;
        removed = false;

        //((LinearLayout) linearLayout).removeView(test1);


//        TextView textView = findViewById(R.id.time1);
//        textView.setText("13:00");
//        textView = findViewById(R.id.time2);
//        textView.setText("14:00");
//        textView = findViewById(R.id.time3);
//        textView.setText("15:00");
//        textView = findViewById(R.id.time4);
//        textView.setText("16:00");
    }

    public void clearList()
    {
        for(int i = 0; i < textViewarray.size(); i++)
        {
            ((LinearLayout) linearLayout).removeView(textViewarray.get(i));
            System.out.println("removing");
        }
        removed = true;
    }


}
