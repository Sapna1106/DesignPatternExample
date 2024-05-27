package com.platform.e_commerce.decorator;

public abstract class ProductDecorator extends Product{
    protected Product product;

    public ProductDecorator(Product product) {
        super(product.getName(), product.getPrice());
        this.product = product;
    }

    public abstract String getName();

    public abstract double getPrice();
}
