package CustomerPackage;

import CarPackage.Car;

public abstract class Customer {
    private String name;
    private String phoneNumber;

    public abstract void viewAvailableVehicles(Car[] cars); // Müsait araçları görüntüler
    

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
