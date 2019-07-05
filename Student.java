package com.StudentMS;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();


        students.add(new Student("Kishan",99));
        students.add(new Student("Rishada",89));
        students.add(new Student("Sanjeevan",79));
        students.add(new Student("Nimal",69));
        students.add(new Student("Iamal",59));
        students.add(new Student("Sunil",49));
        students.add(new Student("Peter",39));
        students.add(new Student("Mark",29));
        students.add(new Student("Kevin",19));
        students.add(new Student("Shan",9));

        return students;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
