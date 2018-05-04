package com.aut.sdp2018.autuniapp;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class AUTMapBuildings
{
    public AUTMapBuildings()
    {
        //Empty Constructor
    }

    //This function will add all listed Buildings to the Map
    public void addBuildingsToMap(GoogleMap mMap,AUTPOIMarkers poiMarker, Float strokeWidth)
    {
        //WA Building
        Polygon waBuilding = mMap.addPolygon(new PolygonOptions()
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
        waBuilding.setStrokeWidth(strokeWidth);
        waBuilding.setTag("AUT WA Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWaBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wa)).flat(false));

        //WB Building
        Polygon wbBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853284, 174.767073),
                        new LatLng(-36.853129, 174.767348),
                        new LatLng(-36.853520, 174.767688),
                        new LatLng(-36.853646, 174.767457),
                        new LatLng(-36.853323, 174.767178),
                        new LatLng(-36.853351, 174.767124)));
        wbBuilding.setFillColor(0xff3bb0e2);
        wbBuilding.setStrokeWidth(strokeWidth);
        wbBuilding.setTag("AUT WB Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWbBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wb)).flat(false));

        //WC Building
        Polygon wcBuilding = mMap.addPolygon(new PolygonOptions()
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
        wcBuilding.setStrokeWidth(strokeWidth);
        wcBuilding.setTag("AUT WC Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWcBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wc)).flat(false));

        //WD Building
        Polygon wdBuilding = mMap.addPolygon(new PolygonOptions()
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
        wdBuilding.setStrokeWidth(strokeWidth);
        wdBuilding.setTag("AUT WD Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWdBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wd)).flat(false));

        //WE Building
        Polygon weBuilding = mMap.addPolygon(new PolygonOptions()
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
        weBuilding.setStrokeWidth(strokeWidth);
        weBuilding.setTag("AUT WE Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWeBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.we)).flat(false));

        //WF Building
        Polygon wfBuilding = mMap.addPolygon(new PolygonOptions()
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
        wfBuilding.setStrokeWidth(strokeWidth);
        wfBuilding.setTag("AUT WF Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWfBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wf)).flat(false));


        //WG Building
        Polygon wgBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.852830, 174.765763),
                        new LatLng(-36.852914, 174.765978),
                        new LatLng(-36.853072, 174.765917),
                        new LatLng(-36.853179,174.765835),
                        new LatLng(-36.853280,174.765625),
                        new LatLng(-36.853184,174.765535)));
        wgBuilding.setFillColor(0xffffd700);
        wgBuilding.setStrokeWidth(strokeWidth);
        wgBuilding.setTag("AUT WG Lecture Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWgBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wg)).flat(false));

        //WG Building 2
        Polygon wg2Building = mMap.addPolygon(new PolygonOptions()
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
        wg2Building.setStrokeWidth(strokeWidth);
        wg2Building.setTag("AUT WG Comms Building");


        //WH Building
        Polygon whBuilding = mMap.addPolygon(new PolygonOptions()
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
        whBuilding.setStrokeWidth(strokeWidth);
        whBuilding.setTag("AUT WH Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWhBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wh)).flat(false));

        //WM Building
        Polygon wmBuilding = mMap.addPolygon(new PolygonOptions()
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
        wmBuilding.setStrokeWidth(strokeWidth);
        wmBuilding.setTag("AUT WM Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWmBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wm)).flat(false));

        //WN Building
        Polygon wnBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.854360, 174.766076),
                        new LatLng(-36.854320, 174.766174),
                        new LatLng(-36.854519, 174.766276),
                        new LatLng(-36.854551, 174.766187)));
        wnBuilding.setFillColor(0xff00FF88);
        wnBuilding.setStrokeWidth(strokeWidth);
        wnBuilding.setTag("AUT WN Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWnBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wn)).flat(false));

        //WO Building
        Polygon woBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.854048, 174.765308),
                        new LatLng(-36.853868, 174.765778),
                        new LatLng(-36.854181, 174.765948),
                        new LatLng(-36.854218, 174.765852),
                        new LatLng(-36.854288, 174.765832),
                        new LatLng(-36.854363, 174.765467)));
        woBuilding.setFillColor(0xff3bb0e2);
        woBuilding.setStrokeWidth(strokeWidth);
        woBuilding.setTag("AUT WO Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWoBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wo)).flat(false));

        //WR Building

        Polygon wrBuilding = mMap.addPolygon(new PolygonOptions()
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
        wrBuilding.setStrokeWidth(strokeWidth);
        wrBuilding.setTag("AUT WR Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWrBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wr)).flat(false));

        //WT Building
        Polygon wtBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.852367, 174.764381),
                        new LatLng(-36.852261, 174.764669),
                        new LatLng(-36.852497, 174.764823),
                        new LatLng(-36.852611, 174.764514)));
        wtBuilding.setFillColor(0xff880088);
        wtBuilding.setStrokeWidth(strokeWidth);
        wtBuilding.setTag("AUT WT Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWtBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wt)).flat(false));

        //WU Building
        Polygon wuBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853714, 174.765109),
                        new LatLng(-36.853631, 174.765345),
                        new LatLng(-36.853843, 174.765464),
                        new LatLng(-36.853927, 174.765241)));
        wuBuilding.setFillColor(0xff123456);
        wuBuilding.setStrokeWidth(strokeWidth);
        wuBuilding.setTag("AUT WU Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWuBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wu)).flat(false));

        //WW Building
        Polygon wwBuilding = mMap.addPolygon(new PolygonOptions()
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
        wwBuilding.setStrokeWidth(strokeWidth);
        wwBuilding.setTag("AUT WW Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWwBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.ww)).flat(false));

        //WX Building
        Polygon wxBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.852964, 174.764044),
                        new LatLng(-36.852887, 174.764263),
                        new LatLng(-36.853104, 174.764390),
                        new LatLng(-36.853183, 174.764158)));
        wxBuilding.setFillColor(0xff654321);
        wxBuilding.setStrokeWidth(strokeWidth);
        wxBuilding.setTag("AUT WX Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWxBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wx)).flat(false));

        //WY Building
        Polygon wyBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853414, 174.764022),
                        new LatLng(-36.853249, 174.764493),
                        new LatLng(-36.853418, 174.764600),
                        new LatLng(-36.853610, 174.764126)));
        wyBuilding.setFillColor(0xffffd700);
        wyBuilding.setStrokeWidth(strokeWidth);
        wyBuilding.setTag("AUT WY Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWyBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wy)).flat(false));

        //WZ Building
        Polygon wzBuilding = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(-36.853929, 174.766385),
                        new LatLng(-36.854018, 174.767160),
                        new LatLng(-36.854212, 174.767136),
                        new LatLng(-36.854121, 174.766355)));
        wzBuilding.setFillColor(0xffffd700);
        wzBuilding.setStrokeWidth(strokeWidth);
        wzBuilding.setTag("AUT WZ Building");
        mMap.addMarker(new MarkerOptions().position(poiMarker.getWzBuildingCenter()).icon(BitmapDescriptorFactory.fromResource(R.mipmap.wz)).flat(false));
    }
}
