package javer.codewars.sixkyu;

import org.junit.Test;

import java.util.Random;

import static javer.codewars.sixkyu.HTMLDynamicColorStringGeneration.generateColor;
import static org.junit.Assert.assertEquals;

public class HTMLDynamicColorStringGenerationTest {

    @Test
    public void symbolTest() {
        assertEquals("#", generateColor(new Random()).substring(0, 1));
    }
}