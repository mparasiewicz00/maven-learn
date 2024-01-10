package org.ListMapSetLearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListLearn {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();

        listA.add("Audi");
        listA.add("BMW");
        listA.add("Lamborghini");
        listA.add("Bentley");

        System.out.println(listA.size());
        listA.remove("Audi");
        String najlepszaMarka = listA.get(0);
        System.out.println(najlepszaMarka);
    }
}
