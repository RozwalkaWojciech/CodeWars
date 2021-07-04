package javer.codewars.sixkyu;

/*
Generate a valid randomly generated rgb color string. Assume all of them have 6 digits always.

Valid Output
#ffffff
#25a403
#000001

Non-Valid Output
#fff
#aaa
#zzzzz
cafebabe
#a567567676576756A7
 */

import java.util.Random;

public class HTMLDynamicColorStringGeneration {

    public static String generateColor(Random r) {
        return String.format("#%06x", r.nextInt(0xffffff + 1));
    }

    public static void main(String[] args) {
        System.out.println(generateColor(new Random()));
    }
}
