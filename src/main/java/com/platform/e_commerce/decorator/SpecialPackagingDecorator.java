package com.platform.e_commerce.decorator;

public class SpecialPackagingDecorator extends ProductDecorator{
    public SpecialPackagingDecorator(Product product) {
        super(product);
    }

    @Override
    public String getName() {
        return product.getName() + " + Special Packaging";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 30.00;
    }
}
