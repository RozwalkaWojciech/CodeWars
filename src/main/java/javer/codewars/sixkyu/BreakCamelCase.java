package javer.codewars.sixkyu;

/*Complete the solution so that the function will break up camel casing, using a space between words.*/

public class BreakCamelCase {
    public static String camelCase(String input) {

        var sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(" ").append(c);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
//      return input.replaceAll("([A-Z])", " $1");
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelFs"));
    }
}
