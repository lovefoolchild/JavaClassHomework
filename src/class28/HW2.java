package class28;

import java.util.Scanner;

/*
Create a method checkUserName that will throw a runtime exception. Method should throw an exception
when entered username is less than 5 characters.
 */
public class HW2 {
    public static void main(String[] args) {
    checkUserName();
    }

    static void checkUserName(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter your desired username.");
            String userName = scanner.next();

            if (userName.length()<5) {
                    throw new RuntimeException("Exception: Username entered is less than five characters.");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: "+ e.getMessage());
        }
    }
}
