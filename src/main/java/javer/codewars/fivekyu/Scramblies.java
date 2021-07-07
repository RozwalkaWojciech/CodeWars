package javer.codewars.fivekyu;

import static java.lang.System.out;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {

        for (String s : str2.split("")) {
            if (!str1.contains(s)) {
                return false;
            }
            str1 = str1.replaceFirst(s, "");
        }
        return true;
    }

    public static void main(String[] args) {
        out.println(scramble("rkqodlww", "world"));
        out.println(scramble("rkqodl", "world"));
    }
}
