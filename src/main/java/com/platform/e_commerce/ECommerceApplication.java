package com.platform.e_commerce;

import com.platform.e_commerce.adaptor.PayPal;
import com.platform.e_commerce.adaptor.PaymentAdaptor;
import com.platform.e_commerce.adaptor.PaypalAdaptor;
import com.platform.e_commerce.command.ApplyDiscountCommand;
import com.platform.e_commerce.command.CheckoutCommand;
import com.platform.e_commerce.command.RemoveCartItem;
import com.platform.e_commerce.command.UpdateQuantityCommand;
import com.platform.e_commerce.decorator.GiftwrapDecorator;
import com.platform.e_commerce.decorator.Product;
import com.platform.e_commerce.decorator.SpecialPackagingDecorator;
import com.platform.e_commerce.strategy.InternationalShipping;
import com.platform.e_commerce.strategy.ShippingMethod;
import com.platform.e_commerce.strategy.StandardShipping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
//@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ECommerceApplication.class, args);
		Product product = new Product("Head phones",2000,1);
		CheckoutCommand applyDiscount = new ApplyDiscountCommand(product);
		applyDiscount.execute();
		CheckoutCommand updateQuantityCommand = new UpdateQuantityCommand(product.getName(), 5);
		updateQuantityCommand.execute();
		CheckoutCommand removeCartItem = new RemoveCartItem(product.getName());
		removeCartItem.execute();
		Product giftwrapDecorator= new GiftwrapDecorator(product);
		Product specialPackagingDecorator = new SpecialPackagingDecorator(giftwrapDecorator);
		log.info("After applying giftwrap and special packaging on product: " +specialPackagingDecorator.getName()+ " and the price of product will be " +specialPackagingDecorator.getPrice());

		ShippingMethod shippingMethod = new StandardShipping();
		double shippingCost = shippingMethod.calculate(product.getPrice());
		log.info("After applying Standard Shipping Cost on product. Final cost will be: " + shippingCost);
//		ShippingMethod internationalShipping = new InternationalShipping();
//		shippingCost = internationalShipping.calculate(product.getPrice());
//		log.info("After applying Standard Shipping Cost on product. Final cost will be: " + shippingCost);

		PaymentAdaptor paymentAdapter = new PaypalAdaptor(new PayPal());
		paymentAdapter.paymentGateway(shippingCost);
	}

}
