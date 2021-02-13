package javer.codewars.sixkyu;

/*The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?

Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.*/

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {

        int value25 = 0;
        int value50 = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                value25++;
            } else if (peopleInLine[i] == 50 && value25 > 0) {
                value50++;
                value25--;
            } else if (peopleInLine[i] == 100) {
                if (value50 > 0 && value25 > 0) {
                    value25--;
                    value50--;
                } else if (value25 >= 3) {
                    value25 -= 3;
                } else {
                    return "NO";
                }
            } else {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(Tickets(new int[]{25, 25, 25, 25, 50, 100, 50}));
    }
}
