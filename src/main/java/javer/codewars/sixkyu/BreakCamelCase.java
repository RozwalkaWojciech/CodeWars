package javer.codewars.sixkyu;

/*Complete the solution so that the function will break up camel casing, using a space between words.*/

import static java.lang.Character.isUpperCase;

public class BreakCamelCase {

    public static String camelCase(String input) {
        var sb = new StringBuilder();
        for (var ch : input.toCharArray()) {
            if (isUpperCase(ch)) {
                sb.append(" ").append(ch);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
//      return input.replaceAll("([A-Z])", " $1");
    }
}
