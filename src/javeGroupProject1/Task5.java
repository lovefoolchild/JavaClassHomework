package javeGroupProject1;

public class Task5 {
    public static void main(String[] args) {
        /* Write a program to swap 2 numbers without a temporary variable? */
        int x=15;
        int y=30;
        x=x+y; // 15+30=45
        y=x-y; // 45-30=15
        x=x-y; // 45-15=30
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
    }
}
