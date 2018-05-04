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

    /*
        Its a constructor that invokes the main menu from the xml code.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
        /*
         When clicked, opens the Aut Map component of the app.
        */

    public void openMapActivity(View view)
    {
        Intent autMap = new Intent(this,AUTMap.class);
        startActivity(autMap);
    }

     /*
       For app buttons that hasn't developed yet, a message is displayed  through the comingSoon method.
     */


    public void  comingSoon(View view)
    {
        Toast.makeText(getApplicationContext(),"Coming Soon",Toast.LENGTH_LONG).show();
    }

    /*
       This invokes the setiings component in  the app.
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenusettings, menu);
        return true;
    }

      /*
       When clicked, opens the settings component of the app
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.settings:
                Intent settings = new Intent(this, SettingsActivity.class);
                startActivity(settings);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
