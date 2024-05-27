package com.system.SmartHomeAutomation.decorator;

import com.system.SmartHomeAutomation.command.DeviceCommand;

public class PowerSavingDecorator extends SmartDevice{
    public PowerSavingDecorator(DeviceCommand deviceCommand) {
        super(deviceCommand);
    }

    @Override
    public String execute() {
        return powerSaving(super.execute());
    }

    private String powerSaving(String data){
        return "power saving mode is on";
    }
}
