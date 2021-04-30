package com.company;

public class StudentManager {
    public void attendCourse(String courseName, Student student){
        System.out.println(student.firstName + " " + student.lastName + " attended to " + courseName + ".");
    }

    public void completeCourse(String courseName, Student student){
        System.out.println(student.firstName + " " + student.lastName + " has completed " + courseName + ".");
    }
}
