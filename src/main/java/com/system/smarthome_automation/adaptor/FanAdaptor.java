package com.system.smarthome_automation.adaptor;

import com.system.smarthome_automation.command.Fan;

public class FanAdaptor implements DeviceAdaptor{
    private Fan fan;

    public FanAdaptor(Fan fan) {
        this.fan = fan;
    }

    @Override
    public String on() {
        return fan.on();
    }

    @Override
    public String off() {
        return fan.off();
    }
}
