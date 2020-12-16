package arrays;

import java.util.Scanner;

public class MultiplicationOfMatrices {

    static int[][] firstArray;
    static int[][] secondArray;

    public static int[][] inputArray(int row, int column){
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[row][column];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print("array[" +(i+1)+ "][" +(j+1)+ "] :- ");
                ar[i][j] = sc.nextInt();
            }
        }
        return ar;
    }

    public static int[][] multiplicationOfMatrix(int row, int column){
        int[][] ar = new int[row][row];

        for (int i=0; i<row; i++){
            for (int j=0; j<row; j++){
                for (int k=0; k<column; k++){
                    ar[i][j] += firstArray[i][k]*secondArray[k][j];
                }
            }
        }
        return ar;
    }

    public static void printArray(int[][] ans){
        for (int[] i : ans){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of 'Row' of first array:- ");
        int row = sc.nextInt();
        System.out.print("Enter the No. of 'Column' of first array:- ");
        int column = sc.nextInt();

        System.out.println("\nEnter the all element in the 'first' array:- ");
        firstArray = inputArray(row, column);
        System.out.println("\nEnter the all element in the 'second' array:- ");
        secondArray = inputArray(column, row);

        int[][] ans = multiplicationOfMatrix(row, column);
        printArray(ans);

    }
}
