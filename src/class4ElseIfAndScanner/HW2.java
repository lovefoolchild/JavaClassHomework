package class4ElseIfAndScanner;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /* You are a loan specialist, and you need to ask user what is the amount of loan needed. If loan is less or
        equal to 200,000, then you would lend the money. Otherwise, you would reject the client. */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello, my name is Lovely, your Loan Specialist. What is your name?");
        String name= scanner.next();
        System.out.println("Hello, "+name+"! Nice to meet you. To get started, how much loan are you applying for?");

        int loan=scanner.nextInt();
        if (loan<=200000) {
            System.out.println("Congratulations, we can process your loan.");
        } else if (loan>200000) {
            System.out.println("Sorry, we are not able to process your loan at this time.");
        }
    }
}
