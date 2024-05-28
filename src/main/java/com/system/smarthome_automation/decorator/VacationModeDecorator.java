package com.system.smarthome_automation.decorator;

import com.system.smarthome_automation.command.DeviceCommand;

public class VacationModeDecorator extends SmartDevice{
    public VacationModeDecorator(DeviceCommand deviceCommand) {
        super(deviceCommand);
    }

    @Override
    public String execute() {
        return vacationMode(super.execute());
    }

    private String vacationMode(String data){
        return "vacation mode is on";
    }
}
