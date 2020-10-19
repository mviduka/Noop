
public class FlyWithWings implements DuckBehaviour {

	@Override
	public void performSomeDuckAction() {
		System.out.println(this.getClass().getSimpleName()+ "  flying...");
		
	}

}
