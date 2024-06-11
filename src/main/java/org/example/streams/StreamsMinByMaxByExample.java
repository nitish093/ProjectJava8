package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy_example()
    {
        Optional<Student> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));

        return collect;
    }

    public static void main(String[] args) {

        System.out.println(minBy_example().isPresent());
        System.out.println(minBy_example().get());
    }
}
