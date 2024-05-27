package com.system.SmartHomeAutomation.command;

public class BulbOnCommand implements DeviceCommand{
    private Bulb bulb;

    public BulbOnCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public String execute() {
       return bulb.on();
    }
}
