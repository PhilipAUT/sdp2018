package com.aut.sdp2018.autuniapp;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;


public class AUTBus extends AppCompatActivity {

    private ArrayList<TextView> textViewarray = new ArrayList<>();
    private View linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autbus);
        linearLayout = findViewById(R.id.linear1);
        TextView welcome = new TextView(this);
        welcome.setText("There's nothing here right now.  Tap a destination to see some bus times :)");
        welcome.setTextSize(24);
        textViewarray.add(welcome);
        ((LinearLayout) linearLayout).addView(textViewarray.get(0));


    }

    public void citySouth(View view)
    {
        Toast.makeText(getApplicationContext(),"Showing City to South Campus Departures",Toast.LENGTH_LONG).show();
        clearList();
        createList(1);
    }

    public void cityNorth(View view)
    {
        Toast.makeText(getApplicationContext(),"Showing City to North Campus Departures",Toast.LENGTH_LONG).show();
        clearList();
        createList(2);
    }

    public void southCity(View view)
    {
        Toast.makeText(getApplicationContext(),"Showing South to City Campus Departures",Toast.LENGTH_LONG).show();
        clearList();
        createList(3);
    }

    public void northCity(View view)
    {
        Toast.makeText(getApplicationContext(),"Showing North to City Campus Departures",Toast.LENGTH_LONG).show();
        clearList();
        createList(4);
    }

    public void clearList()
    {
        for(int i = 0; i < textViewarray.size(); i++)
        {
            ((LinearLayout) linearLayout).removeView(textViewarray.get(i));
            System.out.println("removing");

        }
        textViewarray.clear();
    }

    private void createList(int timetable)
    {
        TimeTableManager t1 = new TimeTableManager();

//        clearList();
        t1.updateTimes();
        System.out.println(textViewarray.size());
        if(textViewarray.size()==0)
        {
            for(int i = 0; i < t1.testSize(timetable); i++)
            {
                TextView test1 = new TextView(this);
                test1.setText(t1.testTimes(i,timetable));
                test1.setId(View.generateViewId());
                test1.setTextSize(28);
                test1.setGravity(Gravity.CENTER_HORIZONTAL);

                if(i==0)
                {
                    test1.setTextColor(Color.GREEN);
                }
                test1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                textViewarray.add(test1);
            }
        }


        for(int i = 0; i < textViewarray.size(); i++)
        {
            ((LinearLayout) linearLayout).addView(textViewarray.get(i));
            System.out.println("adding");
        }


    }
}
