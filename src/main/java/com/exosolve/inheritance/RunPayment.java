package com.exosolve.inheritance;

public class RunPayment {

    public static void main(String[] args) {

        Payment pay = new AdvancePayment(1,"RIYA");

        pay.initiatePayment();

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
