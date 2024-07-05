package com.training.assignment2.assignment2.adaptor;

public class PaypalAdaptor implements PaymentAdaptor {
    private Paypal payPal;

    public PaypalAdaptor(Paypal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void paymentGateway(double amount) {
        payPal.sendPayment(amount);
    }

}
