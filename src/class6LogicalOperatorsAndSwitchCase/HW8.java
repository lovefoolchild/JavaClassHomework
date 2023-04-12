package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        /* Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator
        provide the result to user. Please complete this assignment in 2 ways: using if statement and switch case. */

        Scanner love= new Scanner(System.in);
        System.out.println("Think of a number and type it in.");
        double number1= love.nextDouble();
        System.out.println("Think of a second number and type it in.");
        double number2= love.nextDouble();
        System.out.println("Should I add (+), subtract (-), multiply (*) or divide (/) the numbers? Select from the characters provided.");
        char operation= love.next().charAt(0);

        double calculatorSum=number1+number2;
        double calculatorDifference=number1-number2;
        double calculatorProduct=number1*number2;
        double calculatorQuotient=number1/number2;

        if (operation=='+') {
            System.out.println("The answer is "+calculatorSum+".");
        } else if (operation=='-') {
            System.out.println("The answer is "+calculatorDifference+".");
        } else if (operation=='*') {
            System.out.println("The answer is "+calculatorProduct+".");
        } else if (operation=='/') {
            System.out.println("The answer is "+calculatorQuotient+".");
        } else {
            System.out.println("Invalid entry, try again.");
        }
    }
}
