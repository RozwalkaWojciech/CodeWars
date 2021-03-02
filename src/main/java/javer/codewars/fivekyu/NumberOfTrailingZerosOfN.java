package javer.codewars.fivekyu;

public class NumberOfTrailingZerosOfN {

    public static int zeros(int n) {
        int count = 0;
        while (n > 4) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }

    public static long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 22; i++) {
            System.out.println(i + ". " + factorialUsingForLoop(i));
        }
    }
}
