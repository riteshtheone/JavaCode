package recursion;

import java.util.Scanner;

public class Fibonacci_series {

     static int a=0,b=1,c;
     static boolean first=true;
    
    public static void fibonacci_series(int n){
        if (first){
            if (n==1){
                System.out.print(a);
            }else if (n>1){
                 System.out.print(a+" "+b+" ");
                 first=false;
                 fibonacci_series(n-1);
            }
        }else if (n>1){
            System.out.print((c=a+b)+ " ");
            a=b;
            b=c;
            fibonacci_series(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        fibonacci_series(sc.nextInt());
    }
}
