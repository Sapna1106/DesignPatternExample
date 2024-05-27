package com.platform.e_commerce.adaptor;

public class PaypalAdaptor implements PaymentAdaptor {
    private PayPal payPal;

    public PaypalAdaptor(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void paymentGateway(double amount) {
        payPal.sendPayment(amount);
    }

}
