package javer.codewars.fivekyu;

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
        System.out.println(scramble("rkqodlww", "world"));
        System.out.println(scramble("rkqodl", "world"));
    }
}
