package com.platform.e_commerce.command;

import com.platform.e_commerce.decorator.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApplyDiscountCommand implements CheckoutCommand{
    private String productName;

    public ApplyDiscountCommand(Product product) {
        this.productName = product.getName();
    }
    @Override
    public void execute() {
        log.info("Apply discount on product: " +productName);
    }
}
