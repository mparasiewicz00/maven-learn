package org.Figures;

public class Square implements Figures {

    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void build() {

    }

    public int area(int side) {
        if(side <= 0) throw new IllegalArgumentException();
        return side * side;
    }

    public int circuit(int side) {
        if(side <= 0) throw new IllegalArgumentException();
        return side * 4;
    }


}
