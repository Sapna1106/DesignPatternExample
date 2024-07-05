package com.training.assignment2.assignment2.decorator;

import com.training.assignment2.assignment2.command.ImageProcessingOperation;

public class CostDecorator implements ImageProcessingOperation{
    private ImageProcessingOperation operation;
    private double cost;

    public CostDecorator(ImageProcessingOperation operation, double cost) {
        this.operation = operation;
        this.cost = cost;
    }

    @Override
    public void execute() {
        operation.execute();
    }
//
//    public double getCost() {
//        return cost;
//    }
}
