package org.example.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count());

        IntStream.range(1,50).forEach(x-> System.out.print(x));
        System.out.println();
        LongStream.range(1,50).forEach(x-> System.out.print(x));
        System.out.println();
        IntStream.range(1,50).asDoubleStream().forEach(x-> System.out.print(x+","));
        System.out.println();
        IntStream.range(1,50).asLongStream().forEach(x-> System.out.print(x+","));
    }
}
