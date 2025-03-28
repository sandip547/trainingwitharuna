package com.exosolve.inheritance;

public class Payment {
    int paymentversion;
    int paymentId;

    public Payment(){

    }

    public Payment(int paymentId){
        this.paymentversion =1;
        this.paymentId = paymentId;
    }

    void initiatePayment(){
        System.out.println("payment has been initiated");
    }

    void checkCredentials(){
        System.out.println("Credentials verified");
    }

    void processPayment(){
        System.out.println("payment processed");
    }
}
