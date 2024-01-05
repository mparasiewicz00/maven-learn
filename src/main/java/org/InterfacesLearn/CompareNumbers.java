package org.InterfacesLearn;

public class CompareNumbers implements Compare {

    @Override
    public int compare(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
