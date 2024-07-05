package com.training.assignment2.assignment2.factory;

import com.training.assignment2.assignment2.strategy.AIDrivenStrategy;

public interface AIDrivenFactory {
    AIDrivenStrategy createAIDrivenExtensionService();
}
