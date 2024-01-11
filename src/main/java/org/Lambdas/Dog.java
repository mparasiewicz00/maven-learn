package org.Lambdas;

public class Dog implements Printable {

    public  String name;
    public int age;

    @Override
    public String print(String suffix) {
        return suffix;
    }
}
