
public class Car {
	private String brand;
	private String type;
	private float speed;
	private Engine engine;
	
	private Engine getEngine() {
		if (this.engine == null) {
			this.engine =new Engine();//crea el objeto Engine y soluciona el problema cuando es null
		}
		return this.engine;
	}
	
		public Car() {
		
	}
	
	public Car (String brand, String type, float speed) {
		this.brand = brand; 
		this.type = type;
		this.speed = speed;
		//this.engine= new Engine();
		
		}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getType() {
		return this.type;
	}
	
	public float getSpeed() {
		return this.speed;
	}

	public void advance() {
		//this.engine.advance();
		this.getEngine().advance();
		System.out.println("Car is advancing");
	} 
	
	public void stop() {
		//this.engine.stop();
		this.getEngine().advance();
		System.out.println("car is stopped");
	}
}