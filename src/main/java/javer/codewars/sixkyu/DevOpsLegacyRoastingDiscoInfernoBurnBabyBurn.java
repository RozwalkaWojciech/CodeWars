package javer.codewars.sixkyu;

/*
DevOps legacy roasting!
Save the business from technological purgatory.
Convert IT to DevOps, modernize application workloads, take it all to the Cloud…….

You will receive a string of workloads represented by words….some legacy and some modern mixed in with complaints from the business….
Your job is to burn the legacy in a disco inferno and count the value of each roasting and the number of complaints resolved.

Complaints (in this format, case-insensitive) -> "slow!", "expensive!", "manual!", "down!", "hostage!", "security!"
The value is based on real or perceived pain by the business and the expense of keeping it all running.

Pull the values from the list below...

1970s Disco Fever Architecture………
Sort of like a design from Saturday night Fever….

            (  .      )
                )           (              )
                      .  '   .   '  .  '  .
             (    , )       (.   )  (   ',    )
              .' ) ( . )    ,  ( ,     )   ( .
           ). , ( .   (  ) ( , ')  .' (  ,    )
          (_,) . ), ) _) _,')  (, ) '. )  ,. (' )
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            Burn Baby Burn in a Disco Inferno

Legacy is identified by the following keywords:

1000 points - COBOL of any kind whatsoever
              keyword => "COBOL"
500 points  - non-object oriented architecture
              keyword => "nonobject"
500 points  - monolithic architecture
              keyword => "monolithic"
100 points  - fax system dependencies
              keyword => "fax"
100 points  - modem dependencies
              keyword => "modem"
50 points   - thick client dependencies
              keyword => "thickclient"
50 points   - tape drive dependencies
              keyword => "tape"
50 points   - floppy drive dependencies
              keyword => "floppy"
50 points   - workloads with DevOps Anti-patterns
              keyword => "oldschoolIT"

The count is based on case-insensitive words!

Return a string in the following format

->'Burn baby burn disco inferno 2400 points earned in this roasting and 2 complaints resolved!'

If there are no complaints and no legacy from above return

->'These guys are already DevOps and in the Cloud and the business is happy!'
If you have any doubt COBOL should be burned... just look at this quote from Dijkstra.

The use of COBOL cripples the mind; its teaching should, therefore, be regarded as a criminal offense. Edger Dijkstra

For more information on how to have a disco inferno

https://www.youtube.com/watch?v=A_sY2rjxq6M

Disclaimer - this should only be attempted by trained professionals and in accordance with local ordinances. EX: Disco may be outlawed in certain countries.
*/

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DevOpsLegacyRoastingDiscoInfernoBurnBabyBurn {

    private static final List<String> MODERN_WORD = List.of("slow!", "expensive!", "manual!", "down!", "hostage!", "security!");
    private static final Map<String, Integer> LEGACY_WORD = Map.of(
            "COBOL", 1000,
            "nonobject", 500,
            "monolithic", 500,
            "fax", 100,
            "modem", 100,
            "thickclient", 50,
            "tape", 50,
            "floppy", 50,
            "oldschoolIT", 50);

    public static String roastLegacy(String workloads) {
        var modernCount = getModernCount(workloads);
        var points = getLegacyPoints(workloads);
        if (points == 0 && modernCount == 0) {
            return "These guys are already DevOps and in the Cloud and the business is happy!";
        }
        return String.format("Burn baby burn disco inferno %d points earned in this roasting and %d complaints resolved!", points, modernCount);
    }

    private static int getModernCount(String workloads) {
        var modernCount = 0;
        for (String word : MODERN_WORD) {
            Pattern p = Pattern.compile(word.toLowerCase());
            Matcher m = p.matcher(workloads.toLowerCase());
            while (m.find()) {
                modernCount++;
            }
        }
        return modernCount;
    }

    private static int getLegacyPoints(String phrase) {
        var points = 0;
        for (String key : LEGACY_WORD.keySet()) {
            Pattern p = Pattern.compile(key.toLowerCase());
            Matcher m = p.matcher(phrase.toLowerCase());
            while (m.find()) {
                points += LEGACY_WORD.get(key);
            }
        }
        return points;
    }
}
