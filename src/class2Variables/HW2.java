package class2Variables;

public class HW2 {
    public static void main(String[] args) {
        /* Create a Java program and name it Variables.
            * In your program create different type of variables to store student’s information(name, last name,
              grade, city, state, phone number) and then print value of those variables in the format:
                    My name is  and my  last name is __
                    I am A/B student
                    I live in city and state__
                    And my phone number is …..
         */
        String name="Lovely";
        String lastName="Henson";
        char grade='B';
        String city="Abilene";
        String state="Texas";
        String mobileNumber="+90-432-222-5501";
        System.out.println("My name is "+name+" and my last name is "+lastName+".");
        System.out.println("I am a "+grade+" student.");
        System.out.println("I live in "+city+", "+state+".");
        System.out.println("And my phone number is "+mobileNumber+".");
    }
}
