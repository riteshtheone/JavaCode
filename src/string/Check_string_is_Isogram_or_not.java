package string;

//             Given a word or phrase, check if it is isogram or not.
//             An Isogram is a word in which no letter occurs more than once.

import java.util.Scanner;

public class Check_string_is_Isogram_or_not {

    public static boolean check_string_is_Isogram_or_not(String s){
        if (s==null || s.length()==0) return false;
        for (int i=0 ; i<s.length()-1 ; i++){
            for (int j=i+1 ; j<s.length() ; j++){
                if (s.charAt(i)==s.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String(Check_string_is_Isogram_or_not):- ");
        System.out.println(check_string_is_Isogram_or_not(sc.nextLine()));
        sc.close();
    }

}
