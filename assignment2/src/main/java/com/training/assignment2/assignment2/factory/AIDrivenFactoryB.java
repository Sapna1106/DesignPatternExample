package com.training.assignment2.assignment2.factory;

import com.training.assignment2.assignment2.strategy.AIDriven2;
import com.training.assignment2.assignment2.strategy.AIDrivenStrategy;

public class AIDrivenFactoryB implements AIDrivenFactory{
    @Override
    public AIDrivenStrategy createAIDrivenExtensionService() {
        return new AIDriven2();
    }
}
