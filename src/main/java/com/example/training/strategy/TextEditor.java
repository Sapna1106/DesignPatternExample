package com.example.training.strategy;

public class TextEditor {
    private TextFormattingStrategy strategy;

    public void setFormattingStrategy(TextFormattingStrategy strategy) {
        this.strategy = strategy;
    }

    public String applyFormatting(String text) {
        return strategy.format(text);
    }
}
