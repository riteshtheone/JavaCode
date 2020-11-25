package recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        return n>1 ? n*factorial(n-1) : 1 ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        System.out.println(factorial(sc.nextInt()));
        sc.close();

    }
}