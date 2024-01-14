package org.Figures;

public class Square implements Figures {

    static int side;


    @Override
    public void build() {

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
