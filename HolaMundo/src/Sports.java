
public class Sports extends Car {
	private String typeEngine;
	int horsesPower;
	

	public Sports(String brand, String type, int speed, String typeEngine, int horsesPower) {
		super(brand,type,speed);
		this.typeEngine= typeEngine;
		this.horsesPower = horsesPower;
	}
	
	public void advance() {
		//super.advance();  //puedo cambiar el super por system para que me muestre lo que yo quiera.
		 System.out.println("Sports car is advancing");
	} 
	
	public void stop() {
		//super.stop();
		System.out.println("Sports car is stopped");
	}
}
	
	

