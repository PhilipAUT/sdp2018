package com.aut.sdp2018.autuniapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void openMapActivity(View view)
    {
        Intent autMap = new Intent(this,AUTMap.class);
        startActivity(autMap);
    }
}
