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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autmap );


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private boolean mPermissionDenied = false;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mapsmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
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
            case R.id.traffictoggle:
                if(mMap.isTrafficEnabled())
                {
                    mMap.setTrafficEnabled(false);
                }
                else
                    mMap.setTrafficEnabled(true);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap)
    {

        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        //WA Building
        Polygon waBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.85288, 174.766080),
                        new LatLng(-36.852970, 174.76678),
                        new LatLng(-36.853120, 174.766777),
                        new LatLng(-36.853137,174.766857),
                        new LatLng(-36.853437,174.766814),
                        new LatLng(-36.853379, 174.766257),
                        new LatLng(-36.853100,174.766090)));
        waBuilding.setFillColor(0xffF57F17);
        waBuilding.setTag("AUT WA Building");

        //WH Building
        Polygon whBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.852099, 174.766009),
                        new LatLng(-36.852077, 174.766146),
                        new LatLng(-36.852145, 174.766162),
                        new LatLng(-36.852239, 174.766292),
                        new LatLng(-36.852826, 174.765995),
                        new LatLng(-36.852782, 174.765783),
                        new LatLng(-36.852452, 174.765982),
                        new LatLng(-36.852332, 174.766023)));
        whBuilding.setFillColor(0xffA57F17);
        whBuilding.setTag("AUT WH Building");

        //WZ Building
        Polygon wzBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853929, 174.766385),
                        new LatLng(-36.854018, 174.767160),
                        new LatLng(-36.854212, 174.767136),
                        new LatLng(-36.854121, 174.766355)));
        wzBuilding.setFillColor(0xff127F17);
        wzBuilding.setTag("AUT WZ Building");

        //WF Building
        Polygon wfBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853265, 174.765371),
                        new LatLng(-36.853316, 174.765435),
                        new LatLng(-36.853447, 174.765285),
                        new LatLng(-36.853529, 174.765359),
                        new LatLng(-36.853467, 174.765539),
                        new LatLng(-36.853536, 174.765577),
                        new LatLng(-36.853712, 174.765109),
                        new LatLng(-36.853545, 174.765023)));
        wfBuilding.setFillColor(0xffABAD17);
        wfBuilding.setTag("AUT WF Building");

        //WG Building
        Polygon wgBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.852830, 174.765763),
                        new LatLng(-36.852914, 174.765978),
                        new LatLng(-36.853072, 174.765917),
                        new LatLng(-36.853179,174.765835),
                        new LatLng(-36.853280,174.765625),
                        new LatLng(-36.853184,174.765535)));
        wgBuilding.setFillColor(0xFFE57373);
        wgBuilding.setTag("AUT WG Lecture Building");

        //WG Building 2
        Polygon wg2Building = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853346, 174.765654),
                        new LatLng(-36.853204, 174.766043),
                        new LatLng(-36.853334, 174.766115),
                        new LatLng(-36.853303,174.766202),
                        new LatLng(-36.853552,174.766257),
                        new LatLng(-36.853523,174.765992),
                        new LatLng(-36.853596,174.765807)));
        wg2Building.setFillColor(0xFF32CD32);
        wg2Building.setTag("AUT WG Comms Building");

        googleMap.setOnPolygonClickListener(this);
        mMap.setOnMyLocationButtonClickListener(this);
        mMap.setOnMyLocationClickListener(this);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-36.85288, 174.766080),17));
        mMap.setMinZoomPreference(16);
        mMap.setMaxZoomPreference(19);
        LatLngBounds b1 = new LatLngBounds(new LatLng(-36.859108, 174.759182), new LatLng(-36.849896, 174.771771));
        mMap.setLatLngBoundsForCameraTarget(b1);
        enableMyLocation();

    }

    private void enableMyLocation() {
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
    public boolean onMyLocationButtonClick() {
        Toast.makeText(this, "Attempting to find your location", Toast.LENGTH_SHORT).show();
        // Return false so that we don't consume the event and the default behavior still occurs
        // (the camera animates to the user's current position).
        return false;
    }

    @Override
    public void onMyLocationClick(@NonNull Location location) {
        Toast.makeText(this, "Current location:\nLat: "+location.getLatitude()+"\nLong: "+location.getLongitude()+"\nAccuracy: "+location.getAccuracy(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode != LOCATION_PERMISSION_REQUEST_CODE) {
            return;
        }

        if (PermissionUtils.isPermissionGranted(permissions, grantResults,
                Manifest.permission.ACCESS_FINE_LOCATION)) {
            // Enable the my location layer if the permission has been granted.
            enableMyLocation();
        } else {
            // Display the missing permission error dialog when the fragments resume.
            mPermissionDenied = true;
        }
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        if (mPermissionDenied) {
            // Permission was not granted, display error dialog.
            showMissingPermissionError();
            mPermissionDenied = false;
        }
    }

    /**
     * Displays a dialog with error message explaining that the location permission is missing.
     */
    private void showMissingPermissionError() {
        PermissionUtils.PermissionDeniedDialog
                .newInstance(true).show(getSupportFragmentManager(), "dialog");
    }


    @Override
    public void onPolygonClick(Polygon polygon)
    {
        Toast.makeText(this,polygon.getTag().toString(),Toast.LENGTH_SHORT).show();
    }
}

