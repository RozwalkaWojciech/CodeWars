package javer.codewars.sixkyu;

import static java.time.LocalDate.ofYearDay;
import static java.time.format.DateTimeFormatter.ofPattern;

public class DetermineTheDateByTheDayNumber {

    public static String getDay(int day, boolean isLeap) {
        var date = isLeap ? ofYearDay(2020, day) : ofYearDay(2019, day);
        return date.getMonth().toString().charAt(0)
                + date.getMonth().toString().substring(1).toLowerCase()
                + ", " + date.getDayOfMonth();
    }

    public static String getDay2(int day, boolean isLeap) {
        return ofPattern("MMMM, d")
                .format(ofYearDay(isLeap ? 2020 : 2019, day));
    }
}