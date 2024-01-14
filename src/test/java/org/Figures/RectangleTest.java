package org.Figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void rectangleAreaWithPositiveArguments() {
        int firstSide = 2;
        int secondSide = 3;

        int result = Rectangle.area(firstSide,secondSide);

        assertEquals(6, result);
    }

    @Test
    void rectangleAreaWithOneNegativeArgument() {
        int firstSide = 2;
        int secondSide = -5;

        assertThrows(IllegalArgumentException.class, () -> Rectangle.area(firstSide,secondSide));
    }

    @Test
    void rectangleAreaWithBothNegativeArguments() {
        int firstSide = -5;
        int secondSide = -10;

        assertThrows(IllegalArgumentException.class, () -> Rectangle.area(firstSide,secondSide));
    }


    @Test
    void rectangleCircuitWithPositiveArgument() {
        int firstSide = 5;
        int secondSide = 10;

        int result = Rectangle.circuit(firstSide,secondSide);

        assertEquals(30, result);
    }
    @Test
    void rectangleCircuitWithOneNegativeArgument() {
        int firstSide = -5;
        int secondSide = 10;

        assertThrows(IllegalArgumentException.class, () -> Rectangle.circuit(firstSide,secondSide));
    }

    @Test
    void rectangleCircuitWithBothNegativeArguments() {
        int firstSide = -2;
        int secondSide = -10;

        assertThrows(IllegalArgumentException.class, () -> Rectangle.circuit(firstSide,secondSide));
    }


}