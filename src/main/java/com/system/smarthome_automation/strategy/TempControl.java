package com.system.smarthome_automation.strategy;

public class TempControl {
    private ITemperatureControl temperatureControl;
    public void setTemperatureControl(ITemperatureControl temperatureControl) {
        this.temperatureControl = temperatureControl;
    }

    public String apply() {
        return temperatureControl.regulate();
    }
}
