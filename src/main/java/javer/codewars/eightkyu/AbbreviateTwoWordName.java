package javer.codewars.eightkyu;

public class AbbreviateTwoWordName {

    public static String abbrevName(String name) {
        String[] divide = name.split(" ");
        return divide[0].toUpperCase().charAt(0) + "." + divide[1].toUpperCase().charAt(0);
    }

}
