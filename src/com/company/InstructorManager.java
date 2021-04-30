package com.company;

public class InstructorManager {
    public void createCourse(String courseName,Instructor instructor){
        System.out.println(courseName + " successfully created by " + instructor.firstName + " " + instructor.lastName + ".");
    }
    public void uploadContent(String contentName, Instructor instructor){
        System.out.println(contentName + " successfully uploaded by " + instructor.firstName + " " + instructor.lastName + ".");
    }
}
