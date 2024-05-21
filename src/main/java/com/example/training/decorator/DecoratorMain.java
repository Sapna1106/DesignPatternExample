package com.example.training.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorMain {
    public static void main(String[] args) {
        String data = "Hello everyone!";
        DataSource encode = new EncryptionDecorator(new CompressionDecorator(new FileDataSource(data)));
        encode.readData();
        encode.writeData(data);
    }
}
