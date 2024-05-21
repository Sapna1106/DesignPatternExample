package com.example.training.adaptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square {
    public void processTransaction(double amount) {
       log.info("Processing payment of $" + amount + " through Square.");
    }
}
