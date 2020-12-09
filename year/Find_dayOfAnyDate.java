package year;

import java.util.Scanner;

public class Find_dayOfAnyDate {

    public static boolean isLeapYear(int year){
        return year%400==0 || year%4==0 && year%100!=0;
    }

    public static boolean isDateValid(int day, int month, int year){
        if (day < 1 || month<1 || month>12 || year < 1) return false;
        switch (month){
            case 2:
                if (isLeapYear(year)){
                    if (day>29) return false;
                }else{
                    if (day>28) return false;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day>31) return false;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day>30) return false;
                break;
        }
        return true;
    }

    public static String findTheDay(int day, int month, int year){
        if (!isDateValid(day, month, year)) return "Invalid Date!!!";
        int leapYear, normalYear;
        int oddDays = 0;
        int tempYear = year-1;
        tempYear %= 400;
        switch (100*(tempYear/100)){
            case 100:
                oddDays += 5;
                break;
            case 200:
                oddDays += 3;
                break;
            case 300:
                oddDays += 1;
                break;
        }
        tempYear %= 100;
        leapYear = tempYear/4;
        normalYear = tempYear - leapYear;
        oddDays += 2*leapYear + normalYear;
        switch (month-1){
            case 1:
            case 2:
            case 10: oddDays += 3;
                break;
            case 3:
            case 6: oddDays += 6;
                break;
            case 4: oddDays += 1;
                break;
            case 5: oddDays += 4;
                break;
            case 7: oddDays += 2;
                break;
            case 8:
            case 11: oddDays += 5;
                break;
        }
        if (isLeapYear(year) && month>2) oddDays++;
        oddDays = (oddDays + day) % 7;
        switch (oddDays){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 4: return "Thursday";
            case 3: return "Wednesday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return "Invalid Operation";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the DAY :- ");
        int day = sc.nextInt();
        System.out.print("Enter the MONTH :- ");
        int month = sc.nextInt();
        System.out.print("Enter the YEAR :- ");
        int year = sc.nextInt();
        System.out.println(findTheDay(day,month,year));
    }

}
