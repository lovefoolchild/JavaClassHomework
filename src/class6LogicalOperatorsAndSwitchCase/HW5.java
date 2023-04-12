package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        /* Write a program that will read three inputs of scores (quiz, midterm, and final scores) and determine the
        grade based on the following rules:
            If the average score >=90 → grade=A
            If the average score >= 70 and <90 → grade=B
            If the average score>=50 and <70 → grade=C
            If the average score<50 → grade=F */

        Scanner love=new Scanner(System.in);
        System.out.println("What is your quiz score?");
        double quizScore= love.nextDouble();

        System.out.println("What is your midterm score?");
        double midtermScore= love.nextDouble();

        System.out.println("What is your final score?");
        double finalScore= love.nextDouble();

        double averageScore=((quizScore+midtermScore+finalScore)/3);

        if (averageScore>=90) {
            System.out.println("Congratulations, you got an A!");
        } else if (averageScore>=70 && averageScore<90) {
            System.out.println("Good job, you got a B.");
        } else if (averageScore>=50 && averageScore<70) {
            System.out.println("Not so great, you got a C.");
        } else if (averageScore<50) {
            System.out.println("Work harder next time, you got an F.");
        }
    }
}
