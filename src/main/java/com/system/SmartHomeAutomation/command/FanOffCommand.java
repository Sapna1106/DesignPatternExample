package com.system.SmartHomeAutomation.command;

public class FanOffCommand implements DeviceCommand{
    private Fan fan;
    public FanOffCommand(Fan fan){
        this.fan=fan;
    }
    @Override
    public String execute() {
        return fan.on();
    }
}
