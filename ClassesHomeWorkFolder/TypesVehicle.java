package ClassesHomeWorkFolder;

public class TypesVehicle {
    public static class Car extends CarClassInitial {
        int passengerQuantity;
        Car(String name, int speed, Boolean isMoving, int passengerQuantity) {
            super(name, speed, isMoving);
            this.passengerQuantity = passengerQuantity;
        }
        void changePassengersQuantity(int value) {
            this.passengerQuantity = value;
        }
    }
    public static class Truck extends CarClassInitial {
        int capacity;
        Truck(String name, int speed, Boolean isMoving, int capacity) {
            super(name, speed, isMoving);
            this.capacity = capacity;
        }
        void changeCapacity(int value) {
            this.capacity = value;
        }
    }
}
