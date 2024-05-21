package com.example.training.adaptor;

public class SquareAdaptor implements PaymentGateway{
    private Square square;

    public SquareAdaptor(Square square) {
        this.square = square;
    }

    @Override
    public void processPayment(double amount) {
        square.processTransaction(amount);
    }
}
