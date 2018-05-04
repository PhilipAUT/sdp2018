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

public class UnitTest1
{

    @Test
    public void TestNotNullBuildings()
    {
        AUTPOIMarkers apm1 = new AUTPOIMarkers();
        assertNotNull(apm1.getPoiData());
    }

    @Test
    public void TestBuildingDataReturnsExpected()
    {
        AUTPOIMarkers apm1 = new AUTPOIMarkers();
        assertNotNull(apm1.getPoiData().get(0));
        assertTrue(apm1.getPoiData().get(0)==apm1.getWaBuildingCenter());
    }

    @Test
    public void testnoNullArrayEntries()
    {
        AUTPOIMarkers apm1 = new AUTPOIMarkers();
        for(int i = 0; i < apm1.getPoiData().size();i++)
        {
            assertNotNull(apm1.getPoiData().get(i));
        }
    }

    @Test
    public void testNoDuplicates()
    {
        AUTPOIMarkers apm1 = new AUTPOIMarkers();
        assertNotEquals(apm1.getPoiData().get(0),apm1.getPoiData().get(1));
        assertEquals(apm1.getPoiData().get(0),apm1.getPoiData().get(0));

        for(int i = 0; i < apm1.getPoiData().size(); i++)
        {
            for(int j = 0; j < apm1.getPoiData().size(); j++)
            {
                if(i == j)
                {
                    assertEquals(apm1.getPoiData().get(i),apm1.getPoiData().get(j));
                }
                else if (i != j)
                {
                    assertNotEquals(apm1.getPoiData().get(i),apm1.getPoiData().get(j));
                }
                else
                {
                    fail();
                }
            }
        }
    }

}