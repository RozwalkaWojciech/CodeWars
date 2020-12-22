package javer.codewars.eightkyu;

import java.util.Arrays;

public class InvertValues {

    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(operand -> operand * (-1)).toArray();
    }
}
