package number;

import java.util.Scanner;

public class Check_primeNumber {

    public static boolean check_primeNumber(int p){
        if (p<2) return false;
        for (int i=2; i<p; i++){
            if (p%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        System.out.println(check_primeNumber(sc.nextInt()));
    }

}
