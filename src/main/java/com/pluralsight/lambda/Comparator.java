package com.pluralsight.lambda;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T t1, T t2);

    default Comparator<T> thenComparing(Comparator<T> comparator) {
        return (p1, p2) -> compare(p1, p2) == 0 ? comparator.compare(p1, p2) : compare(p1, p2);
    };

    static <U> Comparator<U> comparing(Function<U, Comparable> f) {
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
    };
}
