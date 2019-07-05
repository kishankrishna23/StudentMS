package com.StudentMS;

import java.util.List;
import java.util.stream.Collectors;

public class Process {

    public static void main(String[] args) {
     map();
    }

    public static void map() {

        List<Student> students = Student.getAllStudent().stream()
                .map(s -> new Student("Eng - " + s.getName(), s.getMarks())).collect(Collectors.toList());
        System.out.println(students.size());
        for(Student student:students)
        {
            System.out.println(student.getName());
        }
    }

}
