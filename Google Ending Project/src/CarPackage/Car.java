package CarPackage;

public abstract class Car {
    private String brand;
    private String model; 
    private String segment;
    private String gearType; 
    private int trunkCapacity;
    private String color; 
    private int age; 
    private String fuelType; 
    private double dailyRentalRate;

    public Car(String brand, String model, String segment, String gearType, int trunkCapacity, String color, int age,
            String fuelType, double dailyRentalRate) {
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.gearType = gearType;
        this.trunkCapacity = trunkCapacity;
        this.color = color;
        this.age = age;
        this.fuelType = fuelType;
        this.dailyRentalRate = dailyRentalRate;
    }

    public abstract double calculateRentalRate(int rentDuration);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getGearType() {
        return gearType;
    }

    public void setTransmissionType(String gearType) {
        this.gearType = gearType;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyRentalRate() {
        return dailyRentalRate;
    }

    public void setDailyRentalRate(double dailyRentalRate) {
        this.dailyRentalRate = dailyRentalRate;
    }

}
