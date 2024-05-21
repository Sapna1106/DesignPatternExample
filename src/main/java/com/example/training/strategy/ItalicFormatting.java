package com.example.training.strategy;

public class ItalicFormatting implements TextFormattingStrategy{
    @Override
    public String format(String text) {
        return "<i>" + text + "</i>";
    }
}
