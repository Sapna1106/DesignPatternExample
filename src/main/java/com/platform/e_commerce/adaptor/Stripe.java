package com.platform.e_commerce.adaptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stripe {
    public void makePayment(double amount) {
        log.info("Processing payment of $" + amount + " through Stripe.");
    }
}
