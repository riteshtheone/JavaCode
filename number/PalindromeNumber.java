package number;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindromeNumber(int n){
        return n == ReverseNumber.reverseNumber(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(Palindrome_Number) :- ");
        System.out.println(isPalindromeNumber(sc.nextInt()));
        sc.close();
    }
}
