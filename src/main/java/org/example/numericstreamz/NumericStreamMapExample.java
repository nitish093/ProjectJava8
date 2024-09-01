package org.example.numericstreamz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static void mapToObj()
    {
        System.out.println(IntStream.rangeClosed(128,255).mapToObj((c)->(char) c));
        List<Character> collect = IntStream.rangeClosed(97, 122).mapToObj((c) -> (char) c).collect(Collectors.toList());

        String str = "Hello what are you doing";

//        String[] strArray = str.split("");
//        Map<IntStream, Long> collect1 = List.of(strArray).stream()
//                .filter(c -> !c.equals(" "))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        collect1.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 1)
//                .forEach(entry -> System.out.println(entry));
//        System.out.println(collect1);

    }

    public static void main(String[] args) {
        mapToObj();
    }
}
