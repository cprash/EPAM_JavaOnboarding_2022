package com.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;


public class DateAndTimeAPITest {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();
        System.out.println(day+"/"+month+"/"+year);
        int hour=time.getHour();
        int min=time.getMinute();
        int sec= time.getSecond();
        System.out.println("Hour "+hour+" Minutes "+min+" Seconds "+sec);
        ZoneId zone=ZoneId.systemDefault();
        System.out.println(zone);

    }
}
