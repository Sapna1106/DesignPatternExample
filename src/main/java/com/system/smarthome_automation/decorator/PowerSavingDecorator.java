package com.system.smarthome_automation.decorator;

import com.system.smarthome_automation.command.DeviceCommand;

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
