package Zadatak2;

public class App {

	public static void main(String[] args) {
		
		
		WayOfPay wop = new WayOfPay();
		wop.setPaymentStrategy(new CardPay());
		wop.displayPaymanthMethod();
		wop.setPaymentStrategy (new PayByDelivery());
		wop.displayPaymanthMethod();
		wop.setPaymentStrategy(new Paypal());
		wop.displayPaymanthMethod();
		wop.setPaymentStrategy(new Bitcoin());
		wop.displayPaymanthMethod();
		
		
		
		
		
			
		
		
	}

}
