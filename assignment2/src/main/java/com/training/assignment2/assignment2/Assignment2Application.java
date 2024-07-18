package com.training.assignment2.assignment2;

import com.training.assignment2.assignment2.adaptor.PaymentAdaptor;
import com.training.assignment2.assignment2.adaptor.Paypal;
import com.training.assignment2.assignment2.adaptor.PaypalAdaptor;
import com.training.assignment2.assignment2.command.*;
import com.training.assignment2.assignment2.composite.CompositeOperation;
import com.training.assignment2.assignment2.command.ImageProcessingOperation;
import com.training.assignment2.assignment2.composite.SingleOperation;
import com.training.assignment2.assignment2.decorator.CostDecorator;
import com.training.assignment2.assignment2.factory.BackgroundRemovalFactory;
import com.training.assignment2.assignment2.factory.BackgroundRemovalFactoryA;
import com.training.assignment2.assignment2.observer.ImageProcessingMonitor;
import com.training.assignment2.assignment2.observer.LogMonitor;
import com.training.assignment2.assignment2.strategy.BackgroundRemovalStrategy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) {

		ImageProcessingMonitor monitor = new ImageProcessingMonitor();
		LogMonitor logMonitor = new LogMonitor();
		monitor.addObserver(logMonitor);

		// Command pattern
		ImageProcessingOperation resizeCommand = new ResizeCommand("image.jpg", 800, 600, monitor);
		resizeCommand.execute();

		ImageProcessingOperation extendCommand = new ExtendCommand("image.jpg", "right", 300, monitor);
		extendCommand.execute();

		ImageProcessingOperation cropCommand = new CropCommand("image.jpg", 10, 10, 50, 50, monitor);
		cropCommand.execute();

		// Strategy pattern
		System.out.println("-----------------------------------------------");
		BackgroundRemovalFactory bgRemovalServiceFactoryA = new BackgroundRemovalFactoryA();
		BackgroundRemovalStrategy bgRemovalServiceA = bgRemovalServiceFactoryA.createBackgroundRemovalService();
		ImageProcessingOperation removeBgCommand = new RemoveBackgroundCommand("image.jpg", bgRemovalServiceA, monitor);
		removeBgCommand.execute();

//		// Composite pattern
		System.out.println("-----------------------------------------------");
		CompositeOperation compositeOperation = new CompositeOperation();
		compositeOperation.addOperation(new SingleOperation(new ResizeCommand("image.jpg", 800, 600, monitor)));
		compositeOperation.addOperation(cropCommand);
		compositeOperation.execute();

		// Decorator pattern
		System.out.println("-----------------------------------------------");
		Map<ImageProcessingOperation, Double> operationCosts = new HashMap<>();
		operationCosts.put(removeBgCommand, 15.0);
		operationCosts.put(resizeCommand, 10.0);

		CostDecorator costDecorator = new CostDecorator(operationCosts);
		costDecorator.execute();

		double totalCost = costDecorator.calculateTotalCost();
		System.out.println("Total cost of operations: " + totalCost);

		// Adaptor pattern
		PaymentAdaptor paymentAdapter = new PaypalAdaptor(new Paypal());

		System.out.println("-----------------------------------------------");
		ImageProcessingOperation storeGoogleDriveCommand = new StoreCommand("google-drive", "/MyImages", "result.jpg", "image.jpg", monitor);
		storeGoogleDriveCommand.execute();

		ImageProcessingOperation storeS3Command = new StoreCommand("aws-s3", "mybucket", "result.jpg", "image.jpg", monitor);
		storeS3Command.execute();

	}

}
