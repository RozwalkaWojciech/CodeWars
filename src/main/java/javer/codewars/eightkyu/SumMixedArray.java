package javer.codewars.eightkyu;

import java.util.List;

import static java.lang.Integer.parseInt;

/*
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
Assume input will be only of Integer o String type.
Return your answer as a number.
 */

public class SumMixedArray {

    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> parseInt(o.toString())).sum();
    }
}
