package javer.codewars.fourkyu;

/*
Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.
The function must accept a non-negative integer.
 If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
It is much easier to understand with an example:

TimeFormatter.formatDuration(62)   //returns "1 minute and 2 seconds"
TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"

For the purpose of this Kata, a year is 365 days and a day is 24 hours.
Note that spaces are important.
Detailed rules
The resulting expression is made of components like 4 seconds, 1 year, etc. In general, a positive integer and one of the valid units of time, separated by a space.
The unit of time is used in plural if the integer is greater than 1.
The components are separated by a comma and a space (", ").
Except the last component, which is separated by " and ", just like it would be written in English.
A more significant units of time will occur before than a least significant one. Therefore, 1 second and 1 year is not correct, but 1 year and 1 second is.
Different components have different unit of times. So there is not repeated units like in 5 seconds and 1 second.
A component will not appear at all if its value happens to be zero. Hence, 1 minute and 0 seconds is not valid, but it should be just 1 minute.
A unit of time must be used "as much as possible". It means that the function should not return 61 seconds, but 1 minute and 1 second instead.
 Formally, the duration specified by of a component must not be greater than any valid more significant unit of time.
 */

import java.util.LinkedList;
import java.util.Queue;

public class HumanReadableDurationFormat {

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int oneMinute = 60;
        int oneHour = 60 * oneMinute;
        int oneDay = 24 * oneHour;
        int oneYear = 365 * oneDay;

        Queue<String> queue = new LinkedList<>();

        int year = seconds / oneYear;
        if (year == 1) queue.add(year + " year");
        else if (year > 1) queue.add(year + " years");
        seconds = seconds - year * oneYear;

        int day = seconds / oneDay;
        if (day == 1) queue.add(day + " day");
        else if (day > 1) queue.add(day + " days");
        seconds = seconds - day * oneDay;

        int hour = seconds / oneHour;
        if (hour == 1) queue.add(hour + " hour");
        else if (hour > 1) queue.add(hour + " hours");
        seconds = seconds - hour * oneHour;

        int minute = seconds / oneMinute;
        if (minute == 1) queue.add(minute + " minute");
        else if (minute > 1) queue.add(minute + " minutes");
        seconds = seconds - minute * oneMinute;

        if (seconds == 1) queue.add(seconds + " second");
        else if (seconds > 1) queue.add(seconds + " seconds");

        var sb = new StringBuilder();

        while (!queue.isEmpty()) {
            String tmp = queue.poll();
            sb.append(tmp);
            if (queue.size() > 1) {
                sb.append(", ");
            } else if (queue.size() == 1) {
                sb.append(" and ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(3606));
    }
}

