package com.platform.e_commerce.strategy;

public class StandardShipping implements ShippingMethod{
    @Override
    public double calculate(double productPrice) {
        return productPrice + 100;
    }
}
