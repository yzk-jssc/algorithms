package java.Solutions;

import java.util.*;


public class ClassesHomework {

    public static void main(String[] args){

        CarInfo lada = new CarInfo("Lada", 90, true);
        lada.displayCarInfo();
        lada.getTimeTrip(500);

        CarInfo kia = new CarInfo("Kia", 105, true);
        kia.displayCarInfo();
        kia.getTimeTrip(1000);

        CarInfo ford = new CarInfo("Ford", 130, false);
        ford.displayCarInfo();
        ford.getTimeTrip(1232);

        List<CarInfo> cars = new ArrayList<>(3);
        cars.add(lada);
        cars.add(kia);
        cars.add(ford);
        cars.sort(Comparator.comparingInt(a -> a.speed));
        List<CarInfo> carsInMove = cars.stream().filter(car -> car.isMoving).toList();
        System.out.println("Быстрее всего проедет " + (carsInMove.get(carsInMove.size() - 1).name));
    }

    static class CarInfo {
        String name;
        int speed;
        Boolean isMoving;

        CarInfo(String name, int speed, Boolean isMoving) {
            this.name = name;
            this.speed = speed;
            this.isMoving = isMoving;
        }

        void changeName(String param){
            this.name = param;
        }
        void changeSpeed(int param){
            this.speed = param;
        }
        void changeStatus(Boolean param){
            this.isMoving = param;
        }

        void displayCarInfo(){
            System.out.printf("Название машины: %s \tСкорость поездки: %d \tСостояние: " + (isMoving ? "Движется" : "Стоит"), name, speed);
            System.out.println();
        }
        void getTimeTrip(int distance){
            if(!this.isMoving) {
                System.out.println(0 + " часов займет поездка");
                return;
            }
            double result = (double) distance / this.speed;
            System.out.println(result + " часов займет поездка");
        }
    }

}
