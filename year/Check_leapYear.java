package year;

import java.util.Scanner;

public class Check_leapYear {

    public static boolean check_leapYear(int year){
        return year%400==0 || year%100!=0 && year%4==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year :- ");
        System.out.println(check_leapYear(sc.nextInt()));
    }
}
