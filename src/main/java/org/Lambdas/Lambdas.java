package org.Lambdas;

public class Lambdas {
    public static void main(String[] args) {

        Printable lambdaPrintable = (s) -> "Woof!" + s;

        printThing(lambdaPrintable);
    }


    static void printThing(Printable thing) {
        thing.print("!");
    }
}
