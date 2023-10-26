public class Truck extends Vehicle {
    double cargoCapacity;
    public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return this.cargoCapacity;
    }
    
}
