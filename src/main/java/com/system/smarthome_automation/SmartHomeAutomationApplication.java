package com.system.smarthome_automation;

import com.system.smarthome_automation.adaptor.ACAdaptor;
import com.system.smarthome_automation.adaptor.BulbAdaptor;
import com.system.smarthome_automation.adaptor.DeviceAdaptor;
import com.system.smarthome_automation.adaptor.FanAdaptor;
import com.system.smarthome_automation.command.Airconditioner;
import com.system.smarthome_automation.command.Bulb;
import com.system.smarthome_automation.command.DeviceCommand;
import com.system.smarthome_automation.command.DeviceOffCommand;
import com.system.smarthome_automation.command.DeviceOnCommand;
import com.system.smarthome_automation.command.Fan;
import com.system.smarthome_automation.command.RemoteControl;
import com.system.smarthome_automation.decorator.PowerSavingDecorator;
import com.system.smarthome_automation.decorator.VacationModeDecorator;
import com.system.smarthome_automation.strategy.EcoFriendlyStrategy;
import com.system.smarthome_automation.strategy.QuickCoolStrategy;
import com.system.smarthome_automation.strategy.TempControl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SmartHomeAutomationApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SmartHomeAutomationApplication.class, args);

		Bulb bulb = new Bulb();
		Fan fan = new Fan();
		Airconditioner airConditioner = new Airconditioner();

		DeviceAdaptor bulbAdaptor = new BulbAdaptor(bulb);
		DeviceAdaptor fanAdaptor = new FanAdaptor(fan);
		DeviceAdaptor acAdaptor = new ACAdaptor(airConditioner);

		DeviceCommand bulbOnCommand = new DeviceOnCommand(bulbAdaptor);
		DeviceCommand bulbOffCommand = new DeviceOffCommand(bulbAdaptor);

		DeviceCommand fanOnCommand = new DeviceOnCommand(fanAdaptor);
		DeviceCommand fanOffCommand = new DeviceOffCommand(fanAdaptor);

		DeviceCommand acOnCommand = new DeviceOnCommand(acAdaptor);
		DeviceCommand acOffCommand = new DeviceOffCommand(acAdaptor);

		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(bulbOnCommand);
		log.info(remoteControl.pressButton());

		remoteControl.setCommand(bulbOffCommand);
		log.info(remoteControl.pressButton());

		remoteControl.setCommand(fanOnCommand);
		log.info(remoteControl.pressButton());

		remoteControl.setCommand(fanOffCommand);
		log.info(remoteControl.pressButton());

		remoteControl.setCommand(acOnCommand);
		log.info(remoteControl.pressButton());

		remoteControl.setCommand(acOffCommand);
		log.info(remoteControl.pressButton());

		DeviceCommand decoratedBulbOn = new PowerSavingDecorator(bulbOnCommand);
		log.info(decoratedBulbOn.execute());

		DeviceCommand decoratedBulbOff = new VacationModeDecorator(bulbOffCommand);
		log.info(decoratedBulbOff.execute());

		TempControl tempControl = new TempControl();
		tempControl.setTemperatureControl(new EcoFriendlyStrategy());
		log.info(tempControl.apply());

		tempControl.setTemperatureControl(new QuickCoolStrategy());
		log.info(tempControl.apply());
	}

}
