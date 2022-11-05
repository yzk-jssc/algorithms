package ClassesHomeWorkFolder;

public class CarClassInitial {
    String name;
    int speed;
    Boolean isMoving;

    CarClassInitial(String name, int speed, Boolean isMoving) {
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
