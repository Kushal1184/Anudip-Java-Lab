public class Lab9_1_Main {
    public static void main(String[] args) {
        Lab9_1_Car car = new Lab9_1_Car("Toyota", "Camry", 2022, 200);
        Lab9_1_Bike bike = new Lab9_1_Bike("Yamaha", "R15", 2023, 150);


        car.drive();
        bike.drive();


        System.out.println("Car: " + car.make + " " + car.model + ", Year: " + car.year + ", Max Speed: " + car.maximumSpeed);
        System.out.println("Bike: " + bike.make + " " + bike.model + ", Year: " + bike.year + ", Max Speed: " + bike.maximumSpeed);
    }
}
