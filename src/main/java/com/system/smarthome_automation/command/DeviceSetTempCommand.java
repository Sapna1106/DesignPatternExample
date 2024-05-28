package com.system.smarthome_automation.command;

import com.system.smarthome_automation.adaptor.DeviceAdaptor;

public class DeviceSetTempCommand implements DeviceCommand{
    private DeviceAdaptor deviceAdaptor;
    private int temperature;

    public DeviceSetTempCommand(DeviceAdaptor deviceAdaptor, int temperature) {
        this.deviceAdaptor = deviceAdaptor;
        this.temperature = temperature;
    }

    @Override
    public String execute() {
//        return deviceAdaptor.setTemp(temperature);
        return null;
    }
}
