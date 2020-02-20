package com.pluralsight.lambda;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<T> p) {
        return t -> test(t) && p.test(t);
    }

    default Predicate<T> or(Predicate<T> p) {
        return t -> test(t) || p.test(t);
    }

    static Predicate<String> isEqualsTo(String s1) {
        return s -> s.equals(s1);
    }
}
