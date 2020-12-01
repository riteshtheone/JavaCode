package sorting;

import java.util.Scanner;

public class MergeSort {

    static int[] array, tempArray;
    static int length;

    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an Array :- ");
        int l = sc.nextInt();
        int[] input_array = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.print("("+(i+1)+")"+":- ");
            input_array[i] = sc.nextInt();
        }

        return input_array;
    }

    public static void print_array(int[] ar) {
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        print_array(mergeSort(arrayInput()));

    }

    public static int[] mergeSort(int[] inputArray) {
        array = inputArray;
        length = inputArray.length;
        tempArray = new int[length];
        devideArray(0, length - 1);
        return inputArray;
    }

    public static void devideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            devideArray(lowerIndex, middle);
            devideArray(middle + 1, higherIndex);
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    public static void mergeArray(int lowerIndex, int middle, int higherIndex) {

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        for (int a = lowerIndex; a <= higherIndex; a++) {
            if (i <= middle && j <= higherIndex) {
                if (array[i] <= array[j]) {
                    tempArray[k] = array[i];
                    i++;
                } else {
                    tempArray[k] = array[j];
                    j++;
                }
                k++;
            } else {
                if (i <= middle) {
                    tempArray[a] = array[i];
                    i++;
                } else {
                    tempArray[a] = array[j];
                    j++;
                }
            }
        }
        System.arraycopy(tempArray, lowerIndex, array, lowerIndex, higherIndex + 1 - lowerIndex);
    }

}
