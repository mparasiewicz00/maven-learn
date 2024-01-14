package org.Figures;

public class Square implements Figure {
    private int side;
    private int area;
    private int circuit;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void build() {

    }

    @Override
    public double getArea() {
        return (double)area;
    }

    @Override
    public double getCircuit() {
        return (double)circuit;
    }

    public static int area(int side) {
        if(side <= 0) throw new IllegalArgumentException();
        return side * side;
    }

    public static int circuit(int side) {
        if(side <= 0) throw new IllegalArgumentException();
        return side * 4;
    }


}
