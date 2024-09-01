package org.example.numericstreamz;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJoiningExample {

    public static void joining_1()
    {
        String concatenatedString =  StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());

        System.out.println(concatenatedString);
    }

    public static void get()
    {
         Set<String> set =  StudentDataBase.getAllStudents()
                .stream()
                //.map(Student::getName)
                .sorted(Comparator.comparing(Student::getName).reversed())
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        System.out.println(set);
    }

    public static void get1()
    {
        Map<String, List<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));


        System.out.println(collect);

    }

    public static void custom()
    {
        Map<String, List<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 4? "PASS":"AVERAGE"));


        //System.out.println(collect);
        //System.out.println(collect.get("PASS"));
        collect.get("PASS")
                .stream()
                .peek(student -> System.out.println(student.getName()))
                .forEach(System.out::println);


    }

    public static void twoLevelGrouping()
    {

        Map<Integer, Map<String, List<Student>>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 4 ? "PASS" : "AVERAGE")));

        System.out.println(collect);
    }

    public static void twoLevelGrouping_2()
    {

        Map<Integer,Integer> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(collect);
    }

    public static void twoLevelGrouping_3()
    {

        Map<String, List<String>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.mapping(Student::getName, Collectors.toList())));


        System.out.println(collect);

        StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.summingInt(Student::getNoteBooks)));

        //Average GPA by Gender
        Map<String, Double> collect1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getGpa)));
        System.out.println(collect1);

        //Count of Students by Grade Level
        Map<Integer,Long> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.counting()));
        System.out.println(map);

        Map<Integer, Set<String>> collect2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.flatMapping(student -> student.getActivities().stream(), Collectors.toSet())));

        System.out.println(collect2);
        //Total Number of Activities by Gender
        Map<String, Integer> totalActivitiesByGender = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.summingInt(student -> student.getActivities().size())
                ));

        System.out.println(totalActivitiesByGender);

        Map<String, List<String>> collect3 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.mapping(Student::getName,Collectors.toList())));

        System.out.println(collect3);


        List<String> studentList =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(studentList);

        List<String> studentList1 = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(studentList1);

        Map<Integer,List<String>> maps = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println("Maps: "+maps);

        Map<String, List<String>> collect4 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() > 3.5 ? "WOW" : "NOT COOL", Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(collect4);

        Map<String,List<String>> mapStudents = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(mapStudents);

        Map<String,Integer> studentAcSize = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName,student -> student.getActivities().size()));
        System.out.println(studentAcSize);

        List<String> studentList2 = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.5)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));

        List<String> activ = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted(Comparator.comparing(String::toString))
                .collect(Collectors.toList());

        System.out.println(activ);

        Map<String,Double> mapD =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getGpa)));
        System.out.println(mapD);

        boolean check = StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() > 3.0);
        System.out.println(check);

        Optional<Student> optionalStudent = StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);



        Optional<Student> student = StudentDataBase.getAllStudents()
                .stream()
                .max(Comparator.comparing(Student::getGpa));

        student.ifPresent(s -> System.out.println(s));

        Map<Integer,List<String>> mapNote = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getNoteBooks,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(mapNote);

        List<String> strings = StudentDataBase.getAllStudents()
                .stream()
                .filter(student1 -> student1.getActivities().size() > 3)
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(strings);

        Map<String, Long> genderCountMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));

        Optional<Map.Entry<String, Long>> maxEntry = genderCountMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        maxEntry.ifPresent(entry -> System.out.println(entry.getKey()+"---"+entry.getValue()));

         Optional<Map.Entry<String, Long>> optionalEntry = genderCountMap.entrySet()
                .stream()
                .reduce((x,y) -> x.getValue() > y.getValue() ? x : y);

        System.out.println(optionalEntry);
        optionalEntry.ifPresent(entry -> System.out.println(entry.getKey()+"---"+entry.getValue()));

        List<Map.Entry<String, Long>> collect5 = genderCountMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        System.out.println(collect5);

    }

    public static void main(String[] args) {
        twoLevelGrouping_3();
    }
}
