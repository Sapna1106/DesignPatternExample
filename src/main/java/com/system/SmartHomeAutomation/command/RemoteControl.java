package com.system.SmartHomeAutomation.command;

public class RemoteControl {
    private DeviceCommand deviceCommand;

    public void setCommand(DeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
    }

    public void pressButton() {
        deviceCommand.execute();
    }
}
