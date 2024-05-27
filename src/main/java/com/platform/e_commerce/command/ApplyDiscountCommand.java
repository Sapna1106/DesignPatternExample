package com.platform.e_commerce.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApplyDiscountCommand implements CheckoutCommand{
    private int productId;

    public ApplyDiscountCommand(int productId) {
        this.productId = productId;
    }
    @Override
    public void execute() {
        log.info("Apply discount on product:" +productId);
    }
}
