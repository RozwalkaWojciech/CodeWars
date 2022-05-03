package javer.codewars.sevenkyu;

/*
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

Examples:
strEndsWith('abc', 'bc') -- returns true
strEndsWith('abc', 'd') -- returns false
 */

public class StringEndsWith {

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}


