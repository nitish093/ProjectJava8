package org.example.streams;

import java.util.*;

public class StreamMinMaxExample {

    public static Optional<Integer> findMinMaxValueOptional(List<Integer> integerList)
    {
        return integerList.stream()
                .reduce((x,y)->x>y?x:y);
    }

    public static  Integer findMinMaxValue(List<Integer> integerList)
    {
        return integerList.stream()
                .reduce(0,(x,y)->x>y?x:y);
    }

    public static void main(String[] args) {

        System.out.println(findMinMaxValue(Arrays.asList(1,3)));
    }
}
