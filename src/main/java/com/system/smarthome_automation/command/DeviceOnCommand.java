package com.system.smarthome_automation.command;

import com.system.smarthome_automation.adaptor.DeviceAdaptor;

public class DeviceOnCommand implements DeviceCommand{
    private DeviceAdaptor deviceAdaptor;

    public DeviceOnCommand(DeviceAdaptor deviceAdaptor) {
        this.deviceAdaptor = deviceAdaptor;
    }

    @Override
    public String execute() {
        return deviceAdaptor.on();
    }
}
