package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (s)-> s.getGradeLevel() >=3;
    Predicate<Student> p2 = (s)-> s.getGpa() >=3;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> gpa>=3 && gradeLevel>=3.9;

    BiConsumer<String, List<String>> biConsumer = (name,activities) -> {
        System.out.println(name+" : "+activities);
    };

    Consumer<Student> consumer = (student)->{
        if(biPredicate.test(student.getGradeLevel(),student.getGpa()))
        {
            biConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivities(List allStudents)
    {
        allStudents.forEach(consumer);
    }

    public static void main(String[] args) {

        List<Student> allStudents = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameAndActivities(allStudents);
    }
}
