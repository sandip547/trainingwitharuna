package com.info;

import java.util.ArrayList;

public class MethodArrayExample {

    public MethodArrayExample(){

    }

    void sendEmail(String message,String [] to, String subject) {
        for(String email: to) {
            System.out.println(email);
            System.out.println("Subject: " + subject);
            System.out.println("Message: " + message);
        }
    }
    void sendEmail(String message,String [] to, String subject,String [] fileNames){
        for(String email: to) {

            System.out.println(email);
            System.out.println("Subject: " + subject);
            System.out.println("Message: " + message);
            for(String fileName: fileNames){
                System.out.println(fileName);
            }
        }
    }

    public static void main(String[] args) {
        MethodArrayExample methodArrayExample = new MethodArrayExample();
        String [] listOfEmails = {"aruna@gmail.com", "sandip@gmail.com"};
            String [] listOfFiles = {"resume.pdf","test.doc","1234.jpeg"};
        System.out.println(listOfFiles.length);
        methodArrayExample.sendEmail("Hello how are you doing",listOfEmails,"Test");
        System.out.println("-------------------");

        methodArrayExample.sendEmail("Welcome to the training class",listOfEmails,"Welcome",listOfFiles);
    }
}
