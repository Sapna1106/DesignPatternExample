package com.platform.e_commerce.adaptor;

public class StripeAdaptor implements PaymentAdaptor {
    private Stripe stripe;

    public StripeAdaptor(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void paymentGateway(double amount) {
        stripe.makePayment(amount);
    }
}
