package com.platform.e_commerce.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveCartItem implements CheckoutCommand{
    private int productId;

    public RemoveCartItem(int productId) {
        this.productId = productId;
    }
    @Override
    public void execute() {
        log.info( productId+ " item removed from cart");
    }
}
