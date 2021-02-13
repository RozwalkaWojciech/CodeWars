package javer.codewars.sixkyu;

public class MultiplesOf3or5 {
    public int solution(int number) {

        if (number < 0) {
            return -1;
        }

        int result = 0;

        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
