package com.system.SmartHomeAutomation.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Airconditioner {
    public String on() {
        return "AC on.";
    }

    public String off() {
       return "AC off.";
    }

    public String temperature(int temp){
        return "Temperature of AC: " + temp;
    }
}
