package com.system.SmartHomeAutomation.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fan {

    private static Long speed;
    public String on() {
        return "The fan is on.";
    }

    public String off() {
        return "The fan is off.";
    }

    public String speedInc(){
        return "Speed of fan: " + (speed++);
    }

    public String speedDec(){
        return "Speed of fan: " + (speed--);
    }
}
