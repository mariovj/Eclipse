
public class Test2 {

	public static void main(String[] args) {
		
		Familiar daciaLodgy = new Familiar (
				"Dacia",
				"Lodgy",
				10,
				8,
				"very big"
				);		
			
			Off_Road skodaKodiaq = new Off_Road (
					"Skoda",
					"Kodiaq",
					40,
					"4x4",
					"automatic"
					);
			
			Sports ferrariEnzo = new Sports (
					"Ferrari",
					"Enzo",
					400,
					"Motor345",
					850		
					);
			
			Car[] cars = {
					daciaLodgy,
					skodaKodiaq,
					ferrariEnzo
			};
			
			//Methods.
			
			daciaLodgy.advance();
			skodaKodiaq.advance();
			ferrariEnzo.advance();
			
			Car veryFastCar = compareCarSpeeds(cars);
			System.out.println("The fastest car is " 
					+ veryFastCar.getBrand()
					+" "
					+ veryFastCar.getType()
					+ " with "
					+ veryFastCar.getSpeed()
					+" km/h"
					);
	}
			
			public static Car compareCarSpeeds(Car[] cars) {
				double minTime = Double.MAX_VALUE;
				int distance = 100;
				Car fastestCar = new Car ();
				
				for (Car car : cars) { //Car es la clase, car es el primer objeto cars los atributos que pasan.
					
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

