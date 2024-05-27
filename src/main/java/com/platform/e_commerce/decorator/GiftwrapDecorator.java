package com.platform.e_commerce.decorator;

public class GiftwrapDecorator extends ProductDecorator{
    public GiftwrapDecorator(Product product) {
        super(product);
    }

    @Override
    public String getName() {
        return product.getName() + " + Gift Wrapping";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 50.00;
    }
}
