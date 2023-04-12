package class3IfElseStatements;

public class HW3 {
    public static void main(String[] args) {
        /* Create Java program to store 2 values for expected and actual hours. Your program should check if expected hours are
           more than  actual the program should print “You will love the course, and you will succeed”, otherwise
           “Course will be very hard for you!” */
        int expectedHours=15;
        int actualHours=5;

        if (expectedHours>actualHours) {
            System.out.println("You will love the course and you will succeed.");
        }
        else {
            System.out.println("Course will be very hard for you!");
        }
    }
}
