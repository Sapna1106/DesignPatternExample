package com.training.assignment2.assignment2.factory;

import com.training.assignment2.assignment2.strategy.BackgroundRemoval2;
import com.training.assignment2.assignment2.strategy.BackgroundRemovalStrategy;

public class BackgroundRemovalFactoryB implements BackgroundRemovalFactory{
    @Override
    public BackgroundRemovalStrategy createBackgroundRemovalService() {
        return new BackgroundRemoval2();
    }
}
