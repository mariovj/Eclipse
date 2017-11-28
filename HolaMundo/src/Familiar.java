
public class Familiar extends Car {

	private int seats;
	private String sizeBoot; 
	
	public Familiar (String brand, String type, int speed, int seats, String sizeBoot) {
		super (brand,type,speed);
		this.seats = seats;
		this.sizeBoot = sizeBoot;
	}

	public void advance() {
		//super.advance();
		 System.out.println("Familiar is advancing");
	} 
	
	public void stop() {
		//super.stop();
		System.out.println("Familiar is stopped");
	}
}
