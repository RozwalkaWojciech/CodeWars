package javer.codewars.sixkyu;

/*You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:
likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
*/

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {

        if (names.length == 1) {
            return names[0] + " likes this";
        }
        if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        }
        if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        if (names.length > 3) {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
        return "no one likes this";
    }

    public static String whoLikesIt2(String... nms) {
        switch (nms.length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", nms[0]);
            case 2:
                return String.format("%s and %s like this", nms[0], nms[1]);
            case 3:
                return String.format("%s, %s and %s like this", nms[0], nms[1], nms[2]);
            default:
                return String.format("%s, %s and %d others like this", nms[0], nms[1], nms.length - 2);
        }
    }
    public static String whoLikesIt3(String... names) {
        //Do your magic here
        return names.length == 0 ? "no one likes this" : names.length == 1 ? names[0] + " likes this" : names.length == 2 ? names[0] + " and " + names[1] + " like this" : names.length == 3 ? names[0] + ", " + names[1] + " and " + names[2] + " like this" : names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

    }
}
