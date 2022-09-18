package java.Solutions;

import java.util.*;

public class PlagiatCheckout {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        do{
            System.out.println("Введите первую строку");
            String firstString = scanner.nextLine();
            System.out.println("Введите вторую строку");
            String secondString = scanner.nextLine();

            plagiatCheckout(firstString, secondString);
            System.out.println("Проверим еще строки? Ответьте Да или Нет");


        }while (scanner.nextLine().equals("Да"));

    }

    static void plagiatCheckout(String fistString, String secondString){
        List<String> fistStringSplit = Arrays.asList((fistString.toLowerCase().split("")));
        List<String> secondStringSplit = new LinkedList<>(Arrays.asList((secondString.toLowerCase().split(""))));

        Collections.reverse(fistStringSplit);
        Collections.reverse(secondStringSplit);

        List<String> result = new ArrayList<>();
        List<String> resultLetters = new ArrayList<>();

        for(int i = 1; i <= fistStringSplit.size(); i++){
            String lastChild = secondStringSplit.remove(secondStringSplit.size() - 1);

            if(fistStringSplit.get(fistString.length() - i).equals(lastChild) && !resultLetters.contains(lastChild)){
                result.add("P");
            } else if (fistStringSplit.contains(lastChild) && !resultLetters.contains(lastChild)) {
                result.add("T");
            }else{
                result.add("N");
            }
            resultLetters.add(lastChild);
        }
        System.out.println("first string:" + fistString);
        System.out.println("second string:" + secondString);
        System.out.println("result:" + String.join("", result));
    }
}
