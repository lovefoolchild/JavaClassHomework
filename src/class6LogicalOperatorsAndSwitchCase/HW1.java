package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        /* Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output
        “It is a weekend”, any other day → output “Invalid day” */

        Scanner love= new Scanner(System.in);
        System.out.println("What day is today? Enter the day number from 1 - 7, Monday is equivalent to 1.");
        int day= love.nextInt();

        if (day>=1 && day<=5) {
            System.out.println("It is a weekday.");
        } else if (day > 5 && day<=7) {
            System.out.println("It is a weekend.");
        } else {
            System.out.println("Invalid day.");
        }
    }
}
