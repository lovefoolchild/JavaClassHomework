package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW9 {
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

        double answer;

        switch (operation) {
            case '+':
                answer=number1+number2;
                System.out.println("The answer is: "+answer+".");
                break;
            case '-':
                answer=number1-number2;
                System.out.println("The answer is: "+answer+".");
                break;
            case '*':
                answer=number1*number2;
                System.out.println("The answer is: "+answer+".");
                break;
            case '/':
                answer=number1/number2;
                System.out.println("The answer is: "+answer+".");
                break;
        }
    }
}
