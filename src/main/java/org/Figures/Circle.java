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
    public static double area(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return Math.round(Math.PI * Math.pow(radius,2));
    }


    public static double circuit(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return Math.round(2 * (Math.PI * radius));
    }


}
