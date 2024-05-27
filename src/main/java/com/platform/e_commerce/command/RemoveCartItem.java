package com.platform.e_commerce.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveCartItem implements CheckoutCommand{
    private String productName;

    public RemoveCartItem(String productName) {
        this.productName = productName;
    }
    @Override
    public void execute() {
        log.info( productName+ " item removed from cart");
    }
}
