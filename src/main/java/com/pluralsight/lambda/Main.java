package com.pluralsight.lambda;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        String[] strings = new String[5];
//        strings[0] = "ap";
//        strings[1] = "b";
//        strings[2] = "candy";
//        strings[3] = "dilator";
//        strings[4] = "ear";
//
//        Comparator<String> comparator1 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
//
//        Arrays.sort(strings, comparator1);
//
//        System.out.println(strings[0]);
//        System.out.println(strings[1]);
//        System.out.println(strings[2]);
//        System.out.println(strings[3]);
//        System.out.println(strings[4]);

//        Executors.newSingleThreadExecutor().execute(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("It works! - " + i);
//            }
//        });
        final Person person1 = new Person("Antonie", "Peens", 35);
        final Person person2 = new Person("Zac", "Mason", 28);
        final Person person3 = new Person("Jonathan", "Brown", 32);

        Comparator<Person> comparatorByAge = Comparator.comparing(Person::getAge);
        Comparator<Person> comparatorByFirstName = Comparator.comparing(Person::getFirstName);
        Comparator<Person> comparator = Comparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparing(Person::getAge);
    }
}
