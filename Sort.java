package com.StudentMS;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sort {


    public static void sortByName() {
        List<Student> students = Student.getAllStudent().stream().
                sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(students.size());
        System.out.println(students);
    }

    public static void sortByNameCharacterCount() {
        List<Student> students = Student.getAllStudent().stream().
                sorted((s1,s2)->new Integer(s1.getName().length()).compareTo(s2.getName().length())).collect(Collectors.toList());
        System.out.println(students.size());
        System.out.println(students);
    }



    public static void minMarksStudent() {
        Optional<Student> students = Student.getAllStudent().stream().
                min(Comparator.comparing(Student::getMarks));
        //System.out.println(students.size());
        System.out.println(students);
    }

    public static void maxMarksStudent() {
        Optional<Student> students = Student.getAllStudent().stream().
                max(Comparator.comparing(Student::getMarks));
        //System.out.println(students.size());
        System.out.println(students);
    }

    public static void main(String[] args) {
        //sortByName();
        //sortByNameCharacterCount();
        //minMarksStudent();
        //maxMarksStudent();

        Student.getAllStudent().stream().forEach(System.out::println);

    }
}
