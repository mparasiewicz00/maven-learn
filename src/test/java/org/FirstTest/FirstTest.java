package org.FirstTest;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    @Test
    public void testFactorialWithPositiveNumber() {
        int number = 5;

        int result = First.factorial(number);

        assertEquals(120, result);
    }

    @Test
    public void testFactorialWithZero() {
        int number = 0;

        int result = First.factorial(number);

        assertEquals(1, result);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        int number = -1;

        assertThrows(IllegalArgumentException.class, () -> First.factorial(number));
    }
}