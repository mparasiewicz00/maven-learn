package org.Figures;

public class Square implements Figure {

    private int side;

    public Square() {
    }

    @Override
    public void build() {
        System.out.println("Creating a square");
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        if (side <= 0) throw new IllegalArgumentException("Invalid side length");
        return (double) side * side;
    }

    @Override
    public double getCircuit() {
        if (side <= 0) throw new IllegalArgumentException("Invalid side length");
        return side * 4;
    }
}
