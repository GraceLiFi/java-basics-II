public abstract class Vehicle {
private String make, model, fuelType;
private int year;

public Vehicle(String make, String model, int year, String fuelType) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.fuelType = fuelType;
}

public String getMake() {
    return make;
}

public String getModel() {
    return model;
}

public int getYear() {
    return year;
}

public String getFuelType() {
    return fuelType;
}

}
