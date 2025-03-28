package com.info.inheritance;

public class AddExample {
     String sendMessage(String message){
         return "Message sent: " + message;
     }
     String sayHello(){
         return "Hello";
     }
}

class SendEmail extends AddExample{
     String sendMessage(String message){
         return "Message sent:" + message + "for able solutions";
     }
     String sendMessage(String message,String email){
         return "Message sent to: " + email + " - " + message;
     }


     public static void main(String[] args) {
         AddExample sendEmail = new SendEmail();
         System.out.println(sendEmail.sendMessage("Hello"));
         System.out.println(sendEmail.sayHello());
         //System.out.println(sendEmail.sendMessage("hey","a@gmail.com"));

         SendEmail send = new Aruna();
         System.out.println(send.sendMessage("Hello"));

     }
 }
class Aruna extends SendEmail{
    String sendMessage(String message,String email){
        return "Message sent to: " + email + " - " + message + " for able solutions";
    }
}