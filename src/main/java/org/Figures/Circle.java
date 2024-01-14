package org.Figures;

public class Circle implements Figure {

    private int radius;

    public Circle() {
    }

    @Override
    public void build() {
        System.out.println("Creating a circle");
    }

    @Override
    public double getArea() {
        if (radius <= 0) throw new IllegalArgumentException("Invalid radius");
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircuit() {
        if (radius <= 0) throw new IllegalArgumentException("Invalid radius");
        return 2 * Math.PI * radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
