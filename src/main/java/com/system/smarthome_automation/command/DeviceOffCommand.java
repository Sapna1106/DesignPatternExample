package com.system.smarthome_automation.command;

import com.system.smarthome_automation.adaptor.DeviceAdaptor;

public class DeviceOffCommand implements DeviceCommand{
    private DeviceAdaptor deviceAdaptor;

    public DeviceOffCommand(DeviceAdaptor deviceAdaptor) {
        this.deviceAdaptor = deviceAdaptor;
    }

    @Override
    public String execute() {
        return deviceAdaptor.off();
    }
}
