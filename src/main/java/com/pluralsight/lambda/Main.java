package com.pluralsight.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", "M", 23);
        Person p2 = new Person("Brian", "S", 56);
        Person p3 = new Person("Chelsea", "T", 46);
        Person p4 = new Person("David", "W", 28);
        Person p5 = new Person("Erica", "L", 37);
        Person p6 = new Person("Francis", "K", 18);

//        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
//        people.removeIf(p -> p.getAge() < 30);
//        people.replaceAll(p -> new Person(p.getFirstName().toUpperCase(), p.getLastName(), p.getAge()));
//        people.sort(Comparator.comparing(Person::getAge).reversed());
//        people.forEach(System.out::println);

        City newYork = new City("New York");
        City shanghai = new City("Shanghai");
        City paris = new City("Paris");

        Map<City, List<Person>> map = new HashMap<>();
        map.putIfAbsent(paris, new ArrayList<>());
        map.get(paris).add(p1);

        System.out.println("People from Paris: " + map.getOrDefault(paris, Collections.emptyList()));
    }

    private static void usePredicate() {
        CustomPredicate<String> customPredicate1 = s -> s.length() < 3;
        CustomPredicate<String> customPredicate2 = s -> s.equals("ear");

        CustomPredicate<String> customPredicate3 = customPredicate1.and(customPredicate2);
        CustomPredicate<String> customPredicate4 = customPredicate1.or(customPredicate2);
        CustomPredicate<String> customPredicate5 = CustomPredicate.isEqualsTo("Yes");
        CustomPredicate<Integer> customPredicate6 = CustomPredicate.isEqualsTo(5);
        System.out.println(customPredicate5.test("Yes"));
        System.out.println(customPredicate6.test(4));
        System.out.println(customPredicate6.test(5));
        System.out.println(customPredicate6.test(6));
    }

    private static void useComparator() {
        final Person person1 = new Person("Antonie", "Peens", 35);
        final Person person2 = new Person("Zac", "Mason", 28);
        final Person person3 = new Person("Jonathan", "Brown", 32);

        CustomComparator<Person> customComparatorByAge = CustomComparator.comparing(Person::getAge);
        CustomComparator<Person> customComparatorByFirstName = CustomComparator.comparing(Person::getFirstName);
        CustomComparator<Person> customComparator = CustomComparator.comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparing(Person::getAge);
    }
}
