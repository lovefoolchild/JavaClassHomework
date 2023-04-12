package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /* Write a program for user to enter his/hers birth month. Based on the month define the season.
           Example: If user is born in March, April, May → season =”Spring”
           If user is born in June, July, August → season =”Summer”  etc …
           At the end of the program we should see 1 output as “You were born is season __”. */

        Scanner love = new Scanner(System.in);
        System.out.println("What is your birth month? Type in 1 - 12.");
        int birthMonth = love.nextInt();

        if (birthMonth==3 || birthMonth==4 || birthMonth==5) {
            System.out.println("You were born in the Spring season.");
        } else if (birthMonth==6 || birthMonth==7 || birthMonth==8) {
            System.out.println("You were born in the Summer season.");
        } else if (birthMonth==9 || birthMonth==10 || birthMonth==11) {
            System.out.println("You were born in the Fall season.");
        } else if (birthMonth==1 || birthMonth==2 || birthMonth==3) {
            System.out.println("You were born in the Winter season.");
        } else {
            System.out.println("Invalid input, please enter a number between 1 - 12.");
        }
    }
}
