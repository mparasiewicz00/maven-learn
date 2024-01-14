package org.Figures;

public class Rectangle implements Figure {

    private int firstSide;
    private int secondSide;
    private int area;
    private int circuit;

    public Rectangle(){
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
        return (double)area;
    }

    @Override
    public double getCircuit() {
        return (double)circuit;
    }

    public static int area(int firstSide, int secondSide) {
        if (firstSide <= 0 || secondSide <= 0) throw new IllegalArgumentException();
        return firstSide * secondSide;
    }

    public static int circuit(int firstSide, int secondSide) {
        if (firstSide <= 0 || secondSide <= 0) throw new IllegalArgumentException();
        return 2 * firstSide + 2 * secondSide;
    }
}
