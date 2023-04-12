package class8NestedLoop;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // Print numbers from 1 to 50 except those that are divisible by 3

        for (int a=1; a<=50; a++){
            if(a%3!=0){
                System.out.print(a+" ");
            }
        }

        System.out.println();
        Scanner scanner=new Scanner(System.in);

        String male="M";
        String woman="F";

        System.out.println("Please enter your gender: M or F");
        String gender= scanner.next();
        System.out.println("Please enter your age");
        int age= scanner.nextInt();

        if (age>25 && gender==woman){
            System.out.println("Woman");
        } else {
            System.out.println("Man");
        }
        if (age<=25 && gender==woman){
            System.out.println("Girl");
        } else {
            System.out.println("Boy");
        }
    }
}
