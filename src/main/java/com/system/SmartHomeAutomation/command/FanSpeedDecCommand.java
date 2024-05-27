package com.system.SmartHomeAutomation.command;

public class FanSpeedDecCommand implements DeviceCommand{
    private Fan fan;
    public FanSpeedDecCommand(Fan fan){
        this.fan=fan;
    }
    @Override
    public String execute() {
        return fan.speedDec();
    }
}
