package com.system.SmartHomeAutomation.command;

public class BulbOffCommand implements DeviceCommand{
    private Bulb bulb;

    public BulbOffCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public String execute() {
       return bulb.off();
    }
}
