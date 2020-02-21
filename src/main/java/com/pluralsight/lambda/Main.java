package com.pluralsight.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tony", "Peens", 35));
        people.add(new Person("Jonathan", "Brown", 25));
        people.add(new Person("James", "Mason", 29));

        UnaryOperator<Person> u1 = p -> {
            if (p.getAge() < 30) {
                return p;
            }

            return new Person("Hello", "world", 32);
        };
        people.replaceAll(u1);
        System.out.println(people);
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
