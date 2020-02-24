package com.pluralsight.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lists {
    public static <T, U> List<U> map(List<T> list, Function<T, U> function) {
        return list.stream().map(function).collect(Collectors.toList());
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
