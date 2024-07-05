package com.training.assignment2.assignment2.composite;


import com.training.assignment2.assignment2.command.ImageProcessingOperation;

public class SingleOperation implements ImageProcessingOperation {
    private ImageProcessingOperation command;

    public SingleOperation(ImageProcessingOperation command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.execute();
    }
}
