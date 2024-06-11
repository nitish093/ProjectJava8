package org.example.optional;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getStudentNameOptional()
    {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.supplier.get());

        if(optionalStudent.isPresent())
        {
            //return optionalStudent.get().getName();
            return optionalStudent.map(Student::getName);
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(getStudentNameOptional());
    }
}
