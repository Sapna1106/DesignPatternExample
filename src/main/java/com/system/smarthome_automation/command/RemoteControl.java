package com.system.smarthome_automation.command;

public class RemoteControl {
    private DeviceCommand deviceCommand;

    public void setCommand(DeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
    }

    public String pressButton() {
        return deviceCommand.execute();
    }
}
