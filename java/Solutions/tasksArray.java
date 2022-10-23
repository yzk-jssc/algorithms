package java.Solutions;

import java.util.*;
import java.util.regex.Pattern;


public class tasksArray {

    public static void main(String[] args){
//        positiveAndNegativeCount();
//        randomNumsEndsOnThree();
//        wordLengthFromInput();
        monthWeather();
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

    public static void monthWeather() {
        int[] weather_array = {-2,-5, -2, -4, 3, -6, -2, -1, 5, 1, 1, 0, -1, 0, 3, -1, 2,
                5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11};
        int weather_days_more_ten = 0;
        int weather_sum = 0;
        for(int i = 0; i < weather_array.length; i++) {
            if(weather_array[i] > 10){
                weather_days_more_ten ++;
            }
        }
        for(int i = 0; i < weather_array.length; i++) {
            weather_sum += weather_array[i];
        }
        double average_temp = (double) weather_sum / weather_array.length;
        System.out.println(weather_days_more_ten);
        System.out.println(String.format("%.2f", average_temp));
    }

}
