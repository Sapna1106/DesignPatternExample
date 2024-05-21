package com.example.training.adaptor;

public class AdaptorMain {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();
        Square square = new Square();

        PaymentGateway payPalAdapter = new PayPalAdaptor(payPal);
        PaymentGateway stripeAdapter = new StripeAdaptor(stripe);
        PaymentGateway squareAdapter = new SquareAdaptor(square);

        processPayment(payPalAdapter, 100.00);
        processPayment(stripeAdapter, 200.00);
        processPayment(squareAdapter, 300.00);

    }
    private static void processPayment(PaymentGateway paymentGateway, double amount) {
        paymentGateway.processPayment(amount);
    }

}
