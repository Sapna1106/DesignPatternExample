package com.training.assignment2.assignment2.observer;

import java.util.ArrayList;
import java.util.List;

public class ImageProcessingMonitor implements ImageOperation{
    private List<ImageOperationObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(ImageOperationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ImageOperationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (ImageOperationObserver observer : observers) {
            observer.update(message);
        }
    }

    public void operationStatusChanged(String operationName, String status) {
        notifyObservers(operationName + ": " + status);
    }
}
