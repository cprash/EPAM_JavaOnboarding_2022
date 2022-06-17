package com.HomeTasks.DateAndTIme;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q1toQ3 {
    public static void main(String[] args) {
        Predicate<LocalDate> pred=(date)->LocalDate.now().minusDays(1)==date;
        System.out.println("Given date is yesterday's date : "+pred.test(LocalDate.of(2022, 5, 26)));

        Supplier<LocalDate> nextThursday=()->LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("NEXT THURSDAY:"+nextThursday.get());
    }
}
