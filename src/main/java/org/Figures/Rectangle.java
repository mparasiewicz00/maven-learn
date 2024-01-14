package org.Figures;

public class Rectangle implements Figures {

    private int firstSide;
    private int secondSide;

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
    public void build() {

    }

    public int area(int firstSide, int secondSide) {
        if (firstSide <= 0 || secondSide <= 0) throw new IllegalArgumentException();
        return firstSide * secondSide;
    }

    public int circuit(int firstSide, int secondSide) {
        if (firstSide <= 0 || secondSide <= 0) throw new IllegalArgumentException();
        return 2 * firstSide + 2 * secondSide;
    }
}
