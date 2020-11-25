package number;

import java.util.Scanner;

public class ArmstrongNumber {

    public static int numberOfDigit(int n){
        int num = 0;
        do {
            n /= 10;
            num++;
        } while(n!=0);
        return num;
    }

    public static int powerOfNumber(int n , int power){
       int num = n;
        for (int i=1; i<power ; i++){
            num *= n;
        }
        return num;
    }

    public static boolean isArmstrongNumber(int n){
        int temp = n;
        int num = 0;
        do {
           num += powerOfNumber(temp%10 , numberOfDigit(n));
           temp /= 10;
        }while (temp!=0);
        return num == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(Armstrong_Number):- ");
        System.out.println(isArmstrongNumber(sc.nextInt()));
        sc.close();
    }
}
