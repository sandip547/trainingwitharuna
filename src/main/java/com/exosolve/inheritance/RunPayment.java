package com.exosolve.inheritance;

public class RunPayment {

    public static void main(String[] args) {

        Payment pay = new AdvancePayment(1,"RIYA");
        System.out.println("Training v2 feature has been added");
        pay.initiatePayment();
        System.out.println("Hello there this is a ne change eeeeeee");
        Payment payPayal = new PaypalPayment();
        System.out.println("Hello there");
        AdvancePayment payment = new AdvancePayment(1,"riya123");
        payment.initiatePayment();
        System.out.println("PaymentId: " + payment.paymentId + "userName :" + payment.userName);
        payment.checkCredentials();
        payment.processPayment();
        payment.savePaymentInformation();

    }
}
