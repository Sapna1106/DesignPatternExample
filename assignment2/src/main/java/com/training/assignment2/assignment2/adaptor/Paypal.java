package com.training.assignment2.assignment2.adaptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Paypal {
    public void sendPayment(double amount) {
        log.info("Processing payment of Rs." + amount + " through PayPal.");
    }
}