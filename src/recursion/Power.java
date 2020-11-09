package recursion;

import java.util.Scanner;

public class Power {

    static int step = 0;

    public static int power(int n , int p) {
        step++;
        if (p<=0) return 1;
        return p%2==0 ? power(n*n,p/2) : n*power(n*n,(p-1)/2) ;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int n = sc.nextInt();
        System.out.print("Enter the Power:- ");
        int p = sc.nextInt();
        System.out.println(power(n,p));
        System.out.println(step);
        sc.close();

        }
    }
