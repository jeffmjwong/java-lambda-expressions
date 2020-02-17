package com.pluralsight.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "ap";
        strings[1] = "b";
        strings[2] = "candy";
        strings[3] = "dilator";
        strings[4] = "ear";

        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Arrays.sort(strings, comparator1);

        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
        System.out.println(strings[3]);
        System.out.println(strings[4]);
    }
}
