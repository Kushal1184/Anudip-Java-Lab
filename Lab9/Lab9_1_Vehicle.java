class Lab9_1_Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;


    Lab9_1_Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    void drive() {
        System.out.println("Vehicle is driving.");
    }
}
