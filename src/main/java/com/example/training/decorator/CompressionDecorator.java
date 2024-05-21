package com.example.training.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        return "File compress: " + data;
    }

    private String decompress(String data) {
        return "File decompress: " + data;
    }
}
