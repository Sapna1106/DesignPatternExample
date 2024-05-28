package com.system.smarthome_automation.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickCoolStrategy implements ITemperatureControl {
    @Override
    public String regulate() {
        return "Regulating temperature in quick cool mode";
    }
}
