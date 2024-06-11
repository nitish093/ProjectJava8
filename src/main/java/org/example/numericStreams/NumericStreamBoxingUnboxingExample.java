package org.example.numericStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){

        List<Integer> integerList = IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());

        return  integerList;
    }

    public static int Unboxing(List<Integer> integerList){

        return  integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    //main function
    public static void main(String[] args) {

        System.out.println(boxing());
    }
}
