package com.example.training.strategy;

public class BoldFormatting implements TextFormattingStrategy{
    @Override
    public String format(String text) {
        return "<b>" + text + "</b>";
    }
}
