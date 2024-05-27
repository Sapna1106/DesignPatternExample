package com.system.SmartHomeAutomation.command;

public class FanSpeedIncCommand implements DeviceCommand{
    private Fan fan;
    public FanSpeedIncCommand(Fan fan){
        this.fan=fan;
    }
    @Override
    public String execute() {
        return fan.speedInc();
    }
}
