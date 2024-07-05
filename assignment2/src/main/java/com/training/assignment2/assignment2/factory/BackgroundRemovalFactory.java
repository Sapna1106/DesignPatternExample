package com.training.assignment2.assignment2.factory;

import com.training.assignment2.assignment2.strategy.BackgroundRemovalStrategy;

public interface BackgroundRemovalFactory {
    BackgroundRemovalStrategy createBackgroundRemovalService();
}
