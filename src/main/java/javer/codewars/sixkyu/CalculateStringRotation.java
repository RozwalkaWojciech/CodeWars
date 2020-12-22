package javer.codewars.sixkyu;

public class CalculateStringRotation {

    public static int shiftedDiff(String first, String second) {

        if (first.length() != second.length()) {
            return -1;
        }
        return (second + second).indexOf(first);
    }
}
