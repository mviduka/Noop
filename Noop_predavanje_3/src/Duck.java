
public abstract class Duck {
	
	protected DuckBehaviour db;
	
	protected void setBehaviour(DuckBehaviour db) {
		this.db = db;
		
	}
	
	
	public abstract void displayBehaviour();
	
	protected void activateBehaviour() {
		
		this.db.performSomeDuckAction();
	}
	
	
	

}
