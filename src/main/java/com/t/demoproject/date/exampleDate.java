package com.t.demoproject.date;

import java.time.*;

public class exampleDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
        LocalTime time = LocalTime.now();
        System.out.println(time.toString());


        LocalDate date1 = LocalDate.of(2019, Month.SEPTEMBER, 10);
        System.out.println(date1.toString());
        LocalDate date2 = LocalDate.ofYearDay(2019, 365);
        System.out.println(date2.toString());

        LocalTime time1 = LocalTime.of(10, 10, 10);
        System.out.println(time1.toString());


        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);

    }

}
