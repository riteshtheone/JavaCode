package recursion;

import java.util.Scanner;

public class Power {

    public static int power(int n , int p) {
        return n>=0 && p>=0 ? p>0 ? n*power(n,p-1) : 1 : 0;
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
