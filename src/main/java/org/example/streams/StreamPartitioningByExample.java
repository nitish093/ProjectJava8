package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamPartitioningByExample {

    public static void partitioningBy_1()
    {

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));

        System.out.println("Partitioning Map: "+collect);
    }

    public static void partitioningBy_2()
    {

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate,toSet()));

        System.out.println("Partitioning Map: "+collect);
    }

    //main function
    public static void main(String[] args) {
        //partitioningBy_1();
        partitioningBy_2();
    }
}
