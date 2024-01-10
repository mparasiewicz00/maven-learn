package org.ListMapSetLearn;

import java.util.HashMap;
import java.util.Map;

public class MapLearn {
    public static void main(String[] args) {
        Map<String , String> map1 = new HashMap<>();

        map1.put("Traktory", "Audi");
        map1.put("Osobowe", "BMW");

        System.out.println(map1.get("Osobowe"));
    }
}
