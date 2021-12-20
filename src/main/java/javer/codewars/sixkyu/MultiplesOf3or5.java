package javer.codewars.sixkyu;

import java.util.stream.IntStream;

public class MultiplesOf3or5 {

    public int solution(int number) {
        if (number < 0) {
            return -1;
        }
        var result = 0;
        for (var i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }

    //best way
    public int solution2(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
