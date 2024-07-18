package com.training.assignment2.assignment2.decorator;

import com.training.assignment2.assignment2.command.ImageProcessingOperation;

import java.util.Map;

public class CostDecorator implements ImageProcessingOperation{
    private Map<ImageProcessingOperation, Double> operationCosts;

    public CostDecorator(Map<ImageProcessingOperation, Double> operationCosts) {
        this.operationCosts = operationCosts;
    }

    @Override
    public void execute() {
        for (ImageProcessingOperation operation : operationCosts.keySet()) {
            operation.execute();
        }
    }

    public double calculateTotalCost() {
        return operationCosts.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}
