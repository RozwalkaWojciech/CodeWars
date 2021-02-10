package javer.codewars.eightkyu;

import static org.junit.jupiter.api.Assertions.*;
    
    import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


    public class DoIGetBonusTest {
        @Test
        public void basicTests() {
            boolean wellConfigured=unicodeTest();
            assertEquals((wellConfigured?"£":"\u00A3")+"100000",DoIGetBonus.bonusTime(10000, true));
            assertEquals((wellConfigured?"£":"\u00A3")+"250000",DoIGetBonus.bonusTime(25000, true));
            assertEquals((wellConfigured?"£":"\u00A3")+"10000",DoIGetBonus.bonusTime(10000, false));
            assertEquals((wellConfigured?"£":"\u00A3")+"60000",DoIGetBonus.bonusTime(60000, false));
            assertEquals((wellConfigured?"£":"\u00A3")+"20",DoIGetBonus.bonusTime(2, true));
            assertEquals((wellConfigured?"£":"\u00A3")+"78",DoIGetBonus.bonusTime(78, false));
            assertEquals((wellConfigured?"£":"\u00A3")+"678900",DoIGetBonus.bonusTime(67890, true));
        }

        public boolean unicodeTest(){
            System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
            System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
            return "\u00A3".equalsIgnoreCase("£");
        }
    }

}