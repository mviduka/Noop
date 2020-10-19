
public class App {

	public static void main(String[] args) {
		
		MallardDuck md = new MallardDuck();
		
		md.setBehaviour(new FlyWithWings());
		md.activateBehaviour();
		md.displayBehaviour();
		md.setBehaviour(new Quack());
		md.activateBehaviour();
		md.displayBehaviour();
		
		
	
	}

}
