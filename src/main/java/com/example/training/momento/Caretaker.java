package com.example.training.momento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Momento> mementos = new ArrayList<>();
    private int currentIndex = -1;

    public void addMemento(Momento memento) {
        mementos.add(memento);
        currentIndex++;
    }

    public Momento undo() {
        if (currentIndex > 0) {
            currentIndex--;
            return mementos.get(currentIndex);
        } else {
            return null;
        }
    }

    public Momento redo() {
        if (currentIndex < mementos.size() - 1) {
            currentIndex++;
            return mementos.get(currentIndex);
        } else {
            return null;
        }
    }
}

