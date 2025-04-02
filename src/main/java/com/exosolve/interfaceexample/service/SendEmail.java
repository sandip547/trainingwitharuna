package com.exosolve.interfaceexample;

public interface SendEmail {

    public void sendEmail(String to,String message,String from,String subject);

    public void sendEmail(String to,String message,String from,String subject,String attachment);

    public void sendEmail(String to,String message,String from,String subject,String attachment,String templateName);

}
