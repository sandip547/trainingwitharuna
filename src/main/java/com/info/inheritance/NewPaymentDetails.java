package com.info.inheritance;

public class NewPaymentDetails extends Payment{

    String paymentDate;
    String paymentStatus;

    public NewPaymentDetails(int paymentId, String paymentMethod, int paymentAmount,String paymentDate,String paymentStatus) {
        super(paymentId, paymentMethod, paymentAmount);
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    double newAmountCalculation(int amount){
        return super.calculatePayment(amount) * 1.1;
    }
    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
