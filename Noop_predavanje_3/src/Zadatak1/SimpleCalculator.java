package Zadatak1;

public class SimpleCalculator extends Calculator{

	@Override
	public void displayResult() {
		
	System.out.println("Strategy calculation "  + this.cs.getClass().getSimpleName());	
	
	System.out.println("Result "+ this.result);
	
	
	}
	
	
	

}
