package com.example.training.adaptor;

public class PayPalAdaptor implements PaymentGateway{
    private PayPal payPal;

    public PayPalAdaptor(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}
