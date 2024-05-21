package com.example.training.adaptor;

public class StripeAdaptor implements PaymentGateway{
    private Stripe stripe;

    public StripeAdaptor(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}
