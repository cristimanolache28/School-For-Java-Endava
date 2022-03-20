package com.endava.part1.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateMain {
    public static void main(String[] args) {

        // Check if we are in a certain period of the year
        LocalDate date1 = LocalDate.of(2022, 2, 1);
        LocalDate date2 = LocalDate.of(2022, 3, 1);
        System.out.println(LocalDate.now().isAfter(date1) && LocalDate.now().isBefore(date2));

        // Get the local time without nanoseconds
        LocalTime time = LocalTime.now().withNano(0);
        System.out.println(time);

        // Get the local data time from 20 hours ago
        LocalDateTime localDateTime = LocalDateTime.now().minusHours(20);
        System.out.println(localDateTime);

        //Get the instant value with 2 hours ago
        Duration duration = Duration.between(Instant.now(), Instant.now().plus(2, ChronoUnit.HOURS));
        System.out.println(duration);

        // Get the countdown in hours until the new year
        long hours = Duration.between(Instant.now(),
                LocalDateTime.of(LocalDate.of(2022, 12, 31), LocalTime.MAX).toInstant(ZoneOffset.UTC)).toHours();
        System.out.println(hours);

    }
}
