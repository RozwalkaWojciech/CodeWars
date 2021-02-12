package javer.codewars.sixkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayingWithPassphrasesTest {

    @Test
    public void test1() {
        assertEquals("!!!vPz fWpM J", PlayingWithPassphrases.playPass("I LOVE YOU!!!", 1));
    }

    @Test
    public void test4() {
        assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
                PlayingWithPassphrases.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }
}