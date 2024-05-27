package com.system.SmartHomeAutomation.command;

public class ACOffCommand implements DeviceCommand{
    private Airconditioner airconditioner;
    public ACOffCommand(Airconditioner airconditioner){
        this.airconditioner=airconditioner;
    }
    @Override
    public String execute() {
       return airconditioner.off();
    }
}
