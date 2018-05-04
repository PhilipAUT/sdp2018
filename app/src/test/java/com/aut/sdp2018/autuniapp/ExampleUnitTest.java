package com.aut.sdp2018.autuniapp;

import android.view.MenuItem;

import com.google.android.gms.maps.GoogleMap;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest
{

    @Test
    public void addition_isCorrect()
    {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testMapPointToString()
    {
        AUTMap m1 = new AUTMap();
        System.out.println(m1.getWAcenter());
    }

    @Test
    public void testNotNullLocation()
    {
        AUTMap m1 = new AUTMap();
        assertNotNull(m1.getWAcenter());
    }


    @Test
    public void testStartupMapStyle()
    {

    }


//    @Test
//    public void isClicked(){
//
//        assertEquals(autuniapp.MainMenu, autuniapp.MainMenu);
//    }



}