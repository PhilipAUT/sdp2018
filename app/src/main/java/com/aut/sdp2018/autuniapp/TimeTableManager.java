package com.aut.sdp2018.autuniapp;

import java.util.ArrayList;
import java.util.Calendar;

public class TimeTableManager
{
    private ArrayList<BusTime> cityToSouth;
    private ArrayList<BusTime> cityToNorth;
    private ArrayList<BusTime> southToCity;
    private ArrayList<BusTime> northToCity;
    private Calendar currentTime;

    public TimeTableManager()
    {
        popualateCityToSouth();
        popualateCityToNorth();
        popualateSouthToCity();
        popualateNorthToCity();
        currentTime = Calendar.getInstance();
    }

    private void popualateCityToSouth()
    {
        cityToSouth = new ArrayList<>();
        cityToSouth.add(new BusTime("06","20","06","45"));
        cityToSouth.add(new BusTime("07","00","07","40"));
        cityToSouth.add(new BusTime("07","30","08","10"));
        cityToSouth.add(new BusTime("08","00","08","40"));
        cityToSouth.add(new BusTime("08","30","09","10"));
        cityToSouth.add(new BusTime("09","00","09","40"));
        cityToSouth.add(new BusTime("09","30","10","00"));
        cityToSouth.add(new BusTime("10","00","10","30"));
        cityToSouth.add(new BusTime("10","30","11","00"));
        cityToSouth.add(new BusTime("11","00","11","30"));
        cityToSouth.add(new BusTime("11","30","12","00"));
        cityToSouth.add(new BusTime("12","00","12","30"));
        cityToSouth.add(new BusTime("12","30","13","00"));
        cityToSouth.add(new BusTime("13","00","13","30"));
        cityToSouth.add(new BusTime("13","30","14","00"));
        cityToSouth.add(new BusTime("14","00","14","40"));
        cityToSouth.add(new BusTime("14","30","15","10"));
        cityToSouth.add(new BusTime("15","00","15","40"));
        cityToSouth.add(new BusTime("15","30","16","10"));
        cityToSouth.add(new BusTime("16","00","16","40"));
        cityToSouth.add(new BusTime("16","30","17","10"));
        cityToSouth.add(new BusTime("17","00","17","40"));
        cityToSouth.add(new BusTime("17","30","18","00"));
        cityToSouth.add(new BusTime("18","00","18","40"));
        cityToSouth.add(new BusTime("18","30","19","10"));
        cityToSouth.add(new BusTime("19","00","19","30"));
        cityToSouth.add(new BusTime("20","00","20","30"));
        cityToSouth.add(new BusTime("21","00","21","30"));
    }

    private void popualateCityToNorth()
    {
        cityToNorth = new ArrayList<>();
        cityToNorth.add(new BusTime("07","10","07","25"));
        cityToNorth.add(new BusTime("07","25","07","40"));
        cityToNorth.add(new BusTime("07","40","07","55"));
        cityToNorth.add(new BusTime("07","55","08","10"));
        cityToNorth.add(new BusTime("08","10","08","25"));
        cityToNorth.add(new BusTime("08","25","08","40"));
        cityToNorth.add(new BusTime("08","40","08","55"));
        cityToNorth.add(new BusTime("08","55","09","10"));
        cityToNorth.add(new BusTime("09","10","09","25"));
        cityToNorth.add(new BusTime("09","25","09","40"));
        cityToNorth.add(new BusTime("09","40","09","55"));
        cityToNorth.add(new BusTime("09","50","10","05"));
        cityToNorth.add(new BusTime("10","10","10","25"));
        cityToNorth.add(new BusTime("10","30","10","45"));
        cityToNorth.add(new BusTime("10","50","11","05"));
        cityToNorth.add(new BusTime("11","10","11","25"));
        cityToNorth.add(new BusTime("11","30","11","45"));
        cityToNorth.add(new BusTime("11","50","12","05"));
        cityToNorth.add(new BusTime("12","10","12","25"));
        cityToNorth.add(new BusTime("12","30","12","50"));
        cityToNorth.add(new BusTime("12","50","13","05"));
        cityToNorth.add(new BusTime("13","10","13","25"));
        cityToNorth.add(new BusTime("13","30","13","45"));
        cityToNorth.add(new BusTime("13","50","14","05"));
        cityToNorth.add(new BusTime("14","10","14","25"));
        cityToNorth.add(new BusTime("14","30","14","45"));
        cityToNorth.add(new BusTime("14","50","15","05"));
        cityToNorth.add(new BusTime("15","05","15","20"));
        cityToNorth.add(new BusTime("15","20","15","35"));
        cityToNorth.add(new BusTime("15","35","15","50"));
        cityToNorth.add(new BusTime("15","50","16","05"));
        cityToNorth.add(new BusTime("16","05","16","20"));
        cityToNorth.add(new BusTime("16","20","16","35"));
        cityToNorth.add(new BusTime("16","35","16","50"));
        cityToNorth.add(new BusTime("16","50","17","05"));
        cityToNorth.add(new BusTime("17","05","17","20"));
        cityToNorth.add(new BusTime("17","20","17","35"));
        cityToNorth.add(new BusTime("17","40","17","55"));
        cityToNorth.add(new BusTime("18","30","18","45"));
        cityToNorth.add(new BusTime("19","30","19","45"));
        cityToNorth.add(new BusTime("20","30","20","45"));
        cityToNorth.add(new BusTime("21","10","21","25"));


    }
    private void popualateSouthToCity()
    {
        southToCity = new ArrayList<>();
        southToCity.add(new BusTime("06","30","07","00"));
        southToCity.add(new BusTime("06","45","07","25"));
        southToCity.add(new BusTime("07","15","07","55"));
        southToCity.add(new BusTime("07","45","08","25"));
        southToCity.add(new BusTime("08","15","08","55"));
        southToCity.add(new BusTime("08","45","09","25"));
        southToCity.add(new BusTime("09","15","09","55"));
        southToCity.add(new BusTime("09","45","10","15"));
        southToCity.add(new BusTime("10","15","10","45"));
        southToCity.add(new BusTime("10","45","11","15"));
        southToCity.add(new BusTime("11","15","11","45"));
        southToCity.add(new BusTime("11","45","12","15"));
        southToCity.add(new BusTime("12","15","12","45"));
        southToCity.add(new BusTime("12","45","13","15"));
        southToCity.add(new BusTime("13","15","13","45"));
        southToCity.add(new BusTime("13","45","14","15"));
        southToCity.add(new BusTime("14","15","14","45"));
        southToCity.add(new BusTime("14","45","15","25"));
        southToCity.add(new BusTime("15","15","15","55"));
        southToCity.add(new BusTime("15","45","16","25"));
        southToCity.add(new BusTime("16","15","16","55"));
        southToCity.add(new BusTime("16","45","17","25"));
        southToCity.add(new BusTime("17","15","17","55"));
        southToCity.add(new BusTime("17","45","18","25"));
        southToCity.add(new BusTime("18","45","19","15"));
        southToCity.add(new BusTime("19","15","19","45"));
        southToCity.add(new BusTime("20","15","20","45"));
    }
    private void popualateNorthToCity()
    {
        northToCity = new ArrayList<>();
        northToCity.add(new BusTime("06","40","06","55"));
        northToCity.add(new BusTime("07","00","07","20"));
        northToCity.add(new BusTime("07","15","07","35"));
        northToCity.add(new BusTime("07","30","07","50"));
        northToCity.add(new BusTime("07","45","08","05"));
        northToCity.add(new BusTime("08","00","08","20"));
        northToCity.add(new BusTime("08","15","08","35"));
        northToCity.add(new BusTime("08","30","08","50"));
        northToCity.add(new BusTime("08","45","09","05"));
        northToCity.add(new BusTime("09","00","09","20"));
        northToCity.add(new BusTime("09","15","09","30"));
        northToCity.add(new BusTime("09","30","09","45"));
        northToCity.add(new BusTime("09","50","10","05"));
        northToCity.add(new BusTime("10","10","10","25"));
        northToCity.add(new BusTime("10","30","10","45"));
        northToCity.add(new BusTime("10","50","11","05"));
        northToCity.add(new BusTime("11","10","11","25"));
        northToCity.add(new BusTime("11","30","11","45"));
        northToCity.add(new BusTime("11","50","12","05"));
        northToCity.add(new BusTime("12","10","12","25"));
        northToCity.add(new BusTime("12","30","12","45"));
        northToCity.add(new BusTime("12","50","13","05"));
        northToCity.add(new BusTime("13","10","13","25"));
        northToCity.add(new BusTime("13","30","13","45"));
        northToCity.add(new BusTime("13","50","14","05"));
        northToCity.add(new BusTime("14","10","14","25"));
        northToCity.add(new BusTime("14","20","14","45"));
        northToCity.add(new BusTime("14","45","15","00"));
        northToCity.add(new BusTime("15","00","15","15"));
        northToCity.add(new BusTime("15","15","15","30"));
        northToCity.add(new BusTime("15","30","15","45"));
        northToCity.add(new BusTime("15","45","16","00"));
        northToCity.add(new BusTime("16","00","16","15"));
        northToCity.add(new BusTime("16","15","16","30"));
        northToCity.add(new BusTime("16","30","16","45"));
        northToCity.add(new BusTime("16","45","17","00"));
        northToCity.add(new BusTime("17","00","17","15"));
        northToCity.add(new BusTime("17","20","17","35"));
        northToCity.add(new BusTime("18","10","18","25"));
        northToCity.add(new BusTime("19","00","19","20"));
        northToCity.add(new BusTime("20","00","20","20"));
        northToCity.add(new BusTime("20","50","21","05"));
    }

    public String testTimes(int index, int timetable)
    {
        if(timetable == 1)
        {

            return cityToSouth.get(index).toString();
        }
        if(timetable == 2)
        {
            return cityToNorth.get(index).toString();
        }
        if(timetable == 3)
        {
            return southToCity.get(index).toString();
        }
        if(timetable == 4)
        {
            return northToCity.get(index).toString();
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
            return cityToSouth.size();
        }
        if(timetable == 2)
        {
            return cityToNorth.size();
        }
        if(timetable == 3)
        {
            return southToCity.size();
        }
        if(timetable == 4)
        {
            return northToCity.size();
        }
        else
        {
            return 0;
        }

    }

    private int compareTime(int hrs, int mins)
    {

        if(hrs < currentTime.get(Calendar.HOUR_OF_DAY))
        {
            return -1;
        }

        else if(hrs == currentTime.get(Calendar.HOUR_OF_DAY))
        {
            if(mins == currentTime.get(Calendar.MINUTE))
            {
                return  0;
            }

            else if (mins < currentTime.get(Calendar.MINUTE))
            {
                return -1;
            }
            else return 1;
        }

        else return 1;
    }

    public void updateTimes()
    {
        for(int i = cityToSouth.size() -1; i >= 0; i--)
        {
            if(compareTime(cityToSouth.get(i).departHrs(),cityToSouth.get(i).departMins()) == -1)
            {
                cityToSouth.remove(i);
            }
            System.out.println(currentTime.get(Calendar.HOUR_OF_DAY) - cityToSouth.get(i).departHrs());
            if(currentTime.get(Calendar.HOUR_OF_DAY) - cityToSouth.get(i).departHrs()==0)
            {

                cityToSouth.get(i).updateDue(cityToSouth.get(i).departMins()-currentTime.get(Calendar.MINUTE));
            }

        }

        for(int i = southToCity.size() -1; i >= 0; i--)
        {
            if(compareTime(southToCity.get(i).departHrs(),southToCity.get(i).departMins()) == -1)
            {
                southToCity.remove(i);
            }

            if(currentTime.get(Calendar.HOUR_OF_DAY) - southToCity.get(i).departHrs()==0)
            {

                southToCity.get(i).updateDue(southToCity.get(i).departMins()-currentTime.get(Calendar.MINUTE));
            }
        }

        for(int i = northToCity.size() -1; i >= 0; i--)
        {
            if(compareTime(northToCity.get(i).departHrs(),northToCity.get(i).departMins()) == -1)
            {
                northToCity.remove(i);
            }

            if(currentTime.get(Calendar.HOUR_OF_DAY) - northToCity.get(i).departHrs()==0)
            {

                northToCity.get(i).updateDue(northToCity.get(i).departMins()-currentTime.get(Calendar.MINUTE));
            }
        }

        for(int i = cityToNorth.size() -1; i >= 0; i--)
        {
            if(compareTime(cityToNorth.get(i).departHrs(),cityToNorth.get(i).departMins()) == -1)
            {
                cityToNorth.remove(i);
            }

            if(currentTime.get(Calendar.HOUR_OF_DAY) - cityToNorth.get(i).departHrs()==0)
            {

                cityToNorth.get(i).updateDue(cityToNorth.get(i).departMins()-currentTime.get(Calendar.MINUTE));
            }
        }
    }
}
