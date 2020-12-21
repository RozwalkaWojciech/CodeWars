package javer.codewars.eightkyu;

public class AbbreviateTwoWordName {

    public static String abbrevName(String name) {
        String[] divide = name.split(" ");
        return divide[0].toUpperCase().charAt(0) + "." + divide[1].toUpperCase().charAt(0);
    }

    public static String abbrevName2(String name) {
        String[] fullName = name.split(" ");
        String names = fullName[0].toUpperCase();
        String surname = fullName[1].toUpperCase();
        return names.charAt(0) + "." + surname.charAt(0);
    }

}
