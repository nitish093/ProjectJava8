package org.example.streams.streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import static java.util.stream.Collectors.*;

public class StreamSumAvgExample {

    public static int sum()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static Double average()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {

        System.out.println(sum());
        System.out.println(average());
    }
}
