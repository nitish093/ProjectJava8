package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceExample {

    public static Optional<Integer> noOfNoteBooks()
    {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .map(Student::getNoteBooks)
                .reduce(Integer::sum);
                //.reduce(Integer::min)
                //.reduce(Integer::min)

    }

    //main function
    public static void main(String[] args) {

        System.out.println(noOfNoteBooks().get());
    }
}
