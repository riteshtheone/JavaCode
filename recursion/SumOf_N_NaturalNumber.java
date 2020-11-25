package recursion;

import java.util.Scanner;

public class SumOf_N_NaturalNumber {
	
	public static int sumOf_N_NaturalNumber(int n){
		return n>0 ? n+sumOf_N_NaturalNumber(n-1) : 0 ;
	}

	public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Natural Number:- ");
        System.out.println(sumOf_N_NaturalNumber(sc.nextInt()));
        sc.close();

	}
}
