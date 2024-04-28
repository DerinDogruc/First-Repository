package CarPackage;

public class SUV extends Car{

	public SUV(String brand, String model, String segment, String gearType, int trunkCapacity, String color, int age,
			String fuelType, double dailyRentalRate) {
		super(brand, model, segment, gearType, trunkCapacity, color, age, fuelType, dailyRentalRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateRentalRate(int rentDuration) {
		
		return getDailyRentalRate()*rentDuration;
	}

}
