import java.util.*;

public class CheckSolutions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       do{
           System.out.println("Введите первое время и второе время");
           String firstString = scanner.nextLine();
           String secondString = scanner.nextLine();

           correctNameNSurname(firstString, secondString);
           System.out.println("Проверим еще имена? Ответьте Да или Нет");
       }while (scanner.nextLine().equals("Да"));

    }

    static void correctNameNSurname(String firstCouple, String secondCouple) {

    }
}
