package org.StringBuilding;

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

    }
}
