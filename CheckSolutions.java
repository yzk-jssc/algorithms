import java.util.*;
import java.util.regex.Pattern;


public class CheckSolutions {

    public static void main(String[] args){
//        positiveAndNegativeCount();
//        randomNumsEndsOnThree();
        wordLengthFromInput();
    }

    public static void positiveAndNegativeCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую:");
        String[] numsArray = scanner.nextLine().split(",");
        scanner.close();
        int n = 0;
        int p = 0;
        for(int i = 0; i < numsArray.length; i++){
            if(Integer.parseInt(numsArray[i].trim()) > 0 ) {
                p++;
            }else{
                n++;
            }
        }
        System.out.println("Положительных чисел: " + p + "\n" + "Отрицательных чисел: " + n);
    }

    public static void randomNumsEndsOnThree(){
        Random rand = new Random();
        List random_nums = new ArrayList<>();
        for(int i = 0; i <= 20; i++){
            int max_num = 1001;
            int random_num = rand.nextInt(max_num);
            random_nums.add(random_num);
        }
        List<Integer> final_result = new ArrayList<>();
        random_nums.stream().map(num -> {
            String[] splitNum = num.toString().trim().split("");
            if(Integer.parseInt(splitNum[splitNum.length - 1]) == 3){
                final_result.add((Integer) num);
            }
            return final_result;
        }).toList();
        System.out.println(final_result);
    }

    public static void wordLengthFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу:");
        String[] words_array = scanner.nextLine().split("[\\s\\,\\.\\-]+");
        System.out.println("Введите длину слова:");
        int desired_length = scanner.nextInt();
        scanner.close();
        int word_counter = 0;
        for (int i = 0; i < words_array.length; i++){
            if(words_array[i].length() == desired_length){
                word_counter++;
            }
        }
        System.out.println(word_counter);
    }

}
