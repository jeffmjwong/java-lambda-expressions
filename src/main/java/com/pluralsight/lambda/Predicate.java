package com.pluralsight.lambda;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<T> p) {
        return t -> test(t) && p.test(t);
    }
}
