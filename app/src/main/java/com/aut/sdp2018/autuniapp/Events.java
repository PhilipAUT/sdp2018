package com.aut.sdp2018.autuniapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
//
//AUTHOR = VIDHYA
//
public class Events extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        System.out.print("Events Opened\n");


        String[] eventsArray ={"Event 1- Tech Week","Event 2, 4/6/18- NZSL Signing Coffee ","Event 3, 4/6/18 - Ocha No Jikan ","Event 4, 5/6/18 - Visiting Writers Programme: Deborah Shepard","Event 5, 6/6/18 - Uni101- My future","Event 6 , 22/6/18 - Creative Technologies: Mid-year show of student work"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,eventsArray);
        setListAdapter(adapter);



    }




}
