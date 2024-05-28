package com.system.smarthome_automation.adaptor;

import com.system.smarthome_automation.command.Bulb;

public class BulbAdaptor implements DeviceAdaptor{
    private Bulb bulb;

    public BulbAdaptor(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public String on() {
        return bulb.on();
    }

    @Override
    public String off() {
        return bulb.off();
    }
}
