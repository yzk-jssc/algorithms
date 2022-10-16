package java.Solutions;

import java.util.Scanner;


public class HanoiSolution {

    public static void main(String[] args) {
        System.out.println("Ведите количество дисков");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoiRing(n,'A','B','C');
    }
    static void hanoiRing(int n,char start,char mid,char end) {
        if(n==1) {
            System.out.println(n+" Из башни "+start+ " в "+end);
            return;
        }
        hanoiRing(n-1,start,end,mid);
        System.out.println(n+" Из башни "+start+" в "+end);
        hanoiRing(n-1,mid,start,end);

    }



}
