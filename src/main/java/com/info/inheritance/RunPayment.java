package com.info.inheritance;

public class RunPayment {
    public static void main(String[] args) {
        Payment payment = new Payment(1,"Stripe",500);
        System.out.println(payment.getPaymentId());
        System.out.println(payment.getPaymentMethod());

        Payment paymentOne = new Payment();
        paymentOne.setPaymentId(5);
        paymentOne.setPaymentMethod("debit card");
        paymentOne.setPaymentAmount(1000);

        System.out.println(paymentOne.getPaymentId() + " " + paymentOne.getPaymentAmount() + " " +paymentOne.getPaymentMethod());

        NewPaymentDetails newPaymentDetails = new NewPaymentDetails(2,"paypal",1000,"12.12.2024","payment intitiated");
        System.out.println(newPaymentDetails.newAmountCalculation(newPaymentDetails.getPaymentAmount()));
//        System.out.println(newPaymentDetails.getPaymentStatus());
//        newPaymentDetails.setPaymentStatus("payment processing");
//
//        System.out.println(newPaymentDetails.getPaymentStatus());
    }
}
