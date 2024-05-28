package com.system.smarthome_automation.adaptor;

import com.system.smarthome_automation.command.Airconditioner;

public class ACAdaptor implements DeviceAdaptor{
    private Airconditioner airConditioner;

    public ACAdaptor(Airconditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public String on() {
        return airConditioner.on();
    }

    @Override
    public String off() {
        return airConditioner.off();
    }
    public String setTemp(int temp) {
        return airConditioner.temperature(temp);
    }
}
