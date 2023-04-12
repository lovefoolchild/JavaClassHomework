package class3IfElseStatements;

public class HW4 {
    public static void main(String[] args) {
        /* Create a Java program and declare int variable that will hold a month. Based on the value of the variable your
           program should print the name of the month. Write a program to check whether number is positive or negative.
           Write a Java Program to check whether number is Even or Odd. */
        int month=5;

        if (month==5) {
            System.out.println("May");
        }

        int number=-5;

        if (number>0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }

        int value=10;

        if (value%2==0) {
            System.out.println("Number is even.");
        }
        else {
            System.out.println("Number is odd.");
        }
    }
}
