package com.example.training.strategy;

public class UnderlineFormatting implements TextFormattingStrategy{
    @Override
    public String format(String text) {
        return "<u>" + text + "</u>";
    }
}
