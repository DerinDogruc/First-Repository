package CustomerPackage;

import CarPackage.Car;
import CarPackage.SUV;

public class PersonalCustomer extends Customer{
	
	private int customerID;

	public PersonalCustomer(String name, String phoneNumber, int customerID) {
		super(name, phoneNumber);
		this.customerID = customerID;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID= customerID;
	}
	

	@Override
	public void viewAvailableVehicles(Car[] cars) {
	    System.out.println("Available Vehicles for Individual Customer:");
	    for (Car car : cars) {
	        if (car != null && !(car instanceof SUV)) {
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
