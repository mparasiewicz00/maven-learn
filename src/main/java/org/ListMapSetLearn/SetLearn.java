package org.ListMapSetLearn;

import java.util.*;

public class SetLearn {
    public static void main(String[] args) {

        String[] test = {"Asia","Basia","Kasia"};

        Set<String> setTest = new HashSet<>(List.of(test));

        System.out.println(setTest);

    }
}
