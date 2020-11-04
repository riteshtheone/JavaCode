package number;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber(int n){
        int reverse_num = 0;
        do {
            reverse_num = reverse_num*10 + n%10;
            n = n/10;
        }while(n!=0);
        return reverse_num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(Reverse_Number) :- ");
        System.out.println(reverseNumber(sc.nextInt()));
        sc.close();
    }
}
