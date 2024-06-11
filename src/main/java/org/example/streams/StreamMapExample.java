package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> nameList()
    {
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return studentList;
    }

    public static Set<String> nameSet()
    {
        Set<String> studentSet = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        return studentSet;
    }

    public static void main(String[] args) {

        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
