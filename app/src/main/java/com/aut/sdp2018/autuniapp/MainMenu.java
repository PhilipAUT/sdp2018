package com.aut.sdp2018.autuniapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity
{

    //A constructor that invokes the main menu from the xml code.
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        System.out.print("Menu Opened\n");
    }


    // When clicked, opens the Aut Map component of the app.
    public void openMapActivity(View view)
    {
        Intent autMap = new Intent(this,AUTMap.class);
        startActivity(autMap);
        System.out.println("Maps Clicked\n");
        System.out.println("##Maps opening...##");

    }

    //For app buttons that hasn't developed yet, a message is displayed  through the comingSoon method.
    public void  comingSoon(View view)
    {
        Toast.makeText(getApplicationContext(),"Coming Soon",Toast.LENGTH_LONG).show();
        System.out.println("##Coming soon Message Displayed##");
    }


    //Start the SnakeGame app
    public void startGame(View view)
    {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.SDP.SnakeGame");
        if (launchIntent != null)//null pointer check in case package name was not found
        {
            startActivity(launchIntent);
        }
    }


    //This invokes the setiings component in  the app.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        System.out.println("Settings Clicked\n");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenusettings, menu);
        System.out.println("##Create Menu##");
        return true;

    }

    //When clicked, opens the settings component of the app
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        System.out.println("Settings opened");

        switch (item.getItemId()) {
            case R.id.settings:
                System.out.println("##Setting Option Selected##");
                Intent settings = new Intent(this, SettingsActivity.class);
                startActivity(settings);
                System.out.println("##Start Setting Activity...##");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
