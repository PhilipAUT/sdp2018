package com.aut.sdp2018.autuniapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class AUTMap extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnPolygonClickListener,GoogleMap.OnMyLocationClickListener,GoogleMap.OnMyLocationButtonClickListener {

    private GoogleMap mMap;
    private AUTPOIMarkers poiMarker;
    private MapMenuManager menuManager;
    private AUTMapBuildings buildings;
    private float strokeWidth = 3.0f;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private boolean mPermissionDenied = false;

    //Constructor for Maps activity
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autmap );
        System.out.println("##Maps actually opened##");
        poiMarker = new AUTPOIMarkers();
        menuManager = new MapMenuManager();
        buildings = new AUTMapBuildings();


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    //Creates Options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mapsmenu, menu);
        return true;
    }

    //Manages Menu Selection Inputs
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(menuManager.manageInput(mMap,item,poiMarker))//Calls menu management function
        {
            return true;
        }
        else return super.onOptionsItemSelected(item);
    }


    //Creates the Google Map view and loads features
    @Override
    public void onMapReady(GoogleMap googleMap)
    {

        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setBuildingsEnabled(false);

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        buildings.addBuildingsToMap(mMap,poiMarker,strokeWidth);

        googleMap.setOnPolygonClickListener(this);
        mMap.setOnMyLocationButtonClickListener(this);
        mMap.setOnMyLocationClickListener(this);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-36.85288, 174.766080),17));
        mMap.setMinZoomPreference(16);
        mMap.setMaxZoomPreference(20);
        LatLngBounds b1 = new LatLngBounds(new LatLng(-36.859108, 174.759182), new LatLng(-36.849896, 174.771771));
        mMap.setLatLngBoundsForCameraTarget(b1);
        enableMyLocation();

    }

    //Function for allowing GPS to be used by the user
    private void enableMyLocation()
    {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // Permission to access the location is missing.
            PermissionUtils.requestPermission(this, LOCATION_PERMISSION_REQUEST_CODE,
                    Manifest.permission.ACCESS_FINE_LOCATION, true);
        } else if (mMap != null) {
            // Access to the location has been granted to the app.
            mMap.setMyLocationEnabled(true);
        }
    }

    @Override
    public boolean onMyLocationButtonClick()
    {
        Toast.makeText(this, "Attempting to find your location", Toast.LENGTH_SHORT).show();
        // Return false so that we don't consume the event and the default behavior still occurs
        // (the camera animates to the user's current position).
        return false;
    }

    //Shows some data on the GPS location of the user
    @Override
    public void onMyLocationClick(@NonNull Location location)
    {
        Toast.makeText(this, "Current location:\nLat: "+location.getLatitude()+"\nLong: "+location.getLongitude()+"\nAccuracy: "+location.getAccuracy(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        if (requestCode != LOCATION_PERMISSION_REQUEST_CODE) {
            return;
        }

        if (PermissionUtils.isPermissionGranted(permissions, grantResults, Manifest.permission.ACCESS_FINE_LOCATION))
        {
            // Enable the my location layer if the permission has been granted.
            enableMyLocation();
        } else
        {
            // Display the missing permission error dialog when the fragments resume.
            mPermissionDenied = true;
        }
    }

    @Override
    protected void onResumeFragments()
    {
        super.onResumeFragments();
        if (mPermissionDenied) {
            // Permission was not granted, display error dialog.
            showMissingPermissionError();
            mPermissionDenied = false;
        }
    }


    //Displays a dialog with error message explaining that the location permission is missing.
    private void showMissingPermissionError()
    {
        PermissionUtils.PermissionDeniedDialog
                .newInstance(true).show(getSupportFragmentManager(), "dialog");
    }


    //Sends a toast to the user saying what building they clicked
    @Override
    public void onPolygonClick(Polygon polygon)
    {
        Toast.makeText(this,polygon.getTag().toString(),Toast.LENGTH_SHORT).show();
    }

}

