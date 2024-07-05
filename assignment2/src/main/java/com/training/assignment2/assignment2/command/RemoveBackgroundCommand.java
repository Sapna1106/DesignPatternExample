package com.training.assignment2.assignment2.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveBackgroundCommand implements ImageProcessingOperation {
    private String filename;

    public RemoveBackgroundCommand(String filename) {
        this.filename = filename;
    }

    @Override
    public void execute() {
        log.info("Removing background of " + filename);
    }
}
