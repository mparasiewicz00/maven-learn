package org.Figures;

public class Rectangle implements Figure {

    private int firstSide;
    private int secondSide;

    public Rectangle() {
    }

    @Override
    public void build() {
        System.out.println("Creating a rectangle");
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        if (firstSide <= 0 || secondSide <= 0) throw new IllegalArgumentException("Invalid side length");
        return (double) firstSide * secondSide;
    }

    @Override
    public double getCircuit() {
        if (firstSide <= 0 || secondSide <= 0) throw new IllegalArgumentException("Invalid side length");
        return 2 * firstSide + 2 * secondSide;
    }
}
