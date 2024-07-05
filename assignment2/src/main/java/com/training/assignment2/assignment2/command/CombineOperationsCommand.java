package com.training.assignment2.assignment2.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CombineOperationsCommand implements ImageProcessingOperation {
    private ImageProcessingOperation operation1;
    private ImageProcessingOperation operation2;

    public CombineOperationsCommand(ImageProcessingOperation operation1, ImageProcessingOperation operation2) {
        this.operation1 = operation1;
        this.operation2 = operation2;
    }

    @Override
    public void execute() {

        log.info("Combined operations: " + operation1.getClass().getSimpleName() +
                " followed by " + operation2.getClass().getSimpleName());

        // Execute operation 1
        operation1.execute();

        // Execute operation 2
        operation2.execute();

        // Additional logic to combine operations if needed

    }
}
