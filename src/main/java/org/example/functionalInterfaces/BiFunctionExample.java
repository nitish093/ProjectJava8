package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>,Map<String,Double>> biFunction = (students, studentPredicate) -> {
        Map<String,Double> map = new HashMap<>();

        students.forEach(student->{
            if(studentPredicate.test(student))
            {
                map.put(student.getName(),student.getGpa());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(biFunction.apply(studentList,PredicateStudentExample.p1));
    }
}
