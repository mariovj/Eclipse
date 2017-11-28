
public class Engine {
	
	private int consume;
	private int numberPiston;
	private int cylinderCapacity;
	
	public Engine() {
		
	}

	public Engine (int consume, int numberPiston, int cylinderCapacity) {
		this.consume= consume;
		this.numberPiston= numberPiston;
		this.cylinderCapacity= cylinderCapacity;
	}
		
		public int getConsume() {
			return consume;
		}
		
		public int getNumerPiston() {
			return numberPiston;
		}
		
		public float getCylinderCapacity() {
			return cylinderCapacity;
		}
		
		public void start() {
		 System.out.println("Engine is started");
		}
		
		public void advance() {
			 System.out.println("Engine is advancing");
		}
		
		public void stop() {
			 System.out.println("Engine is stopped");
		}
}

	 