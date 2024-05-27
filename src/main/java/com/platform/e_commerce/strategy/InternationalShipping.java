package com.platform.e_commerce.strategy;

public class InternationalShipping implements ShippingMethod{
    @Override
    public double calculate(double price) {
        return price + 500;
    }
}
