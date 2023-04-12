package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /* Write a program that will ask user to input their current time (use 24-hour format).
        Based on the given time define:
            if hour is between 1-11 --> Morning
            if hour between 12-15 --> Afternoon
            if hour between 16-20 --> Evening
            if hour between 21-24 --> Night */

        Scanner love = new Scanner(System.in);
        System.out.println("What time is it there? Use military format.");
        double whatTimeIsIt = love.nextDouble();

        if (whatTimeIsIt >= 0001 && whatTimeIsIt <= 1159) {
            System.out.println("Good morning!");
        } else if (whatTimeIsIt >= 1200 && whatTimeIsIt <= 1559) {
            System.out.println("Good afternoon!");
        } else if (whatTimeIsIt >= 1600 && whatTimeIsIt <= 2059) {
            System.out.println("Good evening!");
        } else if (whatTimeIsIt >= 2100 && whatTimeIsIt <= 2400) {
            System.out.println("Good night!");
        } else {
            System.out.println("Invalid time.");
        }
    }
}
