package com.pluralsight.lambda;

import java.util.function.Function;

@FunctionalInterface
public interface CustomComparator<T> {
    int compare(T t1, T t2);

    default CustomComparator<T> thenComparing(CustomComparator<T> customComparator) {
        return (p1, p2) -> compare(p1, p2) == 0 ? customComparator.compare(p1, p2) : compare(p1, p2);
    }

    default CustomComparator<T> thenComparing(Function<T, Comparable> f) {
        return thenComparing(comparing(f));
    }

    static <U> CustomComparator<U> comparing(Function<U, Comparable> f) {
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
    }
}
