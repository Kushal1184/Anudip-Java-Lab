public class Lab6_1_MainClass {
    public static void main(String[] args) {
        Lab6_1_CarClass car = new Lab6_1_CarClass();
        Lab6_1_MotorcycleClass bike = new Lab6_1_MotorcycleClass();
        Lab6_1_Garage garage = new Lab6_1_Garage();


        garage.serviceVehicle(car);
        garage.serviceVehicle(bike);
    }
}
