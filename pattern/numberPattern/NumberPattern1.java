package pattern.numberPattern;

import java.util.Scanner;

public class NumberPattern1 {
    
    static void numberPattern1(int n){
        for (int i=1; i<=n; i++){
            int num = 1;
            for (int j=1; j<n+i; j++){
                System.out.print(j<=n-i ? "  " : num++ +" ");
                if (j>=n) num -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Row :- ");
        numberPattern1(sc.nextInt());
    }
}
