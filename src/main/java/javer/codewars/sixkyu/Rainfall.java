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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Rainfall {
    public static double mean(String town, String strng) {
        if (town == null || strng == null) {
            return -0d;
        }
        double[] townArr = getTownArr(town, strng);
        if (townArr.length == 0) {
            return -1d;
        }
        return stream(townArr)
                .average()
                .getAsDouble();
    }

    public static double variance(String town, String strng) {
        if (town == null || strng == null) {
            return -0d;
        }
        double[] townArr = getTownArr(town, strng);
        if (townArr.length == 0) {
            return -1d;
        }
        return stream(townArr)
                .map(o -> (o - mean(town, strng)) * (o - mean(town, strng)))
                .sum() / townArr.length;
    }

    private static double[] getTownArr(String town, String strng) {
        var collect = stream(strng.split("\n"))
                .filter(s -> s.startsWith(town))
                .map(s -> s.replace(",", " "))
                .collect(joining());

        List<Double> doubleList;
        try (var sc = new Scanner(collect)) {
            doubleList = new ArrayList<>();
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    doubleList.add(sc.nextDouble());
                } else {
                    sc.next();
                }
            }
        }

        double[] doubleArr = new double[doubleList.size()];
        for (var i = 0; i < doubleList.size(); i++) {
            doubleArr[i] = doubleList.get(i);
        }
        return doubleArr;
    }

    static double mean2(String town, String strng) {
        return stream2(town, strng).average().orElse(-1);
    }

    static double variance2(String town, String strng) {
        return stream2(town, strng).map(m -> Math.pow(m - mean(town, strng), 2)).average().orElse(-1);
    }

    private static DoubleStream stream2(String town, String data) {
        return Stream.of(data.split("\n")).filter(s -> s.startsWith(town + ":"))
                .flatMapToDouble(s -> Stream.of(s.replaceAll("[^\\d.]", " ").trim().split("\\s+")).mapToDouble(Double::parseDouble));
    }
}
