package com.pluralsight.lambda;

@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T t);

    default CustomPredicate<T> and(CustomPredicate<T> p) {
        return t -> test(t) && p.test(t);
    }

    default CustomPredicate<T> or(CustomPredicate<T> p) {
        return t -> test(t) || p.test(t);
    }

    static <U> CustomPredicate<U> isEqualsTo(U u) {
        return obj -> obj.equals(u);
    }
}
