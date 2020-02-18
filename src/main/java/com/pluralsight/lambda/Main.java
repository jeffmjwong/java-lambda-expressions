package com.pluralsight.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Predicate<String> predicate1 = s -> s.length() == 3;
//
//        List<String> list1 = new ArrayList<>();
//        list1.add("ear");
//        list1.add("jim");
//        list1.add("dilan");
//
//        List<String> list2 = list1.stream().filter(predicate1).collect(Collectors.toList());
//        System.out.println(list2);

        UnaryOperator<String> operator1 = String::toUpperCase;
        System.out.println(operator1.apply("kk"));

//        BiFunction<String, String, Integer> function1 = (s1, s2) -> s1.length() + s2.length();
//        System.out.println(function1.apply("ab", "cde"));
    }

    private static void useComparator() {
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
