package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentsByGradeLevel()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });

    }
    public static void filterStudentsByGradeLevelAndGpa()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });

    }

    public static void main(String[] args) {
        filterStudentsByGradeLevelAndGpa();
    }

}
