package com.system.SmartHomeAutomation.command;

public class ACOnCommand implements DeviceCommand{
    private Airconditioner airconditioner;
    public ACOnCommand(Airconditioner airconditioner){
        this.airconditioner=airconditioner;
    }
    @Override
    public String execute() {
        return airconditioner.on();
    }
}
