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
    private LatLng waBuildingCenter = new LatLng(-36.853164, 174.766475);
    private LatLng wbBuildingCenter = new LatLng(-36.853397, 174.767395);
    private LatLng wcBuildingCenter = new LatLng(-36.853622, 174.767079);
    private LatLng wdBuildingCenter = new LatLng(-36.853864, 174.767076);
    private LatLng weBuildingCenter = new LatLng(-36.853709, 174.766353);
    private LatLng wfBuildingCenter = new LatLng(-36.853578, 174.765195);
    private LatLng wgBuildingCenter = new LatLng(-36.853033, 174.765766);
    //private LatLng wg2BuildingCenter = new LatLng(-36.853396, 174.765914);
    private LatLng whBuildingCenter = new LatLng(-36.852443, 174.766069);
    private LatLng wmBuildingCenter = new LatLng(-36.854065, 174.766031);
    private LatLng wnBuildingCenter = new LatLng(-36.854435, 174.766179);
    private LatLng woBuildingCenter = new LatLng(-36.854107, 174.765458);
    private LatLng wrBuildingCenter = new LatLng(-36.854993, 174.766917);
    private LatLng wtBuildingCenter = new LatLng(-36.852460, 174.764596);
    private LatLng wuBuildingCenter = new LatLng(-36.853804, 174.765260);
    private LatLng wwBuildingCenter = new LatLng(-36.854537, 174.766958);
    private LatLng wxBuildingCenter = new LatLng(-36.853030, 174.764211);
    private LatLng wyBuildingCenter = new LatLng(-36.853434, 174.764295);
    private LatLng wzBuildingCenter = new LatLng(-36.854069, 174.766795);

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
            case R.id.waBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(waBuildingCenter,19));
                return true;
            case R.id.wbBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wbBuildingCenter,19));
                return true;
            case R.id.wcBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wcBuildingCenter,19));
                return true;
            case R.id.wdBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wdBuildingCenter,19));
                return true;
            case R.id.weBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(weBuildingCenter,19));
                return true;
            case R.id.wfBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wfBuildingCenter,19));
                return true;
            case R.id.wgBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wgBuildingCenter,19));
                return true;
            case R.id.whBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(whBuildingCenter,19));
                return true;
            case R.id.wmBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wmBuildingCenter,19));
                return true;
            case R.id.wnBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wnBuildingCenter,19));
                return true;
            case R.id.woBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(woBuildingCenter,19));
                return true;
            case R.id.wrBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wrBuildingCenter,19));
                return true;
            case R.id.wtBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wtBuildingCenter,19));
                return true;
            case R.id.wuBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wuBuildingCenter,19));
                return true;
            case R.id.wwBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wwBuildingCenter,19));
                return true;
            case R.id.wxBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wxBuildingCenter,19));
                return true;
            case R.id.wyBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wyBuildingCenter,19));
                return true;
            case R.id.wzBuilding:
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wzBuildingCenter,19));
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
        mMap.setBuildingsEnabled(false);

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
        waBuilding.setFillColor(0xffff0000);
        waBuilding.setStrokeWidth(3f);
        waBuilding.setTag("AUT WA Building");
        mMap.addMarker(new MarkerOptions().position(waBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wa)).flat(false));

        //WB Building
        Polygon wbBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853284, 174.767073),
                        new LatLng(-36.853129, 174.767348),
                        new LatLng(-36.853520, 174.767688),
                        new LatLng(-36.853646, 174.767457),
                        new LatLng(-36.853323, 174.767178),
                        new LatLng(-36.853351, 174.767124)));
        wbBuilding.setFillColor(0xff3bb0e2);
        wbBuilding.setStrokeWidth(3f);
        wbBuilding.setTag("AUT WB Building");
        mMap.addMarker(new MarkerOptions().position(wbBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wb)).flat(false));

        //WC Building
        Polygon wcBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853523, 174.766749),
                        new LatLng(-36.853550, 174.767052),
                        new LatLng(-36.853433, 174.767272),
                        new LatLng(-36.853647, 174.767459),
                        new LatLng(-36.853758, 174.767258),
                        new LatLng(-36.853655, 174.767166),
                        new LatLng(-36.853692, 174.767088),
                        new LatLng(-36.853657, 174.766723)));
        wcBuilding.setFillColor(0xffFF00FF);
        wcBuilding.setStrokeWidth(3f);
        wcBuilding.setTag("AUT WC Building");
        mMap.addMarker(new MarkerOptions().position(wcBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wc)).flat(false));

        //WD Building
        Polygon wdBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853744, 174.766756),
                        new LatLng(-36.853780, 174.767114),
                        new LatLng(-36.853692, 174.767129),
                        new LatLng(-36.853688, 174.767177),
                        new LatLng(-36.853756, 174.767237),
                        new LatLng(-36.853791, 174.767224),
                        new LatLng(-36.853815, 174.767410),
                        new LatLng(-36.853914, 174.767385),
                        new LatLng(-36.853847, 174.766738)));
        wdBuilding.setFillColor(0xffFF0000);
        wdBuilding.setStrokeWidth(3f);
        wdBuilding.setTag("AUT WD Building");
        mMap.addMarker(new MarkerOptions().position(wdBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wd)).flat(false));

        //WE Building
        Polygon weBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853573, 174.765953),
                        new LatLng(-36.853642, 174.766530),
                        new LatLng(-36.853591, 174.766539),
                        new LatLng(-36.853582, 174.766482),
                        new LatLng(-36.853460, 174.766503),
                        new LatLng(-36.853475, 174.766646),
                        new LatLng(-36.853603, 174.766623),
                        new LatLng(-36.853652, 174.766587),
                        new LatLng(-36.853670, 174.766696),
                        new LatLng(-36.853826, 174.766668),
                        new LatLng(-36.853735, 174.765920)));
        weBuilding.setFillColor(0xff88FF00);
        weBuilding.setStrokeWidth(3f);
        weBuilding.setTag("AUT WE Building");
        mMap.addMarker(new MarkerOptions().position(weBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.we)).flat(false));

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
        wfBuilding.setFillColor(0xff880000);
        wfBuilding.setStrokeWidth(3f);
        wfBuilding.setTag("AUT WF Building");
        mMap.addMarker(new MarkerOptions().position(wfBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wf)).flat(false));


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
        wgBuilding.setFillColor(0xffffd700);
        wgBuilding.setStrokeWidth(3f);
        wgBuilding.setTag("AUT WG Lecture Building");
        mMap.addMarker(new MarkerOptions().position(wgBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wg)).flat(false));

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
        wg2Building.setFillColor(0xffffd700);
        wg2Building.setStrokeWidth(3f);
        wg2Building.setTag("AUT WG Comms Building");


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
        whBuilding.setFillColor(0xff88FF00);
        whBuilding.setStrokeWidth(3f);
        whBuilding.setTag("AUT WH Building");
        mMap.addMarker(new MarkerOptions().position(whBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wh)).flat(false));

        //WM Building
        Polygon wmBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853866, 174.765779),
                        new LatLng(-36.853901, 174.766089),
                        new LatLng(-36.853977, 174.766080),
                        new LatLng(-36.854001, 174.766343),
                        new LatLng(-36.854242, 174.766311),
                        new LatLng(-36.854220, 174.766003),
                        new LatLng(-36.854185, 174.765950)));
        wmBuilding.setFillColor(0xff88FF00);
        wmBuilding.setStrokeWidth(3f);
        wmBuilding.setTag("AUT WM Building");
        mMap.addMarker(new MarkerOptions().position(wmBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wm)).flat(false));

        //WN Building
        Polygon wnBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.854360, 174.766076),
                        new LatLng(-36.854320, 174.766174),
                        new LatLng(-36.854519, 174.766276),
                        new LatLng(-36.854551, 174.766187)));
        wnBuilding.setFillColor(0xff00FF88);
        wnBuilding.setStrokeWidth(3f);
        wnBuilding.setTag("AUT WN Building");
         mMap.addMarker(new MarkerOptions().position(wnBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wn)).flat(false));

        //WO Building
        Polygon woBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.854048, 174.765308),
                        new LatLng(-36.853868, 174.765778),
                        new LatLng(-36.854181, 174.765948),
                        new LatLng(-36.854218, 174.765852),
                        new LatLng(-36.854288, 174.765832),
                        new LatLng(-36.854363, 174.765467)));
        woBuilding.setFillColor(0xff3bb0e2);
        woBuilding.setStrokeWidth(3f);
        woBuilding.setTag("AUT WO Building");
        mMap.addMarker(new MarkerOptions().position(woBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wo)).flat(false));

        //WR Building

        Polygon wrBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.854719, 174.766563),
                        new LatLng(-36.854738, 174.766744),
                        new LatLng(-36.854876, 174.766790),
                        new LatLng(-36.854957, 174.766890),
                        new LatLng(-36.854780, 174.767095),
                        new LatLng(-36.854792, 174.767251),
                        new LatLng(-36.854842, 174.767259),
                        new LatLng(-36.855116, 174.766942),
                        new LatLng(-36.854926, 174.766708),
                        new LatLng(-36.854957, 174.766632)));
        wrBuilding.setFillColor(0xff880000);
        wrBuilding.setStrokeWidth(3f);
        wrBuilding.setTag("AUT WR Building");
        mMap.addMarker(new MarkerOptions().position(wrBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wr)).flat(false));

        //WT Building
        Polygon wtBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.852367, 174.764381),
                        new LatLng(-36.852261, 174.764669),
                        new LatLng(-36.852497, 174.764823),
                        new LatLng(-36.852611, 174.764514)));
        wtBuilding.setFillColor(0xff880088);
        wtBuilding.setStrokeWidth(3f);
        wtBuilding.setTag("AUT WT Building");
        mMap.addMarker(new MarkerOptions().position(wtBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wt)).flat(false));

        //WU Building
        Polygon wuBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853714, 174.765109),
                        new LatLng(-36.853631, 174.765345),
                        new LatLng(-36.853843, 174.765464),
                        new LatLng(-36.853927, 174.765241)));
        wuBuilding.setFillColor(0xff123456);
        wuBuilding.setStrokeWidth(3f);
        wuBuilding.setTag("AUT WU Building");
        mMap.addMarker(new MarkerOptions().position(wuBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wu)).flat(false));

        //WW Building
        Polygon wwBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.854431, 174.766782),
                        new LatLng(-36.854487, 174.767210),
                        new LatLng(-36.854595, 174.767193),
                        new LatLng(-36.854564, 174.766943),
                        new LatLng(-36.854630, 174.766932),
                        new LatLng(-36.854617, 174.766830),
                        new LatLng(-36.854573, 174.766835),
                        new LatLng(-36.854562, 174.766756)));
        wwBuilding.setFillColor(0xff123456);
        wwBuilding.setStrokeWidth(3f);
        wwBuilding.setTag("AUT WW Building");
        mMap.addMarker(new MarkerOptions().position(wwBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.ww)).flat(false));

        //WX Building
        Polygon wxBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.852964, 174.764044),
                        new LatLng(-36.852887, 174.764263),
                        new LatLng(-36.853104, 174.764390),
                        new LatLng(-36.853183, 174.764158)));
        wxBuilding.setFillColor(0xff654321);
        wxBuilding.setStrokeWidth(3f);
        wxBuilding.setTag("AUT WX Building");
        mMap.addMarker(new MarkerOptions().position(wxBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wx)).flat(false));

        //WY Building
        Polygon wyBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853414, 174.764022),
                        new LatLng(-36.853249, 174.764493),
                        new LatLng(-36.853418, 174.764600),
                        new LatLng(-36.853610, 174.764126)));
        wyBuilding.setFillColor(0xffffd700);
        wyBuilding.setStrokeWidth(3f);
        wyBuilding.setTag("AUT WY Building");
        mMap.addMarker(new MarkerOptions().position(wyBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wy)).flat(false));

        //WZ Building
        Polygon wzBuilding = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853929, 174.766385),
                        new LatLng(-36.854018, 174.767160),
                        new LatLng(-36.854212, 174.767136),
                        new LatLng(-36.854121, 174.766355)));
        wzBuilding.setFillColor(0xffffd700);
        wzBuilding.setStrokeWidth(3f);
        wzBuilding.setTag("AUT WZ Building");
        mMap.addMarker(new MarkerOptions().position(wzBuildingCenter).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wz)).flat(false));



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

