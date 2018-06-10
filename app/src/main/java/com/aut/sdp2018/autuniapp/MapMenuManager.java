package com.aut.sdp2018.autuniapp;

import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;

//
//AUTHOR = PHILIP
//

public class MapMenuManager
{
    public MapMenuManager()
    {
        //Empty Constructor
    }

    //Manages the Map Menu Functionality, Will update map based on selection
    public boolean manageInput(GoogleMap mMap, MenuItem item, AUTPOIMarkers poiMarker)
    {
        // Handle item selection
        switch (item.getItemId())
        {
            //Change Map Type
            case R.id.satview:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                return true;
            case R.id.terrain:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                return true;
            case R.id.streetmap:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                return true;
            case R.id.hybridmap:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                return true;
            //Show or Hide Traffic on the Map
            case R.id.traffictoggle:
                if(mMap.isTrafficEnabled())
                {
                    mMap.setTrafficEnabled(false);
                }
                else
                    mMap.setTrafficEnabled(true);
                return true;
            //Move the User View Point to the Selcted Building
            case R.id.waBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWaBuildingCenter(),19));
                return true;
            case R.id.wbBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWbBuildingCenter(),19));
                return true;
            case R.id.wcBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWcBuildingCenter(),19));
                return true;
            case R.id.wdBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWdBuildingCenter(),19));
                return true;
            case R.id.weBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWeBuildingCenter(),19));
                return true;
            case R.id.wfBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWfBuildingCenter(),19));
                return true;
            case R.id.wgBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWgBuildingCenter(),19));
                return true;
            case R.id.whBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWhBuildingCenter(),19));
                return true;
            case R.id.wmBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWmBuildingCenter(),19));
                return true;
            case R.id.wnBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWnBuildingCenter(),19));
                return true;
            case R.id.woBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWoBuildingCenter(),19));
                return true;
            case R.id.wrBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWrBuildingCenter(),19));
                return true;
            case R.id.wtBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWtBuildingCenter(),19));
                return true;
            case R.id.wuBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWuBuildingCenter(),19));
                return true;
            case R.id.wwBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWwBuildingCenter(),19));
                return true;
            case R.id.wxBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWxBuildingCenter(),19));
                return true;
            case R.id.wyBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWyBuildingCenter(),19));
                return true;
            case R.id.wzBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(poiMarker.getWzBuildingCenter(),19));
                return true;
            default:
                return false;
        }
    }
}
