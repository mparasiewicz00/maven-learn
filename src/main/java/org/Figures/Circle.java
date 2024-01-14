package org.Figures;



public class Circle implements Figure {

    private int radius;
    private double area;
    private double circuit;

    public Circle() {
    }

    @Override
    public void build() {
        System.out.println("Creating a circle");
    }

    public double getArea() {
        return area;
    }

    public double getCircuit() {
        return circuit;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }


    public static double area(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return Math.round(Math.PI * Math.pow(radius,2));
    }


    public static double circuit(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return Math.round(2 * (Math.PI * radius));
    }


}
