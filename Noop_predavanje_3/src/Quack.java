
public class Quack implements DuckBehaviour {

	@Override
	public void performSomeDuckAction() {
		
		System.out.println(this.getClass().getSimpleName()+"  Quack quack...");
		
	}

	
	
}
