package class6LogicalOperatorsAndSwitchCase;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        /* Ask user to enter their country and capture it. Once values are captured print which language user speaks. */

        Scanner love=new Scanner(System.in);
        System.out.println("Type in your country, all in lower case.");
        String country=love.nextLine();

        String language;

        switch (country) {
            case "united states":
            case "united kingdom":
            case "ireland":
            case "australia":
            case "new zealand":
            case "jamaica":
            case "barbados":
                language = "English";
                System.out.println("You speak "+language+".");
                break;
            case "mexico":
            case "colombia":
            case "spain":
            case "argentina":
            case "peru":
            case "venezuela":
                language = "Spanish";
                System.out.println("You speak "+language+".");
            case "philippines":
                language = "Tagalog";
                System.out.println("You speak "+language+".");
        }
    }
}
