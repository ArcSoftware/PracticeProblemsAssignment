package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ben on 12/13/16.
 */
public class MainTest {

    @Test
    public void testNumber() throws Exception {
        assertTrue(Main.fizzBuzz(3).equals("Fizz"));
        assertTrue(Main.fizzBuzz(5).equals("Buzz"));
        assertTrue(Main.fizzBuzz(15).equals("FizzBuzz"));
    }

    @Test
    public void testFibSec() throws Exception {
        assertArrayEquals(new Integer[] { 1, 1, 2 }, Main.fibseq(3));
    }

}