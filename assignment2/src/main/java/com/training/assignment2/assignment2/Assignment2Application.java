package com.training.assignment2.assignment2;

import com.training.assignment2.assignment2.adaptor.PaymentAdaptor;
import com.training.assignment2.assignment2.adaptor.Paypal;
import com.training.assignment2.assignment2.adaptor.PaypalAdaptor;
import com.training.assignment2.assignment2.command.*;
import com.training.assignment2.assignment2.composite.CompositeOperation;
import com.training.assignment2.assignment2.command.ImageProcessingOperation;
import com.training.assignment2.assignment2.composite.SingleOperation;
import com.training.assignment2.assignment2.decorator.CostDecorator;
import com.training.assignment2.assignment2.factory.AIDrivenFactory;
import com.training.assignment2.assignment2.factory.AIDrivenFactoryB;
import com.training.assignment2.assignment2.factory.BackgroundRemovalFactory;
import com.training.assignment2.assignment2.factory.BackgroundRemovalFactoryA;
import com.training.assignment2.assignment2.observer.ImageProcessingMonitor;
import com.training.assignment2.assignment2.observer.LogMonitor;
import com.training.assignment2.assignment2.strategy.AIDrivenStrategy;
import com.training.assignment2.assignment2.strategy.BackgroundRemovalStrategy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) {

		// Command pattern
		ImageProcessingOperation resizeCommand = new ResizeCommand("image.jpg", 800, 600);
		resizeCommand.execute();

		ImageProcessingOperation extendCommand = new ExtendCommand("image.jpg", "right", 300);
		extendCommand.execute();

		ImageProcessingOperation cropCommand = new CropCommand("image.jpg", 10, 10, 50, 50);
		cropCommand.execute();

		ImageProcessingOperation removeBgCommand = new RemoveBackgroundCommand("image.jpg");
		removeBgCommand.execute();

		ImageProcessingOperation storeGoogleDriveCommand = new StoreCommand("google-drive", "/MyImages", "result.jpg", "image.jpg");
		storeGoogleDriveCommand.execute();

		ImageProcessingOperation storeS3Command = new StoreCommand("aws-s3", "mybucket", "result.jpg", "image.jpg");
		storeS3Command.execute();

		ImageProcessingOperation combineOperationsCommand = new CombineOperationsCommand(removeBgCommand, resizeCommand);
		combineOperationsCommand.execute();

		// Strategy pattern
		BackgroundRemovalFactory bgRemovalServiceFactoryA = new BackgroundRemovalFactoryA();
		BackgroundRemovalStrategy bgRemovalServiceA = bgRemovalServiceFactoryA.createBackgroundRemovalService();
		bgRemovalServiceA.removeBackground("image.jpg");

		AIDrivenFactory aiExtensionServiceFactoryB = new AIDrivenFactoryB();
		AIDrivenStrategy aiExtensionServiceB = aiExtensionServiceFactoryB.createAIDrivenExtensionService();
		aiExtensionServiceB.extendImage("image.jpg", "right", 300);

		// Observer pattern
		ImageProcessingMonitor monitor = new ImageProcessingMonitor();
		monitor.operationStatusChanged("Resizing image", "In progress");

		LogMonitor logMonitor = new LogMonitor();
		monitor.addObserver(logMonitor);

		// Factory pattern
		ImageProcessingOperation bgRemovalOperation = new SingleOperation(new RemoveBackgroundCommand("image.jpg"));
		ImageProcessingOperation aiExtensionOperation = new SingleOperation(new ExtendCommand("image.jpg", "right", 300));



		// Composite pattern
		CompositeOperation compositeOperation = new CompositeOperation();
		compositeOperation.addOperation(new SingleOperation(new RemoveBackgroundCommand("image.jpg")));
		compositeOperation.execute();
		compositeOperation.addOperation(new SingleOperation(new ResizeCommand("image.jpg", 800, 600)));

		// Decorator pattern
		ImageProcessingOperation operationWithCost = new CostDecorator(bgRemovalOperation, 10.0);
		operationWithCost.execute();

		// Adaptor pattern

		PaymentAdaptor paymentAdapter = new PaypalAdaptor(new Paypal());
		paymentAdapter.paymentGateway(50.0);

	}

}
