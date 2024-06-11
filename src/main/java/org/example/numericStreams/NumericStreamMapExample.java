package org.example.numericStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj()
    {
        return IntStream.rangeClosed(1,6)
                .mapToObj(x-> {
                    return new Integer(x);
                })
                .collect(Collectors.toList());
    }

    public static List<Long> mapToLong()
    {
        return IntStream.rangeClosed(1,6)
                .mapToObj(x-> {
                    return new Long(x);
                })
                .collect(Collectors.toList());
    }

    public static List<Double> mapToDouble()
    {
        return IntStream.rangeClosed(1,6)
                .mapToObj(x-> {
                    return new Double(x);
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
