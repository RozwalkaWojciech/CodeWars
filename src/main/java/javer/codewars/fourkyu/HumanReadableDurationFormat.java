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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class HumanReadableDurationFormat {

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        var oneMinute = 60;
        var oneHour = 60 * oneMinute;
        var oneDay = 24 * oneHour;
        var oneYear = 365 * oneDay;

        Queue<String> queue = new LinkedList<>();

        var year = seconds / oneYear;
        if (year == 1) queue.add(year + " year");
        else if (year > 1) queue.add(year + " years");
        seconds = seconds - year * oneYear;

        var day = seconds / oneDay;
        if (day == 1) queue.add(day + " day");
        else if (day > 1) queue.add(day + " days");
        seconds = seconds - day * oneDay;

        var hour = seconds / oneHour;
        if (hour == 1) queue.add(hour + " hour");
        else if (hour > 1) queue.add(hour + " hours");
        seconds = seconds - hour * oneHour;

        var minute = seconds / oneMinute;
        if (minute == 1) queue.add(minute + " minute");
        else if (minute > 1) queue.add(minute + " minutes");
        seconds = seconds - minute * oneMinute;

        if (seconds == 1) queue.add(seconds + " second");
        else if (seconds > 1) queue.add(seconds + " seconds");

        var sb = new StringBuilder();

        while (!queue.isEmpty()) {
            var tmp = queue.poll();
            sb.append(tmp);
            if (queue.size() > 1) {
                sb.append(", ");
            } else if (queue.size() == 1) {
                sb.append(" and ");
            }
        }
        return sb.toString();
    }

    public static String formatDuration2(int seconds) {
        return seconds == 0 ? "now" :
                Arrays.stream(
                                new String[]{
                                        formatTime("year", (seconds / 31536000)),
                                        formatTime("day", (seconds / 86400) % 365),
                                        formatTime("hour", (seconds / 3600) % 24),
                                        formatTime("minute", (seconds / 60) % 60),
                                        formatTime("second", (seconds % 3600) % 60)})
                        .filter(e -> !e.equals(""))
                        .collect(Collectors.joining(", "))
                        .replaceAll(", (?!.+,)", " and ");
    }

    public static String formatTime(String s, int time) {
        return time == 0 ? "" : time + " " + s + (time == 1 ? "" : "s");
    }

    public static String formatDuration3(int seconds) {
        var res = "";
        int[] units = new int[]{31536000, 86400, 3600, 60, 1};
        String[] labels = new String[]{"year", "day", "hour", "minute", "second"};

        if (seconds == 0) return "now";

        for (var i = 0; i < 5; i++) {
            if (seconds >= units[i]) {
                var q = seconds / units[i];
                seconds = seconds % units[i];
                res += (res.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                        + q + " " + labels[i] + (q > 1 ? "s" : "");
            }
        }
        return res;
    }

    public static String formatDuration4(int seconds) {
        return seconds == 0 ? "now" :
                (
                        java.time.Duration.ofSeconds(seconds).toDays() / 365 + " years, " +
                                java.time.Duration.ofSeconds(seconds).toDays() % 365 + " days, " +
                                java.time.Duration.ofSeconds(seconds).toHours() % 24 + " hours, " +
                                java.time.Duration.ofSeconds(seconds).toMinutes() % 60 + " minutes, " +
                                seconds % 60 + " seconds"
                )
                        .replaceAll("\\b0 \\w+\\, \\b", "")
                        .replaceAll("\\, 0 \\w+$", "")
                        .replaceAll("\\b1 (\\w+)s\\b", "1 $1")
                        .replaceFirst("(\\, (\\d+) (\\w+))$", " and $2 $3")
                ;
    }

    public static String formatDuration5(int seconds) {
        if (seconds == 0) return "now";
        int[] maxUnit = {60, 60, 24, 365, 1000};
        String[] units = {"second", "minute", "hour", "day", "year"};
        var result = "";
        var total = 0;
        for (var i = 0; i < maxUnit.length; i++) {
            var val = seconds % maxUnit[i];
            seconds /= maxUnit[i];
            if (val > 0) {
                var unit = val > 1 ? units[i] + "s" : units[i];
                var newResult = String.format("%d %s", val, unit);
                switch (total) {
                    case 0:
                        result = newResult;
                        break;
                    case 1:
                        result = newResult + " and " + result;
                        break;
                    default:
                        result = newResult + ", " + result;
                }
                total++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        out.println(formatDuration4(3662));
    }
}

