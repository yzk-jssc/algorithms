package java.Solutions;

import java.util.Arrays;
import java.util.Scanner;


public class tasksForHome {

    public static void main(String[] args){
        pinappleCount(500, 85);
        totalCostTickets(15,2,720);
        bountyAmount(232300);
        employeesBountyAmount();
    }

    static void pinappleCount(int cash, int price){
        int result = Math.toIntExact(Math.round(Math.floor(cash / price)));
        System.out.println("На " + cash +" рублей можно купить " + result + " ананасов по "+ 85 +" рублей");
    }

    static void totalCostTickets(int students, int adult, int fullPriceTicketCost){
        int adultsTicketsCost = fullPriceTicketCost * adult;
        int studentsTicketsCost = (fullPriceTicketCost / 2)  * students;
        int result = adultsTicketsCost + studentsTicketsCost;
        System.out.println("Общая стоимость билетов: " +  result + " рублей");
    }

    static void bountyAmount(int salary){
        int bounty = (int) (salary / 1.5);
        int duty = (int) (bounty * 0.13);
        int result = bounty + duty;
        System.out.println("Премея составит "+ result + " рублей");
    }
    static void employeesBountyAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена через запятую");
        String[] employeesNames = scanner.nextLine().split(",");
        System.out.println("Введите зарплаты через запятую соответсвенно");
        String[] employeesSalaries = scanner.nextLine().split(",");
        for(int i  = 0; i < employeesSalaries.length; i ++ ){
            int salary = Integer.parseInt(employeesSalaries[i]);
            int bounty = (int) (salary / 1.5);
            int duty = (int) (bounty * 0.13);
            employeesSalaries[i] = String.valueOf(bounty + duty);
            System.out.println("Премия для " + employeesNames[i] + " составит " +employeesSalaries[i] + " рублей");
        }
    }

}

