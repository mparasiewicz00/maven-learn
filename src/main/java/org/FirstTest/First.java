package org.FirstTest;

public class First {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial (int number) {
        if ( number < 0) {
            throw new  IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
