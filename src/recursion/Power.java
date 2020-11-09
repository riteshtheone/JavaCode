package recursion;

import java.util.Scanner;

public class Power {

    public static int power(int n , int p) {
        if (p==0) return 1;
        return p%2==0 ? power(n*n,p/2) : n*power(n,p-1) ;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int n = sc.nextInt();
        System.out.print("Enter the Power:- ");
        int p = sc.nextInt();
        System.out.println(power(n,p));
        sc.close();

        }
    }
