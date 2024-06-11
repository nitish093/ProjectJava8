package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities()
    {
        List<Student> studentList = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> biConsumer = (name,activities)-> {
            System.out.println(name+" : "+activities);


        };

        studentList.forEach(student -> {
            biConsumer.accept(student.getName(),student.getActivities());
        });

    }

    public static void main(String[] args) {
        nameAndActivities();
    }
}
