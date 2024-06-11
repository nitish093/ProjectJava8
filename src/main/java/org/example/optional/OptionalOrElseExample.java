package org.example.optional;

import org.example.data.Student;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse()
    {
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public static String optionalOrElseGet()
    {
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");

        return name;
    }

    public static String optionalOrElseThrow()
    {
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Found"));

        return name;
    }

    //main function
    public static void main(String[] args) {
        System.out.println(optionalOrElseThrow());
    }
}
