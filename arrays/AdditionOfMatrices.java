package arrays;

import java.util.Scanner;

public class AdditionOfMatrices {

    private static int count = 0;
    private static int row;
    private static int column;

    public static int[][] additionOfMatrix(int[][] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill all the element in the ("+ ++count+")Array:-");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print("array[" +(i+1)+ "][" +(j+1)+ "] :- ");
                ar[i][j] += sc.nextInt();
            }
            System.out.println();
        }
        return ar;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the No. of Matrix:- ");
        int nums = sc.nextInt();
        System.out.print("Enter the No. of Row:- ");
        row = sc.nextInt();
        System.out.print("Enter the No. of column:- ");
        column = sc.nextInt();

        int[][] ar = new int[row][column];
        while(--nums >= 0) ar = additionOfMatrix(ar);
        
        System.out.println("Addition of Matrices is:- ");
        for (int[] i : ar) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
