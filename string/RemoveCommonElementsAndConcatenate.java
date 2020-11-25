package string;

     //        Given two strings s1 and s2.Modify both the strings such that all the common characters of
     //        s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated
     //        Note :- If all characters are removed print -1.
     //        Input :- s1 = aacdb  ,  s2 = gafd       Output -> cbgf
     //        Input :- s1 = abc    ,  s2 = bca        Output -> -1

import java.util.Scanner;

public class RemoveCommonElementsAndConcatenate {

    public static String removeCommonElementsAndConcatenate(String s1 , String s2){
        if (s1==null || s2==null) return null;
        for (int i=0 ; i<s1.length() ; i++){
            if (s2.contains(Character.toString(s1.charAt(i)))){
                String temp = Character.toString(s1.charAt(i));
                s1 = s1.replaceAll(temp , " ");
                s2 = s2.replaceAll(temp , " ");
            }
        }
        String temp = s1.replaceAll(" " , "") + s2.replaceAll(" " , "");
        return temp.length()==0 ? "-1" : temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two string :-  ");
        System.out.println(removeCommonElementsAndConcatenate(sc.nextLine() , sc.nextLine()));
        sc.close();

    }
}
