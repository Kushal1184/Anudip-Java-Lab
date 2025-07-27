class Lab9_1_Car extends Lab9_1_Vehicle {

    Lab9_1_Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}
