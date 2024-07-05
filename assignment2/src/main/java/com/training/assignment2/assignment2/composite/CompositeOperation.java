package com.training.assignment2.assignment2.composite;

import com.training.assignment2.assignment2.command.ImageProcessingOperation;

import java.util.ArrayList;
import java.util.List;

public class CompositeOperation implements ImageProcessingOperation {
    private List<ImageProcessingOperation> operations = new ArrayList<>();

    public void addOperation(ImageProcessingOperation operation) {
        operations.add(operation);
    }

    @Override
    public void execute() {
        for (ImageProcessingOperation operation : operations) {
            operation.execute();
        }
    }
}
