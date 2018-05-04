package com.aut.sdp2018.autuniapp;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class AUTPOIMarkers
{
    private ArrayList<LatLng> poiData = new ArrayList<>();
    private LatLng waBuildingCenter;
    private LatLng wbBuildingCenter;
    private LatLng wcBuildingCenter;
    private LatLng wdBuildingCenter;
    private LatLng weBuildingCenter;
    private LatLng wfBuildingCenter;
    private LatLng wgBuildingCenter;
    private LatLng whBuildingCenter;
    private LatLng wmBuildingCenter;
    private LatLng wnBuildingCenter;
    private LatLng woBuildingCenter;
    private LatLng wrBuildingCenter;
    private LatLng wtBuildingCenter;
    private LatLng wuBuildingCenter;
    private LatLng wwBuildingCenter;
    private LatLng wxBuildingCenter;
    private LatLng wyBuildingCenter;
    private LatLng wzBuildingCenter;

    //Creates the POI CoOrds and then calls the createPOI function
    public AUTPOIMarkers()
    {
        waBuildingCenter = new LatLng(-36.853164, 174.766475);
        wbBuildingCenter = new LatLng(-36.853397, 174.767395);
        wcBuildingCenter = new LatLng(-36.853622, 174.767079);
        wdBuildingCenter = new LatLng(-36.853864, 174.767076);
        weBuildingCenter = new LatLng(-36.853709, 174.766353);
        wfBuildingCenter = new LatLng(-36.853578, 174.765195);
        wgBuildingCenter = new LatLng(-36.853033, 174.765766);
        whBuildingCenter = new LatLng(-36.852443, 174.766069);
        wmBuildingCenter = new LatLng(-36.854065, 174.766031);
        wnBuildingCenter = new LatLng(-36.854435, 174.766179);
        woBuildingCenter = new LatLng(-36.854107, 174.765458);
        wrBuildingCenter = new LatLng(-36.854993, 174.766917);
        wtBuildingCenter = new LatLng(-36.852460, 174.764596);
        wuBuildingCenter = new LatLng(-36.853804, 174.765260);
        wwBuildingCenter = new LatLng(-36.854537, 174.766958);
        wxBuildingCenter = new LatLng(-36.853030, 174.764211);
        wyBuildingCenter = new LatLng(-36.853434, 174.764295);
        wzBuildingCenter = new LatLng(-36.854069, 174.766795);
        createPOIs();
    }

    //Adds the POIS to an ArrayList for easier managing
    public void createPOIs()
    {
        poiData.add(waBuildingCenter);
        poiData.add(wbBuildingCenter);
        poiData.add(wcBuildingCenter);
        poiData.add(wdBuildingCenter);
        poiData.add(weBuildingCenter);
        poiData.add(wfBuildingCenter);
        poiData.add(wgBuildingCenter);
        poiData.add(whBuildingCenter);
        poiData.add(wmBuildingCenter);
        poiData.add(wnBuildingCenter);
        poiData.add(woBuildingCenter);
        poiData.add(wrBuildingCenter);
        poiData.add(wtBuildingCenter);
        poiData.add(wuBuildingCenter);
        poiData.add(wwBuildingCenter);
        poiData.add(wxBuildingCenter);
        poiData.add(wyBuildingCenter);
        poiData.add(wzBuildingCenter);
    }

    //Getter Methods for Either the individual POI or the Data Structure
    public ArrayList<LatLng> getPoiData(){
        return poiData;
    }

    public LatLng getWaBuildingCenter() {
        return waBuildingCenter;
    }

    public LatLng getWbBuildingCenter() {
        return wbBuildingCenter;
    }

    public LatLng getWcBuildingCenter() {
        return wcBuildingCenter;
    }

    public LatLng getWdBuildingCenter() {
        return wdBuildingCenter;
    }

    public LatLng getWeBuildingCenter() {
        return weBuildingCenter;
    }

    public LatLng getWfBuildingCenter() {
        return wfBuildingCenter;
    }

    public LatLng getWgBuildingCenter() {
        return wgBuildingCenter;
    }

    public LatLng getWhBuildingCenter() {
        return whBuildingCenter;
    }

    public LatLng getWmBuildingCenter() {
        return wmBuildingCenter;
    }

    public LatLng getWnBuildingCenter() {
        return wnBuildingCenter;
    }

    public LatLng getWoBuildingCenter() {
        return woBuildingCenter;
    }

    public LatLng getWrBuildingCenter() {
        return wrBuildingCenter;
    }

    public LatLng getWtBuildingCenter() {
        return wtBuildingCenter;
    }

    public LatLng getWuBuildingCenter() {
        return wuBuildingCenter;
    }

    public LatLng getWwBuildingCenter() {
        return wwBuildingCenter;
    }

    public LatLng getWxBuildingCenter() {
        return wxBuildingCenter;
    }

    public LatLng getWyBuildingCenter() {
        return wyBuildingCenter;
    }

    public LatLng getWzBuildingCenter() {
        return wzBuildingCenter;
    }
}
