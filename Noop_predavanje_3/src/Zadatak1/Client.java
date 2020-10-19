package Zadatak1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleCalculator sc = new SimpleCalculator();
		sc.setCalculationStrategy(new PowerStrategy());	
		float res = sc.performCalculation((float)2.0, 5);	
		sc.displayResult();
		sc.setCalculationStrategy(new MultipStrategy());
		float res2 = sc.performCalculation((float)11.5, (float)3.4);
		sc.displayResult();
		
		

	}

}
