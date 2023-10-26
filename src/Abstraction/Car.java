public class Car extends Vehicle {
    int numSeats;
    public Car(String make, String model, int year, String fuelType, int numSeats) {
        super(make, model, year, fuelType);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return this.numSeats;
    }

}
