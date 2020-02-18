package com.pluralsight.lambda;

public class Main {
    public static void main(String[] args) {

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
