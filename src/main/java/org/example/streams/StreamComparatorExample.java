package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static List<Student> sortStudentByName()
    {
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        return studentList;
    }

    public static List<Student> sortStudentByGpa()
    {
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

        return studentList;
    }
    public static List<Student> sortStudentByNameReversed()
    {
        List<Student> studentList = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());

        return studentList;
    }

    public static Set<String> sortStudentActivitiesByNameSet()
    {
        Set<String> collect = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        return collect;
    }

    //main function
    public static void main(String[] args) {

        System.out.println(sortStudentByName());
        System.out.println(sortStudentByGpa());
        System.out.println(sortStudentByNameReversed());
    }
}
