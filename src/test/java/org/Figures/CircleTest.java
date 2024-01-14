package org.Figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void circleAreaWithPositiveArgument() {
        int radius = 5;

        double result = Circle.area(radius);

        assertEquals(79, result);
    }

    @Test
    void circleAreaWithNegativeArgument() {
        int radius = -3;

        assertThrows(IllegalArgumentException.class, () -> Circle.area(radius));
    }

    @Test
    void circleAreaWithZero() {
        int radius = 0;

        assertThrows(IllegalArgumentException.class, () -> Circle.area(radius));
    }

    @Test
    void circleCircuitWithPositiveArgument() {
        int radius = 5;

        double result = Circle.circuit(radius);

        assertEquals(31, result);
    }

    @Test
    void circleCircuitWithNegativeArgument() {
        int radius = -1;

        assertThrows(IllegalArgumentException.class, () -> Circle.circuit(radius));
    }

    @Test
    void circleCircuitWithZero() {
        int radius = 0;

        assertThrows(IllegalArgumentException.class, () -> Circle.circuit(radius));
    }



}