package org.example;

import org.example.Entity.Student;
import org.example.Enum.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class App {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(
                List.of(new Student("Syimyk", 21, Gender.MALE),
                        new Student("Meerim", 20, Gender.FEMALE),
                        new Student("Isma", 21, Gender.MALE),
                        new Student("Isma", 21, Gender.MALE),
                        new Student("Aizada", 20, Gender.FEMALE)
                ));
   students.stream().filter(student -> student.getGender().equals(Gender.MALE))
           .sorted(Comparator.comparing(Student::getName))
           .sorted(Comparator.comparing(Student::getAge))
           .distinct()
           .toList()
           .forEach(System.out::println);


    students.stream().filter(student -> student.getGender().equals(Gender.FEMALE))
            .forEach(System.out::println);





    }
}



