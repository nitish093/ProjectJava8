package org.example.numericStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println(sum);

        int max = IntStream.rangeClosed(1,50).max().getAsInt();
        System.out.println(max);

        System.out.println(LongStream.rangeClosed(1,50).min().getAsLong());

        OptionalDouble average = IntStream.rangeClosed(1,50).average();
        System.out.println(average.isPresent() ? average.getAsDouble() : 0);

    }
}
