package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class StreamReduceExample {

    public static BinaryOperator<Student> binaryOperator = (student1, student2) -> {
        if (student1.getGpa() > student2.getGpa())
            return student1;
        else
            return student2;
    };

    public static int performMultiplication(List<Integer> integerList)
    {
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList)
    {
        return integerList.stream()
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGpaStudent()
    {
        return StudentDataBase.getAllStudents().stream()
                .reduce(binaryOperator);
    }

    public static void main(String[] args)
    {
        //System.out.println(performMultiplication(Arrays.asList(1,2,3,4,5)));
        //System.out.println(performMultiplicationWithoutIdentity(Arrays.asList(1,2,3,4,5)).get());

        System.out.println(getHighestGpaStudent().get());
    }
}
