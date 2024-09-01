package org.example.numericstreamz;

import java.util.*;
import java.util.stream.IntStream;

public class NumericStreamExample {


    public static int sumOfNumbers(List<Integer> integerList)
    {
        return integerList.stream()
                .reduce(0,(x,y)-> x+y);
    }

    public static long sum(List<Integer> integerList)
    {
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumOfNumbersIntStream()
    {
        return IntStream.rangeClosed(1,6).sum();
    }

    public static IntSummaryStatistics summaryIntStream1()
    {
        return IntStream.rangeClosed(1,6).summaryStatistics();
    }

    public static void summaryIntStream2()
    {
         IntStream.rangeClosed(1,6).average();
         IntStream.rangeClosed(1,6).max();
         IntStream.rangeClosed(1,6).min();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println("Sum of Numbers: "+sumOfNumbers(integerList));
        System.out.println("Sum of Numbers: "+sum(integerList));

        System.out.println(summaryIntStream1());
        System.out.println(summaryIntStream1().getAverage());
    }
}
