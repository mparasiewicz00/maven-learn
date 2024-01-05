package org.FirstTest;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(sumIter(5));
        System.out.println(sumRecursion(5));
        System.out.println((long)fibonacciRecursion(40));
    }

    public static int sumIter(int n) {
        int suma = 0;
        while(n > 0) {
            suma = suma+n;
            n--;
        }
        return suma;
    }

    public static int sumRecursion(int n) {
        if(n>0) {
            return n + sumRecursion(n-1);
        } else {
            return 0;
        }
    }

    public static int fibonacciRecursion (int number) {
        return number<2? number : fibonacciRecursion(number-1) + fibonacciRecursion(number-2);
    }



}
