package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static int[] bubbleSort(int[] ar){
		for(int i=0; i<ar.length-1; i++){
			int temp;
			boolean isSorted = true;
			for(int j=0; j<ar.length-(i+1); j++){
				if(ar[j]>ar[j+1]){
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) break;
		}			
         return ar;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an array:- ");
		int n = sc.nextInt();
		int[] ar = new int[n];

		if (n>0)
			System.out.println("Enter the elements in array:- ");
			for(int i=0; i<n; i++){
				System.out.print((i+1)+" -> ");
		 	  	ar[i] = sc.nextInt();
			}

		ar = bubbleSort(ar);
		System.out.print("Sorted array is:- ");

		for(int i=0; i<n; i++){
			if (i==0) System.out.print("[");
			if(i==n-1){
				System.out.print(ar[i]);
			}else{
				System.out.print(ar[i]+", ");
			}
			if (i==n-1) System.out.print("]");
		}
		sc.close();
	}
}
