package com.company;

public class Main {

    public static void main(String[] args) {
        Instructor instructor1 = new Instructor();
        instructor1.firstName = "Engin";
        instructor1.lastName = "DEMİROĞ";

        Student student1 = new Student();
        student1.firstName = "Melih";
        student1.lastName = "HOCAOĞLU";

        InstructorManager instructorManager = new InstructorManager();

        instructorManager.createCourse("Java Course", instructor1);
        instructorManager.uploadContent("Java Course", instructor1);

        System.out.println("");

        StudentManager studentManager = new StudentManager();

        studentManager.attendCourse("Java Course", student1);
        studentManager.completeCourse("Java Course", student1);
    }
}
