package com.system.SmartHomeAutomation.command;

public class ACTempCommand implements DeviceCommand{
    private Airconditioner airconditioner;
    private int temperature;
    public ACTempCommand(Airconditioner airconditioner, int temperature){
        this.airconditioner=airconditioner;
        this.temperature=temperature;
    }
    @Override
    public String execute() {
        return airconditioner.temperature(temperature);
    }
}
