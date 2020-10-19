package Zadatak2;

public class WayOfPay extends Paying {

	@Override
	public void displayPaymanthMethod() {
		System.out.println("Placeno je sa .." +this.ps.getClass().getSimpleName());
		
	}
	
	

}
