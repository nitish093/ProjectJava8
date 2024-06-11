package org.example.streams;

import java.util.*;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers)
    {
        return integers.stream()
                //6
                //7
                //8
                //9
                //10
                .limit(4)
                .skip(2)
                .reduce(Integer::sum);
    }

    //main function
    public static void main(String[] args) {

        System.out.println(limit(Arrays.asList(6,7,8,9,10)));
    }
}
