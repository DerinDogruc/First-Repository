package MainSystem;

import CarPackage.*;
import CustomerPackage.*;

public class RentalManagementSystem {

    // Arabaları listeleme fonksiyonu
	public static void listCars(Car[] cars) {
	    System.out.println("List of Cars:");
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
	        }
	    }
	}


    // Müşterileri listeleme fonksiyonu
	public static void listCustomers(Customer[] customers) {
	    System.out.println("List of Customers:");
	    for (Customer customer : customers) {
	        if (customer != null) {
	            System.out.println("Name: " + customer.getName());
	            System.out.println("Phone Number: " + customer.getPhoneNumber());
	            
	            if (customer instanceof CompanyCustomer) {
	                CompanyCustomer companyCustomer = (CompanyCustomer) customer;
	                System.out.println("Customer Type: Company");
	                System.out.println("Name: " + customer.getName());
	                System.out.println("Phone number: " + customer.getPhoneNumber());
	                System.out.println("Tax Number: " + companyCustomer.getTaxNumber());
	            } else if (customer instanceof PersonalCustomer) {
	                PersonalCustomer personalCustomer = (PersonalCustomer) customer;
	                System.out.println("Customer Type: Personal");
	                System.out.println("Phone number: " + customer.getPhoneNumber());
	                System.out.println("Customer ID: " + personalCustomer.getCustomerID());
	            }
	            
	            System.out.println();
	        }
	    }
	}


    // Müşteriye göre kiralanan araçları görüntülemek için fonksiyon
    public static void viewCustomerRentals(Customer customer, Car[] cars) { 
        System.out.println("Available Vehicles for " + customer.getName() + ":");
        for (Car car : cars) {
            if (car != null) {
                if (customer instanceof CompanyCustomer) {
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
                } else if (customer instanceof PersonalCustomer) {
                    if (!(car instanceof SUV)) {
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
                    }
                }
                System.out.println();
            }
        }
    }


    // Araç ekleme fonksiyonu
    public static Car[] initiliazeCars() { 
        
        Sedan sedan1 = new Sedan("Toyota", "Corolla", "Flame X-Pack", "automatic", 50, "Black", 2, "LPG", 200);
        Sedan sedan2 = new Sedan("Honda", "Civic", "Deluxe Edition", "automatic", 45, "White", 1, "Petrol", 180);
        Sedan sedan3 = new Sedan("Ford", "Fusion", "Sport Edition", "automatic", 55, "Red", 3, "Diesel", 220);
        Sedan sedan4 = new Sedan("Nissan", "Altima", "Executive Edition", "automatic", 48, "Silver", 2, "Electric", 250);
        SUV suv1 = new SUV("Jeep", "Grand Cherokee", "Luxury Edition", "automatic", 70, "Black", 2, "Gasoline", 300);
        SUV suv2 = new SUV("Land Rover", "Range Rover Evoque", "Premium Edition", "automatic", 65, "White", 1, "Diesel", 280);
        SUV suv3 = new SUV("Toyota", "RAV4", "Adventure Edition", "automatic", 60, "Blue", 3, "Hybrid", 320);
        Hatchback hatchback1 = new Hatchback("Volkswagen", "Golf", "GTI Edition", "automatic", 30, "Red", 2, "Gasoline", 150);
        Hatchback hatchback2 = new Hatchback("Ford", "Focus", "Titanium Edition", "automatic", 35, "Silver", 1, "Petrol", 160);
        Hatchback hatchback3 = new Hatchback("Honda", "Fit", "Sport Edition", "automatic", 28, "Black", 2, "Electric", 170);
        
        Car[] cars = new Car[10];
        cars[0] = sedan1;
        cars[1] = sedan2;
        cars[2] = sedan3;
        cars[3] = sedan4;
        cars[4] = suv1;
        cars[5] = suv2;
        cars[6] = suv3;
        cars[7] = hatchback1;
        cars[8] = hatchback2;
        cars[9] = hatchback3;
        return cars;

    }

    // Müşteri ekleme fonksiyonu
    public static Customer[] initiliazeCustomers() { 
        Customer[] customers = new Customer[10];
        
        customers[0] = new CompanyCustomer("ABC Corp", "1234567890", 123456);
        customers[1] = new CompanyCustomer("XYZ Ltd", "9876543210", 789012);
        customers[2] = new CompanyCustomer("Tech Solutions", "5551234567", 456789);
        customers[3] = new CompanyCustomer("Global Enterprises", "5559876543", 987654);
        
        customers[4] = new PersonalCustomer("John Doe", "5551234567", 1001);
        customers[5] = new PersonalCustomer("Jane Smith", "5559876543", 1002);
        customers[6] = new PersonalCustomer("Alice Johnson", "5557891234", 1003);
        customers[7] = new PersonalCustomer("Michael Brown", "5555555555", 1004);
        customers[8] = new PersonalCustomer("Emily Davis", "5554444444", 1005);
        customers[9] = new PersonalCustomer("David Wilson", "5553333333", 1006);
        
        return customers;
    }


    public static void main(String args[]) {
    	
        Car[] cars = new Car[10];
        Customer[] customers = new Customer[10];

        cars = initiliazeCars();
        customers = initiliazeCustomers();
        
        listCars(cars);
        listCustomers(customers);

    }
}
