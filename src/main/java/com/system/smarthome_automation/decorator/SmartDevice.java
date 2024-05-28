package com.system.smarthome_automation.decorator;

import com.system.smarthome_automation.command.DeviceCommand;

public class   SmartDevice implements DeviceCommand {
    private final DeviceCommand deviceCommand;

    public SmartDevice(DeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
    }

    @Override
    public String execute() {
        return deviceCommand.execute();
    }
}


