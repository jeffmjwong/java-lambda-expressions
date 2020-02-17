package com.pluralsight.lambda;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T t1, T t2);

    static Comparator<Person> comparing(Function<Person, Integer> f) {
        return (p1, p2) -> -1;
    }
}
