package org.StringBuilding;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringBuilding {
    public static void main(String[] args) throws InterruptedException {
        String one = "abc";
        StringBuffer builder = new StringBuffer(one);

        new Thread(() -> {
            builder.append("b".repeat(100000));
        }).start();

        builder.append("a".repeat(100000));

        Thread.sleep(1000);

        one = builder.toString();
        System.out.println(one.length());


        StringJoiner joiner = new StringJoiner(",", "{", "}");
        String result = joiner.add("Zaraz").add("są").add("zajęcia").toString();
        System.out.println(result);

        List<String> fastlist = Arrays.asList("To", "pana", "żółty", "matiz?");
        String allWords = "";
        allWords = allWords.join(", ", fastlist);
        System.out.println(allWords);


    }
}
