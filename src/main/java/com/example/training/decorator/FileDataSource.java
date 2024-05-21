package com.example.training.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileDataSource implements DataSource{
    private final String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void writeData(String data) {
        log.info("Data write in file");
    }

    @Override
    public String readData() {
        log.info("Data read from file");
        return "Read file";
    }
}
