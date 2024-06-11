package org.example.defaults;

import java.util.*;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        System.out.println("Inside the interface...");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList)
    {
        return integerList!=null && integerList.isEmpty();
    }
}
