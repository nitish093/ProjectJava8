package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.function.Function;

import static org.example.functionalInterfaces.PredicateStudentExample.p1;

public class FunctionStudentExample {

    static Function<List<Student>,Map<String,Double>> function = student -> {

        Map<String,Double> map = new HashMap<>();

        student.forEach(s->{
            if(p1.test(s)) {
                map.put(s.getName(), s.getGpa());
            }
        });

        return map;
    };

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();

        Map<String, Double> apply = function.apply(students);

        System.out.println(apply);
    }
}
