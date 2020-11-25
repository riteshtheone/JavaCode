package collection.list.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PascalTriangle {

    public static LinkedList<LinkedList<Integer>> pascalTriangle(int n) {
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();

        for(int i=0; i<n; i++){
            LinkedList<Integer> temp = new LinkedList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    temp.add(1);
                }else{
                    temp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(temp);
        }
        return list;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(Pascal_Triangle):- ");
        System.out.println(pascalTriangle(sc.nextInt()));
        sc.close();
    }
}
