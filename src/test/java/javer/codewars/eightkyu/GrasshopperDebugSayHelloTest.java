package javer.codewars.eightkyu;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrasshopperDebugSayHelloTest {

    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock",
                GrasshopperDebugSayHello.sayHello("Mr. Spock"));
    }

    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk",
                GrasshopperDebugSayHello.sayHello("Captain Kirk"));
    }

    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura",
                GrasshopperDebugSayHello.sayHello("Liutenant Uhura"));
    }

    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy",
                GrasshopperDebugSayHello.sayHello("Dr. McCoy"));
    }
}