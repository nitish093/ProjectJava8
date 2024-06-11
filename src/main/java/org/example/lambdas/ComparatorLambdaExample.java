package org.example.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        Comparator<Integer> comparator = (a,b) -> {
            return a.compareTo(b);
        };

        System.out.println(comparator.compare(11,2));
    }
}
