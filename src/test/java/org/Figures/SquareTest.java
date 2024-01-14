package org.Figures;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void squareAreaWithPositiveArgument() {
        int side = 5;

        int result = Square.area(side);

        assertEquals(25, result);

    }

    @Test
    void squareAreaWithZero() {
        int side = 0;

        assertThrows(IllegalArgumentException.class, () -> Square.area(side));
    }

    @Test
    void squareAreaWithNegativeArgument() {
        int side = -3;

        assertThrows(IllegalArgumentException.class, () -> Square.area(side));
    }

    @Test
    void squareCircuitWithPositiveArgument() {
        int side = 10;

        int result = Square.circuit(side);

        assertEquals(40, result);
    }

    @Test
    void CircuitAreaWithZero() {
        int side = 0;

        assertThrows(IllegalArgumentException.class, () -> Square.circuit(side));
    }

    @Test
    void squareCircuitWithNegativeArgument() {
        int side = -3;

        assertThrows(IllegalArgumentException.class, () -> Square.circuit(side));
    }
}