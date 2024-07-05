package com.training.assignment2.assignment2.observer;

public interface ImageOperation {
    void addObserver(ImageOperationObserver observer);
    void removeObserver(ImageOperationObserver observer);
    void notifyObservers(String message);
}
