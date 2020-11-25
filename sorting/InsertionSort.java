package sorting;

import java.util.Scanner;

public class InsertionSort {

    public static int[] insertionSort(int[] ar){

        int temp,j;
        for (int i=1 ; i<ar.length ; i++){
            temp = ar[i];
            for (j=i ; j>0 && ar[j-1]>temp ; j--){
                ar[j] = ar[j-1];
            }
            ar[j] = temp;
        }
        return ar;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("(Algorithm - Insertion_Short)->..\nEnter the length of an array:- ");
        int n = sc.nextInt();
        int[] ar = new int[n];

        if (n>0)
            System.out.println("Enter the elements in array:- ");
        for(int i=0; i<n; i++){
            System.out.print((i+1)+" -> ");
            ar[i] = sc.nextInt();
        }

        ar = insertionSort(ar);
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
