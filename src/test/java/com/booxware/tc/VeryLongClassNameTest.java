package com.booxware.tc;

import org.junit.Test;

public class VeryLongClassNameTest {

    String unusedString = "Ted is cool!";

    @Test
    public void testA() {
        System.out.println("test A");
        unusedString = "no it isn't!";
    }

    @Test
    public void testB() {
        System.out.println("test B");
        unusedString = "yes it is!";
    }
}
