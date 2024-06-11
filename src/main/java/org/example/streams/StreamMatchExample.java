package org.example.streams;

import org.example.data.StudentDataBase;

public class StreamMatchExample {

    public static boolean anyMatch()
    {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.9);
                //allMatch
                //noneMatch
    }

    //main function
    public static void main(String[] args) {

        System.out.println(anyMatch());
    }
}
