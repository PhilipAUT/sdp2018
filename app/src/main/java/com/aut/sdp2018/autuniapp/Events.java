package com.aut.sdp2018.autuniapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Events extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        System.out.print("Events Opened\n");


        String[] eventsArray ={"Event 1","Event 2","Event 3","Event 4","Event 5","Event 6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,eventsArray);
        setListAdapter(adapter);



    }




}
