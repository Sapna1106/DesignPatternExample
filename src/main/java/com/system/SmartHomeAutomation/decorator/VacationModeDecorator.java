package com.system.SmartHomeAutomation.decorator;

import com.system.SmartHomeAutomation.command.DeviceCommand;

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
