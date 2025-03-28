package com.info;

public class Student {
    int studentId;
    String studentName;

    void welcomeMessage(String studentName, String subject){
        System.out.println("Welcome to the session: " + studentName);
        System.out.println("This is a " + subject +" session");
    }

    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.studentId = 1;
        studentOne.studentName = "Aruna";

        Student studentTwo = new Student();
        studentTwo.studentId = 2;
        studentTwo.studentName = "Sandip";

        System.out.println("Student Id: " + studentOne.studentId + " Student Name: " + studentOne.studentName );
       studentOne.welcomeMessage(studentOne.studentName,"Java");

        System.out.println("Student Id: " + studentTwo.studentId + " Student Name: " + studentTwo.studentName );
        studentTwo.welcomeMessage(studentTwo.studentName, "Python");
    }
}
