package com.aut.sdp2018.autuniapp;

public class BusTime
{
    private int departHrs;
    private int departMins;
    private int arriveHrs;
    private int arriveMins;
    private boolean due;
    private String timeRemaining;


    public BusTime()
    {
        departHrs = -1;
        departMins = -1;
        arriveHrs = -1;
        arriveHrs = -1;
        arriveMins = -1;
        due = false;
        timeRemaining = "Error";
    }

    public BusTime(int departHrs,int departMins,int arriveHrs, int arriveMins)
    {
        this.departHrs = departHrs;
        this.departMins = departMins;
        this.arriveHrs = arriveHrs;
        this.arriveMins = arriveMins;
        due = false;
        timeRemaining = "??";
    }

    @Override
    public String toString()
    {
        return (departHrs+":"+departMins+"     "+arriveHrs+":"+arriveMins+"     "+timeRemaining);
    }
}
