package number;

import java.util.Scanner;

public class Print_primeNumber {

    public static boolean checkPrimeNumber(int p){
        if (p<2) return false;
        for (int i=2; i<p; i++){
            if (p%i==0) return false;
        }
        return true;
    }

    public static void print_primeNumber(int a, int b){
        for (int i=a; i<b; i++) {
            System.out.print(checkPrimeNumber(i) ? (i + " ") : "");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter the second number:- ");
        int b = sc.nextInt();
        print_primeNumber(a,b);
    }

}
