package class12;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
    /*
    Write a program that reads two people's first names and if they're expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? boy
    Suggested baby name: DANRY
     */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to baby name generator! Type in Mom's first name?");
        String momsFirstName=scanner.next();
        System.out.println("Type in Dad's first name?");
        String dadsFirstName=scanner.next();
        System.out.println("What is the baby's gender: boy or girl?");
        String gender=scanner.next();

        if (gender.equals("girl")){
            System.out.println("Suggested baby name is: "+momsFirstName.substring(0,momsFirstName.length()/2)+dadsFirstName.substring(dadsFirstName.length()/2));
        } else if (gender.equals("boy")){
            System.out.println("Suggested baby name is: "+dadsFirstName.substring(0, dadsFirstName.length()/2)+momsFirstName.substring(dadsFirstName.length()/2));
        }

    }
}
