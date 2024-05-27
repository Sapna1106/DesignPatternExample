package com.system.SmartHomeAutomation.strategy;

public class TempControl {
    private ITemperatureControl temperatureControl;
    public void setTemperatureControl(ITemperatureControl temperatureControl) {
        this.temperatureControl = temperatureControl;
    }

    public String apply() {
        return temperatureControl.regulate();
    }
}
