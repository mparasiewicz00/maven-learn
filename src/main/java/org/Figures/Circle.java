package org.Figures;

public class Circle implements Figures {

    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void build() {

    }

    public double area(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return Math.PI * Math.sqrt(radius);
    }

    public double circuit(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return 2 * Math.PI * radius;
    }


}
