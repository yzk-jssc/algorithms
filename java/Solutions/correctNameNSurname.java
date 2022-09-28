package java.Solutions;

import java.util.*;

class СorrectNameNSurname {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Введите первую пару имен и вторую пару имен");
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();

            correctNameNSurname(firstString, secondString);
            System.out.println("Проверим еще имена? Ответьте Да или Нет");
        }while (scanner.nextLine().equals("Да"));

    }

    static void correctNameNSurname(String firstCouple, String secondCouple) {
        List<String> firstNames = new LinkedList<>(Arrays.asList(firstCouple.split(", ")));
        List<String> secondNames = new LinkedList<>(Arrays.asList(secondCouple.split(", ")));
        String firstNameFromNames = firstNames.get(0);
        String secondNameFromNames = firstNames.get(1);
        if((helpingHandler(secondNames, firstNameFromNames) || helpingHandler(secondNames, helpingReverseHandler(firstNameFromNames))) && (helpingHandler(secondNames, secondNameFromNames) || helpingHandler(secondNames, helpingReverseHandler(secondNameFromNames)))){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    static boolean helpingHandler(List<String> array, String string){
        return array.contains(string);
    }
    static String helpingReverseHandler(String string){
        List<String> firstNameFromNamesReverse = Arrays.asList(string.split(" "));
        Collections.reverse(firstNameFromNamesReverse);
        return String.join(" ", firstNameFromNamesReverse);
    }
}