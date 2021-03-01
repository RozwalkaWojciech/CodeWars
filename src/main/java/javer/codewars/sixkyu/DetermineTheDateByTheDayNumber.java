package javer.codewars.sixkyu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DetermineTheDateByTheDayNumber {

    public static String getDay(int day, boolean isLeap) {
        LocalDate date = isLeap ? LocalDate.ofYearDay(2020, day) : LocalDate.ofYearDay(2019, day);
        return date.getMonth().toString().charAt(0)
                + date.getMonth().toString().substring(1).toLowerCase()
                + ", " + date.getDayOfMonth();
    }

    public static String getDay2(int day, boolean isLeap) {
        return DateTimeFormatter.ofPattern("MMMM, d")
                .format(LocalDate.ofYearDay(isLeap ? 2020 : 2019, day));
    }
}