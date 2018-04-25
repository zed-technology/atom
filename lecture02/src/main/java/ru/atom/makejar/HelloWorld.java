package ru.atom.makejar;

import java.util.Arrays;

/**
 * Class just to test fat jar packing
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(getHelloWorld());

        int[] values = {10,4,5,9,12,4,7,9};
        System.out.println(Arrays.stream(values).max().getAsInt());


    }

    public static String getHelloWorld() {
        return "Hello, World!";
    }
}
