package com.system.smarthome_automation.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EcoFriendlyStrategy implements ITemperatureControl {
    @Override
    public String regulate() {
        return "Temperature regulate in eco-friendly mode.";
    }
}
