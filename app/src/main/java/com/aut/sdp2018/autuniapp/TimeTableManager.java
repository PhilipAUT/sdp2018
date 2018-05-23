package com.aut.sdp2018.autuniapp;

import java.util.ArrayList;

public class TimeTableManager
{
    private ArrayList<BusTime> testBusTimes;
    private ArrayList<BusTime> testBusTimes2;

    public TimeTableManager()
    {
        testBusTimes = new ArrayList<>();
        testBusTimes.add(new BusTime(9,25,10,25));
        testBusTimes.add(new BusTime(10,25,11,25));
        testBusTimes.add(new BusTime(11,25,12,25));
        testBusTimes.add(new BusTime(12,25,13,25));
        testBusTimes.add(new BusTime(13,25,14,25));
        testBusTimes.add(new BusTime(14,25,15,25));
        testBusTimes.add(new BusTime(15,25,16,25));
        testBusTimes.add(new BusTime(16,25,17,25));
        testBusTimes.add(new BusTime(17,25,18,25));
        testBusTimes.add(new BusTime(18,25,19,25));

        testBusTimes2 = new ArrayList<>();
        testBusTimes2.add(new BusTime(6,10,9,25));
        testBusTimes2.add(new BusTime(14,25,15,15));
        testBusTimes2.add(new BusTime(18,55,19,25));
        testBusTimes2.add(new BusTime(22,25,23,45));

    }

    public String testTimes(int index, int timetable)
    {
        if(timetable == 1)
        {
            return testBusTimes.get(index).toString();
        }
        if(timetable == 2)
        {
            return testBusTimes2.get(index).toString();
        }
        else
        {
            return "not a timetable";
        }

    }

    public int testSize(int timetable)
    {
        if(timetable == 1)
        {
            return testBusTimes.size();
        }
        if(timetable == 2)
        {
            return testBusTimes2.size();
        }
        else
        {
            return 0;
        }

    }
}
