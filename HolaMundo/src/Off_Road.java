
public class Off_Road extends Car{

	private String suspension;
	private String gearbox;
	
	public Off_Road (String brand, String type, int speed,String suspension, String gearbox) {
		super (brand,type,speed);
		this.suspension = suspension;
		this.gearbox = gearbox;
	}

	public void advance() {
		super.advance();
		// System.out.println("Offroad car is advancing");
	} 
	
	public void stop() {
		//super.stop();
		System.out.println("Offroad car is stopped");
	}
}

