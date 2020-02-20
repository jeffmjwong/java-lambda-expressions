package com.pluralsight.lambda;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
