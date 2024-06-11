package org.example.streams.streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Set;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class StreamsMappingExample {

    public static Set<String> mappingMethod()
    {

        /*
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toSet());
        //Same as below snippet
        */
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));

    }

    public static void main(String[] args) {

        System.out.println(mappingMethod());
    }
}
