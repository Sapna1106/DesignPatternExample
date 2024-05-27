package com.platform.e_commerce.strategy;

public class StandardShipping implements ShippingMethod{
    @Override
    public double calculate(double price) {
        return price + 100;
    }
}
