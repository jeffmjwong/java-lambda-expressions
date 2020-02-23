package com.pluralsight.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Lists {
    public static <T, U> List<U> map(List<T> l, Function<? super T, ? extends U> f) {
        List<U> newList = new ArrayList<>();

        for (T p : l) {
            U l1 = f.apply(p);
            newList.add(l1);
        }

        return newList;
    }
}
