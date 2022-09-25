import java.util.*;

public class CheckSolutions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       do{
           System.out.println("Введите первое время и второе время");
           String firstString = scanner.nextLine();
           String secondString = scanner.nextLine();

           howLongIsFlying(firstString, secondString);
           System.out.println("Проверим еще времена? Ответьте Да или Нет");
       }while (scanner.nextLine().equals("Да"));

    }

    static void howLongIsFlying(String firstTime, String secondTime){
      int firstTimeInMinutes = Integer.parseInt(firstTime.split(":")[0]) * 60 + Integer.parseInt(firstTime.split(":")[1]);
      int secondTimeInMinutes = Integer.parseInt(secondTime.split(":")[0]) * 60 + Integer.parseInt(secondTime.split(":")[1]);
      int hours,
              minutes;
      if(firstTimeInMinutes < secondTimeInMinutes){
          hours = Math.round((secondTimeInMinutes - firstTimeInMinutes) / 60);
          minutes = (secondTimeInMinutes - firstTimeInMinutes) - 60;
      }else if ( firstTimeInMinutes > secondTimeInMinutes){
          hours = Math.round((firstTimeInMinutes - secondTimeInMinutes) / 60);
          minutes = (firstTimeInMinutes - secondTimeInMinutes) - 60;
      }else {
          System.out.println("00:00");
          return;
      }
      String minutesHelper = String.valueOf(minutes);
        System.out.println(hours
                + ":"
                + (minutesHelper.length() > 1
                    ? minutesHelper.split("")[minutesHelper.length() - 2] + minutesHelper.split("")[minutesHelper.length() - 1]
                    : "0" + minutes));
    }
}
