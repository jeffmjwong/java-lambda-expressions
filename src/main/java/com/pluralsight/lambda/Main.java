package com.pluralsight.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s.length() < 3;
        Predicate<String> predicate2 = s -> s.equals("ear");

        Predicate<String> predicate3 = predicate1.and(predicate2);
        Predicate<String> predicate4 = predicate1.or(predicate2);
        Predicate<String> predicate5 = Predicate.isEqualsTo("Yes");
        System.out.println(predicate5.test("Yes"));
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
