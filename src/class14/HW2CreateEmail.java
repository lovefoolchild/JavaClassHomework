package class14;

public class HW2CreateEmail {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type, your
    method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    String createEmail(String firstName, String lastName, String emailType){
        String email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com";
        return email;
    }

    public static void main(String[] args) {
        HW2CreateEmail obj=new HW2CreateEmail();
        String firstName="Cersei";
        String lastName="Lannister";
        String emailType="aol";
        String emailAddress= obj.createEmail(firstName, lastName, emailType);
        System.out.println(emailAddress);
    }
}
