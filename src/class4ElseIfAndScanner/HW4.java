package class4ElseIfAndScanner;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /* Create a Java program that will ask user to input city and temperature. Your program should convert
        Fahrenheit into Celsius and print "The temperature in the city _ is _." */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello? What city are you in?");
        String city= scanner.nextLine();
        System.out.println("What is the temperature in Fahrenheit today?");

        double temperatureF= scanner.nextDouble();
        double temperatureC=((temperatureF-32.0)*(5.0/9.0));
        System.out.println("The temperature in the city of "+city+" is "+Math.round(temperatureC*100.0)/100.0+" Celsius.");
    }
}
