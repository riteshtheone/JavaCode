package sorting;

import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int[] ar){

        int min,temp;
        for (int i=0 ; i<ar.length-1 ; i++){
            min = i;
            for (int j=i+1 ; j<ar.length ; j++){
                if (ar[j]<ar[min]){
                    min = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        return ar;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("(Algorithm - Selection_Short)->..\nEnter the length of an array:- ");
        int n = sc.nextInt();
        int[] ar = new int[n];

        if (n>0)
            System.out.println("Enter the elements in array:- ");
        for(int i=0; i<n; i++){
            System.out.print((i+1)+" -> ");
            ar[i] = sc.nextInt();
        }

        ar = selectionSort(ar);
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
