package org.example.defaults;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;

public class DefaultMethodExample2 {

    static Comparator<Student> comparator = Comparator.comparingDouble(Student::getGpa);

    public static void sort(List<Student> studentList)
    {
        studentList.sort(comparator);
        studentList.forEach(System.out::println);
    }

    public static void sortWithNullValues(List<Student> studentList)
    {
        Comparator.nullsFirst(comparator);
        studentList.forEach(System.out::println);
    }


    public static void main(String[] args) {
        //sort(StudentDataBase.getAllStudents());
        sortWithNullValues(StudentDataBase.getAllStudents());
    }
}
