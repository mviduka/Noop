package Zadatak1;

public abstract class Calculator {
	
	
	protected CalculationStrategy cs;
	protected float result;
	
	protected void setCalculationStrategy(CalculationStrategy cs) {
		
		this.cs = cs;
	}
	
	public abstract void displayResult();
	
	protected float performCalculation(float a,float b) {
		
		result = cs.calculation(a, b);
		return result;
	}

}
