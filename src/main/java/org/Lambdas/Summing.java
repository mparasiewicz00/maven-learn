package org.Lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Summing {
    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;
        System.out.println(sum.calculate(5,10));

        System.out.println("---------------------------------");

        List<Integer> integerList = Arrays.asList(2,4,6,8);
        integerList.forEach(element -> System.out.println(element));

        System.out.println("---------------------------------");


        integerList.forEach(element -> {
            int x =5;
            element += x;
            System.out.println(element*10);
        });

    }
}
