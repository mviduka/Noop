package Zadatak2;

public abstract class Paying {
	
	protected PaymentStrategy ps;
	
	protected void setPaymentStrategy(PaymentStrategy ps) {
		
		this.ps =ps;
	}
	
	public abstract void displayPaymanthMethod();
	
	protected void performPaying() {
		
		
	}
	
	
	
	
	

}
