package CustomerPackage;

import CarPackage.Car;

public class CompanyCustomer extends Customer{
	
	private int taxNumber;
	
	public CompanyCustomer(String name, String phoneNumber, int taxNumber) {
		super(name, phoneNumber);
		this.taxNumber = taxNumber;
	}
	
	public int getTaxNumber() {
		return taxNumber;
	}
	
	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}

	@Override
	public void viewAvailableVehicles(Car[] cars) {
	    System.out.println("Available Vehicles for Individual Customer:");
	    for (Car car : cars) {
	        if (car != null) {
	        	System.out.println("Brand: " + car.getBrand());
	            System.out.println("Model: " + car.getModel());
	            System.out.println("Segment: " + car.getSegment());
	            System.out.println("Gear Type: " + car.getGearType());
	            System.out.println("Segment: " + car.getSegment());
	            System.out.println("Trunk Capasity: " + car.getTrunkCapacity());
	            System.out.println("Color: " + car.getColor());
	            System.out.println("Age: " + car.getAge());
	            System.out.println("Fuel type: " + car.getFuelType());
	            System.out.println("Daily Rental Rate: " + car.getDailyRentalRate());
	            System.out.println();
	            
	            System.out.println();
	        }
	    }
	}

}
