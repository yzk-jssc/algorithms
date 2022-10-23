import java.util.*;


public class CheckSolutions {

    public static void main(String[] args){
//        positiveAndNegativeCount();
        randomNumsEndsOnThree();
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
        List<Integer> finalResult = new ArrayList<>();
        random_nums.stream().map(num -> {
            String[] splitNum = num.toString().trim().split("");
            if(Integer.parseInt(splitNum[splitNum.length - 1]) == 3){
                finalResult.add((Integer) num);
            }
            return finalResult;
        }).toList();
        System.out.println(finalResult);
    }

}
