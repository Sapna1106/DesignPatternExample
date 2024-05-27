package com.system.SmartHomeAutomation.decorator;

import com.system.SmartHomeAutomation.command.DeviceCommand;

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


