package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static List<Student> allStudents = StudentDataBase.getAllStudents();
    static Consumer<Student> consumer = (student) -> System.out.println(student);
    static Consumer<Student> consumer1 = (student) -> System.out.print(student.getName());
    static Consumer<Student> consumer2 = (student) -> System.out.println(student.getActivities());
    public static void printName()
    {

        allStudents.forEach(consumer);
    }

    public static void printNameAndActivities()
    {
        allStudents.forEach(consumer1.andThen(consumer2));
    }

    public static void printNameAndActivitiesUsingCondition()
    {
        allStudents.forEach((student)->{
            if(student.getGradeLevel() >=3 && student.getGpa() >= 3.9)
            {
                consumer1.andThen(consumer2).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        printNameAndActivitiesUsingCondition();
    }
}
