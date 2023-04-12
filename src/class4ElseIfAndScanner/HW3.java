package class4ElseIfAndScanner;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /* You are a DMV representative, and you need to ask customer their age. If they are 18 and older, you
        will issue a Driver's License to them. Otherwise, you will offer them to get a Learner's Permit. */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello, my name is Lovely, a DMV representative. What is your name?");
        String name= scanner.next();
        System.out.println("Hello, "+name+"! Nice to meet you. To get started, please type in your age.");

        int age=scanner.nextInt();
        if (age>=18) {
            System.out.println("Thank you, we will issue you a Driver's License.");
        } else if (age<18) {
            System.out.println("Great, you are eligible for a Learner's Permit.");
        }
    }
}
