package org.Figures;

public class Circle {

    public static double area(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return Math.PI * Math.sqrt(radius);
    }

    public static double circuit(int radius) {
        if ( radius <= 0) throw new IllegalArgumentException();
        return 2 * Math.PI * radius;
    }


}
