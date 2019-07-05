package com.StudentMS;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        //withoutStream();
        //stream();
        filterI();
    }

     public static void withoutStream(){
            List<Student> students = Student.getAllStudent();
            System.out.println(students.size());

            List<Student> highMarksList = new ArrayList<>();
            for (Student student : students) {
                if (student.getMarks() > 50) {
                    highMarksList.add(student);
                }
            }
            System.out.println(students.size());
            System.out.println(highMarksList.size());
        }

        public static void stream(){
            List<Student> students = Student.getAllStudent().stream().
                    filter(s->s.getMarks()> 50).collect(Collectors.toList());
            System.out.println(students.size());
        }

        public static void filterI(){

        List<Student> students = Student.getAllStudent().stream().
                filter(s->s.getName().contains("i") || s.getName().contains("I")).collect(Collectors.toList());
            System.out.println(students.size());

            for (Student s:students)
            {
                System.out.println(s.getName());
            }

        }






    }

