package com.aut.sdp2018.autuniapp;

public class BusTime
{
    private String departHrs;
    private String departMins;
    private String arriveHrs;
    private String arriveMins;
    private boolean due;
    private String timeRemaining;


    public BusTime()
    {
        departHrs = "-1";
        departMins = "-1";
        arriveHrs = "-1";
        arriveHrs = "-1";
        arriveMins = "-1";
        due = false;
        timeRemaining = "Error";
    }

    public BusTime(String departHrs,String departMins,String arriveHrs, String arriveMins)
    {
        this.departHrs = departHrs;
        this.departMins = departMins;
        this.arriveHrs = arriveHrs;
        this.arriveMins = arriveMins;


        due = false;
        timeRemaining = "   ";
    }

    @Override
    public String toString()
    {
        return (departHrs+":"+departMins+"          "+arriveHrs+":"+arriveMins+"          "+timeRemaining);
    }

    public int departHrs()
    {
        return Integer.parseInt(departHrs);
    }

    public int departMins()
    {
        return Integer.parseInt(departMins);
    }

    public void updateDue(int time)
    {
        if(time == 0)
        {
            timeRemaining = "*";
        }
        else if (time > 0 && time < 61)
        {

            timeRemaining = ""+time;
        }
        else timeRemaining = "";

    }
}
