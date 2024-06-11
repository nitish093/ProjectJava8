package org.example.optional;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter()
    {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.supplier.get());

        studentOptional.
                filter(student -> student.getGpa()>=3.5)
                .ifPresent(s-> System.out.println(s.getName()));

    }

    public static void main(String[] args) {
        optionalFilter();
    }
}
