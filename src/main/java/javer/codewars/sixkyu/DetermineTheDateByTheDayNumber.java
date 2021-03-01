package javer.codewars.sixkyu;

import java.time.LocalDate;

public class DetermineTheDateByTheDayNumber {

    public static String getDay(int day, boolean isLeap) {
        LocalDate date = isLeap ? LocalDate.ofYearDay(2020, day) : LocalDate.ofYearDay(2019, day);
        return date.getMonth().toString().charAt(0)
                + date.getMonth().toString().substring(1).toLowerCase()
                + ", " + date.getDayOfMonth();
    }
}