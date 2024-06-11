package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities()
    {
        List<String> collect = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return collect;
    }

    public static long printStudentActivitiesCount()
    {
        long collect = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return collect;
    }

    public static void main(String[] args) {

        System.out.println(printStudentActivities());
        System.out.println(printStudentActivitiesCount());
    }
}
