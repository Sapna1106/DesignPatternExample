package com.training.assignment2.assignment2.adaptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stripe {
    public void makePayment(double amount) {
        log.info("Processing payment of Rs." + amount + " through Stripe.");
    }
}
