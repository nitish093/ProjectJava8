package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> predicate1 = student -> student.getGpa()>=3.9;
        Predicate<Student> predicate2 = student -> student.getGradeLevel()>=3;

        Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
                //.filter(predicate1.and(predicate2))
                .filter(predicate1)
                .peek(System.out::println)
                .filter(predicate2)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(map);

    }
}
