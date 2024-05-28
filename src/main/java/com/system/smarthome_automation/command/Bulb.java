package com.system.smarthome_automation.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bulb {
    public String on() {
        return "The bulb is on.";
    }

    public String off() {
        return "The bulb is off.";
    }
}
