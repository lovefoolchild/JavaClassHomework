package javeGroupProject1;

public class Task7 {
    public static void main(String[] args) {
        /* Write a Java Program to print the first 10 numbers of Fibonacci series. */
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for (int i=0; i<8; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
