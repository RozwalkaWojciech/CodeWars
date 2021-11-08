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

import static java.lang.String.join;
import static java.util.stream.Collectors.joining;

public class Meeting {

    public static String meeting(String s) {
        var people = new TreeMap<String, List<String>>();
        for (var person : s.split(";")) {
            String[] fullName = person.split(":");
            var firstName = fullName[1].toUpperCase();
            var lastName = fullName[0].toUpperCase();

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
        Set<String> fullNameSet = people.keySet();

        var sb = new StringBuilder();

        for (String secondName : fullNameSet) {
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
                .collect(joining(""));
    }

    public static String meeting3(String s) {
        String[] guests = s.split(";");
        for (var i = 0; i < guests.length; i++) {
            var index = guests[i].indexOf(":");
            guests[i] = "(" + guests[i].substring(index + 1).toUpperCase() + ", " + guests[i].substring(0, index).toUpperCase() + ")";
        }
        Arrays.sort(guests);
        return join("", guests);
    }

    public static void main(String[] args) {
        meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill");
    }
}
