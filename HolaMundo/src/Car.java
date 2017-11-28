
public class Car {
	private String brand;
	private String type;
	private float speed;
	private Engine engine;
	
	private Engine getEngine() {
		if (this.engine == null) {
			this.engine =new Engine();//sirve para enlazar con Engine y soluciona el problema cuando es null
		}
		return this.engine;
	}
	
		public Car() {
		
	}
	
	public Car (String brand, String type, float speed) {
		this.brand = brand; 
		this.type = type;
		this.speed = speed;
		}
	
	public Car (String brand, String type, float speed, Engine engine) {
		this.brand = brand; 
		this.type = type;
		this.speed = speed;
		//this.engine= new Engine();
		
		//this.engine = engine;
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
		this.getEngine().advance();
		System.out.println("Car is advancing");
	} 
	
	public void stop() {
		this.getEngine().stop();
		//System.out.println("car is stopped");
	}
}