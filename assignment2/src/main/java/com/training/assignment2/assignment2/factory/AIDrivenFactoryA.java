package com.training.assignment2.assignment2.factory;

import com.training.assignment2.assignment2.strategy.AIDriven1;
import com.training.assignment2.assignment2.strategy.AIDrivenStrategy;

public class AIDrivenFactoryA implements AIDrivenFactory{
    @Override
    public AIDrivenStrategy createAIDrivenExtensionService() {
        return new AIDriven1();
    }
}
