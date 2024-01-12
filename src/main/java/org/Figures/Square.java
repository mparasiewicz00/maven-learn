package org.Figures;

public class Square {
    public static int squareArea(int side) {
        if(side <= 0) throw new IllegalArgumentException();
        return side * side;
    }

    public static int squareCircuit(int side) {
        if(side <= 0) throw new IllegalArgumentException();
        return side * 4;
    }
}
