package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateBMITest {
    @Test
    public void testBMI() {
        assertEquals("Normal", CalculateBMI.bmi(80, 1.80));
        assertEquals("Underweight", CalculateBMI.bmi(20, 1.80));
        assertEquals("Obese", CalculateBMI.bmi(120, 1.80));
    }
}