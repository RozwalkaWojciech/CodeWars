package javer.codewars.sevenkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildSquareTest {

    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", BuildSquare.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuildSquare.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuildSquare.generateShape(8));
    }

    @Test
    public void exampleTests2() {
        assertEquals("+++\n+++\n+++", BuildSquare.generateShape2(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuildSquare.generateShape2(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuildSquare.generateShape2(8));
    }
}