package javer.codewars.sixkyu;

/*
dataand data1 are two strings with rainfall records of a few cities for months from January to December.
The records of towns are separated by \n.
The name of each town is followed by :.
data and towns can be seen in "Your Test Cases:".

Task:
function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R and Julia this function is called avg).
function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
Examples:
mean("London", data), 51.19(9999999999996)
variance("London", data), 57.42(833333333374)
Notes:
if functions mean or variance have as parameter town a city which has no records return -1 or -1.0 (depending on the language)
Don't truncate or round: the tests will pass if abs(your_result - test_result) <= 1e-2 or abs((your_result - test_result) / test_result) <= 1e-6 depending on the language.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Rainfall {
    public static double mean(String town, String strng) {

        String collect = Arrays.stream(strng.split("\n"))
                .filter(s -> s.startsWith(town))
                .collect(Collectors.joining());

        System.out.println(collect);

        List<Double> collect2 = Arrays.stream(strng.split("\n"))
                .filter(s -> s.startsWith(town))
                .map(s -> s.replace(",", " "))
                .map(s -> new Scanner(System.in).nextDouble())
                .collect(Collectors.toList());

        System.out.println(collect2);

        System.out.println(collect2);
//                .mapToDouble(s1 -> Double.parseDouble(s1.replace(",", " ")))
//                .average()
//                .getAsDouble();

        String[] lines = strng.split("\n");
        String line = null;
        for (String tempLine : lines) {
            if (tempLine.startsWith(town)) {
                line = tempLine;
                break;
            }
        }
        System.out.println(line);

        return 0.0;
    }

    public static double variance(String town, String strng) {
        return 0.0;
    }


    public static void main(String[] args) {
        mean("Paris", "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
                "\n" +
                "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9" +
                "\n" +
                "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7");
    }
}
