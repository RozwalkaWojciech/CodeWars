package javer.codewars.sevenkyu;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnEnglishTwistOnJapaneseClassicTest {

    private AnEnglishTwistOnJapaneseClassic S;

    @Before
    public void Init() {
        S = new AnEnglishTwistOnJapaneseClassic();

    }

    @Test
    public void test1() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"));
        List<String> expected = new ArrayList<String>(Arrays.asList("dog", "goose"
                , "elephant", "tiger", "rhino", "orc", "cat"));
        assertEquals(expected, S.theGame(words));
    }

    @Test
    public void test2() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc"));
        List<String> expected = new ArrayList<String>(Arrays.asList("dog", "goose"));
        assertEquals(expected, S.theGame(words));
    }

    @Test
    public void test3() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("dog", "goose", "elephant", "tiger", "cat", "rhino", "rhino", "orc"));
        List<String> expected = new ArrayList<String>(Arrays.asList("dog", "goose"
                , "elephant", "tiger"));
        assertEquals(expected, S.theGame(words));
    }

    @Test
    public void TestEmpty() {
        ArrayList<String> words = new ArrayList<String>();
        assertEquals(new ArrayList<String>(), S.theGame(words));
    }

    @Test
    public void TestEStrings() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("", "", "", "", "", "", ""));
        assertEquals(new ArrayList<String>(), S.theGame(words));
    }

    @Test
    public void TestMidEStrings() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("ab", "bc", "", "de", "", "", ""));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("ab", "bc"));
        assertEquals(expected, S.theGame(words));
    }

    @Test
    public void test13() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"));
        List<String> expected = new ArrayList<String>(Arrays.asList("dog", "goose"
                , "elephant", "tiger", "rhino", "orc", "cat"));
        assertEquals(expected, S.theGame3(words));
    }

    @Test
    public void test23() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc"));
        List<String> expected = new ArrayList<String>(Arrays.asList("dog", "goose"));
        assertEquals(expected, S.theGame3(words));
    }

    @Test
    public void test33() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("dog", "goose", "elephant", "tiger", "cat", "rhino", "rhino", "orc"));
        List<String> expected = new ArrayList<String>(Arrays.asList("dog", "goose"
                , "elephant", "tiger"));
        assertEquals(expected, S.theGame3(words));
    }

    @Test
    public void TestEmpty3() {
        ArrayList<String> words = new ArrayList<String>();
        assertEquals(new ArrayList<String>(), S.theGame3(words));
    }

    @Test
    public void TestEStrings3() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("", "", "", "", "", "", ""));
        assertEquals(new ArrayList<String>(), S.theGame3(words));
    }

    @Test
    public void TestMidEStrings3() {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("ab", "bc", "", "de", "", "", ""));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("ab", "bc"));
        assertEquals(expected, S.theGame3(words));
    }
}