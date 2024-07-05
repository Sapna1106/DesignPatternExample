package com.training.assignment2.assignment2.factory;

import com.training.assignment2.assignment2.strategy.BackgroundRemoval1;
import com.training.assignment2.assignment2.strategy.BackgroundRemovalStrategy;

public class BackgroundRemovalFactoryA implements BackgroundRemovalFactory{
    @Override
    public BackgroundRemovalStrategy createBackgroundRemovalService() {
        return new BackgroundRemoval1();
    }
}
