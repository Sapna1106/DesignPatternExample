package com.system.SmartHomeAutomation.command;

public class FanOnCommand implements DeviceCommand{
    private Fan fan;
    public FanOnCommand(Fan fan){
        this.fan=fan;
    }
    @Override
    public String execute() {
        return fan.on();
    }
}
