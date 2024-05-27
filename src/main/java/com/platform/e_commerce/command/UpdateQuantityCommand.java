package com.platform.e_commerce.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UpdateQuantityCommand implements CheckoutCommand{
    private int productId;
    private int newQuantity;

    public UpdateQuantityCommand(int productId, int newQuantity) {
        this.productId = productId;
        this.newQuantity = newQuantity;
    }
    @Override
    public void execute() {
        log.info("Quantity of product:" +productId + "increase to " +newQuantity);
    }
}
