package class28;

import java.util.Scanner;

/*
Create a method to check age eligibility that will throw a runtime exception. Method should throw
an exception age is less than 16.
 */
public class HW1 {
    public static void main(String[] args) {
        checkAge();
    }

    static void checkAge() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter your age.");
            int age =scanner.nextInt();

            if (age < 16) {
                throw new RuntimeException("Exception: Age is less than 16.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }
}
