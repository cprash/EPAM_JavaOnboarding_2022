package com.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate birthday=LocalDate.of(1991,12,2);
        Period period=Period.between(birthday,today);
        System.out.printf("Age is %d years %d months %d days",period.getYears(),period.getMonths(),period.getDays());
    }
}
