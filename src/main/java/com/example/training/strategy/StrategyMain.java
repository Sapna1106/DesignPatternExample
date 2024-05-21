package com.example.training.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        String text = "Hello, world!";

        editor.setFormattingStrategy(new BoldFormatting());
        log.info(editor.applyFormatting(text));

        editor.setFormattingStrategy(new ItalicFormatting());
        log.info(editor.applyFormatting(text));

        editor.setFormattingStrategy(new UnderlineFormatting());
        log.info(editor.applyFormatting(text));
    }
}
