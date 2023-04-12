package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        /* Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average,
        D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was entered by a
        user with explanation. */

        Scanner love= new Scanner(System.in);
        System.out.println("What is your grade? Type it in by using uppercase letter.");

        char grade=love.next().charAt(0);

        if (grade=='A') {
            System.out.println("You entered "+grade+" that is equivalent to Excellent.");
        } else if (grade=='B') {
            System.out.println("You entered "+grade+" that is equivalent to Good.");
        } else if (grade=='C') {
            System.out.println("You entered "+grade+" that is equivalent to Average.");
        } else if (grade=='D') {
            System.out.println("You entered "+grade+" that is equivalent to Bad.");
        } else {
            System.out.println("The grade you entered is unacceptable. If this is a mistake, enter your grade again by typing uppercase letter");
        }
    }
}
