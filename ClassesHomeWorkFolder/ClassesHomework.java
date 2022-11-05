package ClassesHomeWorkFolder;

import java.util.*;


public class ClassesHomework {

    public static void main(String[] args){
        CarClassInitial lada = new CarClassInitial("Lada", 90, true);
        lada.displayCarInfo();
        lada.getTimeTrip(500);

        CarClassInitial kia = new CarClassInitial("Kia", 105, true);
        kia.displayCarInfo();
        kia.getTimeTrip(1000);

        CarClassInitial ford = new CarClassInitial("Ford", 130, false);
        ford.displayCarInfo();
        ford.getTimeTrip(1232);

        TypesVehicle.Car volkswagen = new TypesVehicle.Car("volkswagen", 110, true, 5);
        TypesVehicle.Truck man = new TypesVehicle.Truck("volkswagen", 85, true, 8);

       fasterCarName(lada, kia, ford);
        System.out.println("Средняя скорость всех средств: " +averegeSpeedAllcars(lada, kia, ford, volkswagen, man));
    }

   static void fasterCarName(CarClassInitial ... default_cars){
      List<CarClassInitial> cars = new ArrayList<>(List.of(default_cars));
      cars.sort(Comparator.comparingInt(a -> a.speed));
      List<CarClassInitial> cars_in_move = cars.stream().filter(car -> car.isMoving).toList();
      System.out.println("Быстрее всего среди обычных машин проедет " + (cars_in_move.get(cars_in_move.size() - 1).name));
   }

    static int averegeSpeedAllcars(CarClassInitial ... all_cars){
        List<CarClassInitial> cars = new ArrayList<>(List.of(all_cars));
        cars.sort(Comparator.comparingInt(a -> a.speed));
        List<CarClassInitial> cars_in_move = cars.stream().filter(car -> car.isMoving).toList();
        int allSpeed = 0;
        for(int i = 0; i < cars_in_move.size(); i++){
            allSpeed += cars_in_move.get(i).speed;
        }
        return allSpeed / all_cars.length;
    }


}
