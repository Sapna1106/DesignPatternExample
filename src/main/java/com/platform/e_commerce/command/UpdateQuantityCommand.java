package com.platform.e_commerce.command;

import com.platform.e_commerce.decorator.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UpdateQuantityCommand implements CheckoutCommand{
    private String productName;
    private int newQuantity;

    public UpdateQuantityCommand(String productName, int newQuantity) {
        this.productName = productName;
        this.newQuantity = newQuantity;
    }
    @Override
    public void execute() {
        log.info("Quantity of product:" + productName + "increase to " +newQuantity);
    }
}
