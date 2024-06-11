package org.example.streams.streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.counting;

public class StreamCountingExample {

    public static long count()
    {
        long collect = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .count();

        System.out.println(collect);

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());

    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
