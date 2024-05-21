package com.example.training.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
