package javer.codewars.fivekyu;

import static java.lang.System.out;

public class NumberOfTrailingZerosOfN {

    public static int zeros(int n) {
        var count = 0;
        while (n > 4) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }

    public static long factorialUsingForLoop(int n) {
        var fact = 1;
        for (var i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        for (var i = 1; i < 22; i++) {
            out.println(i + ". " + factorialUsingForLoop(i));
        }
    }
}
