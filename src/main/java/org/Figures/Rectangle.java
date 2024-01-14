package org.Figures;

public class Rectangle implements Figures {

    private int firstSide;
    private int secondSide;



    @Override
    public void build() {

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
