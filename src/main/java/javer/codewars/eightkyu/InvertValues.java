package javer.codewars.eightkyu;

import static java.util.Arrays.stream;

public class InvertValues {

    public static int[] invert(int[] array) {
        return stream(array)
                .map(operand -> operand * (-1))
                .toArray();
    }
}
