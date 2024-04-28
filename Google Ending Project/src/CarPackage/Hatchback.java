package CarPackage;

public class Hatchback extends Car {
	
	public Hatchback(String brand, String model, String segment, String gearType, int trunkCapacity, String color,
			int age, String fuelType, double dailyRentalRate) {
		super(brand, model, segment, gearType, trunkCapacity, color, age, fuelType, dailyRentalRate);
		// TODO Auto-generated constructor stub
	}

	private static final double aMonthDiscountRate = 0.10;

	@Override
	public double calculateRentalRate(int rentDuration) {
		
		double totalPrice = getDailyRentalRate()*rentDuration;
		
		if(rentDuration >= 30) {
			totalPrice -= totalPrice*aMonthDiscountRate;
		}
		
		return totalPrice;
			
		
	}

}
