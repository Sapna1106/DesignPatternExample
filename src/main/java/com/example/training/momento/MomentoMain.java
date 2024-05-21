package com.example.training.momento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MomentoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        originator.setState("State 2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.getStateFromMemento(caretaker.undo());
        log.info("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.redo());
        log.info("Current State: " + originator.getState());
    }
}
