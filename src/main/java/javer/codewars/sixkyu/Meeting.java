package javer.codewars.sixkyu;

/*
John has invited some friends. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that

makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Meeting {

    public static String meeting(String s) {

        TreeMap<String, List<String>> people = new TreeMap<>();
        String[] persons = s.split(";");
        var sb = new StringBuilder();

        for (String person : persons) {
            String[] fullName = person.split(":");
            String firstName = fullName[1].toUpperCase();
            String lastName = fullName[0].toUpperCase();

            if (!people.containsKey(firstName)) {
                List<String> names = new ArrayList<>();
                names.add(lastName);
                people.put(firstName, names);
            } else if (people.containsKey(firstName)) {
                List<String> names = people.get(firstName);
                names.add(lastName);
                Collections.sort(names);
                people.put(firstName, names);
            }
        }
        Set<String> lastNames = people.keySet();

        for (String secondName : lastNames) {
            List<String> names = people.get(secondName);
            for (String name : names) {
                sb.append("(").append(secondName.toUpperCase()).append(", ").append(name.toUpperCase()).append(")");
            }
        }
        return sb.toString();
    }

    public static String meeting2(String s) {
        return Arrays.stream(s.toUpperCase().split(";"))
                .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                .sorted()
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill");
    }
}
