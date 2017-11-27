
public class Test {

	public static void main(String[] args) {
		
		Car seatPanda = new Car (
				"Seat",
				"Panda",
				10
				);		
			
			Car seatIbiza = new Car (
					"Seat",
					"Ibiza",
					40
					);
			Car ferrariEnzo = new Car (
					"Ferrari",
					"Enzo",
					400
					);
			
			Car[] cars = {
					seatPanda,
					seatIbiza,
					ferrariEnzo
			};
			
			Car veryFastCar = compareCarSpeeds(cars);
			System.out.println("The fastest car is " 
					+ veryFastCar.getBrand()
					+""
					+ veryFastCar.getType()
					+ "with"
					+ veryFastCar.getSpeed()
					+" km/h"
					);
	}
			
			public static Car compareCarSpeeds(Car[] cars) {
				double minTime = Double.MAX_VALUE;
				int distance = 100;
				Car fastestCar = new Car ();
				
				for (Car car : cars) {
					
					double carTimeForDistance = 
							(double)distance / (double)car.getSpeed();
							if (carTimeForDistance < minTime) {
								minTime = carTimeForDistance;
								fastestCar = car;
							}
				}
				return fastestCar;
								
			}
						
	}
