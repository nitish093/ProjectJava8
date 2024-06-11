package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupingExample()
    {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void groupingCustomizedExample()
    {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> {
                    String s = student.getGpa() >= 3.8 ? "Outstanding" : "Average";
                    return s;
                }));

        System.out.println(studentMap);
    }

    public static void twoLevelGroupingExample() {
        Map<String, Map<String, List<Student>>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender, groupingBy(student -> {
                    String s = student.getGpa() >= 3.8 ? "Outstanding" : "Average";
                    return s;
                })));

        System.out.println(collect);
    }
    public static void twoLevelGroupingExample_1() {
        Map<String, Integer> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender, summingInt(Student::getNoteBooks)));

        System.out.println(collect);
    }

    public static void threeArgumentGroupingExample_1() {
        LinkedHashMap<String, Set<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender, LinkedHashMap::new,toSet()));

        System.out.println(collect);
    }

    public static void calculateTopGpa() {
        Map<String, Optional<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender, maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(collect);

        Map<String, Student> collectAndThen = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender, collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        System.out.println(collectAndThen);

    }


    public static void main(String[] args) {

        //groupingExample();
        //groupingCustomizedExample();
        //twoLevelGroupingExample();
        //twoLevelGroupingExample_1();
        //threeArgumentGroupingExample_1();
        calculateTopGpa();
    }
}
