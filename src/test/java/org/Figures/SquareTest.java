package org.Figures;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void squareAreaWithPositiveArgument() {
        int side = 5;

        int result = Square.squareArea(side);

        assertEquals(25, result);

    }

    @Test
    public void squareAreaWithNegativeArgument() {
        int side = -3;

        assertThrows(IllegalArgumentException.class, () -> Square.squareArea(side));
    }

    @Test
    void squareCircuitWithPositiveArgument() {
        int side = 10;

        int result = Square.squareCircuit(side);

        assertEquals(40, result);

    }

    @Test
    public void squareCircuitWithNegativeArgument() {
        int side = -3;

        assertThrows(IllegalArgumentException.class, () -> Square.squareCircuit(side));
    }
}