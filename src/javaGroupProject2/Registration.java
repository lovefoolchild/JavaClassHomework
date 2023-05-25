package javaGroupProject2;

/*
    Create Registration Class in which you would have variables as email, userName and password that have an access
    scope only within its own class. After creating an object of the class user should be able to call methods and in
    each method separately pass values to set users email, username and password.
        Requirements:
        A. Valid email consider to be only yahoo
        B. Valid userName and password cannot be empty and should be of
        length larger than 6 characters. Also, valid password cannot contain userName.
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    void setEmail(String email){
        if (email.contains("@yahoo.com")) {
            this.email=email;
            System.out.println("This is a valid email.");
        } else {
            System.out.println("Not a valid email, please use yahoo.com email address only.");
        }
    }

    void setUserName(String userName){
        this.userName=userName;
        if (userName.length()>6) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Make sure username field is not empty.");
        }
    }

    void setPassword(String password){
        this.password=password;
        if (password.length()>6 && !password.contains(userName)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Make sure password field is not empty and does not contain your username.");
        }
    }
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("example@gmail.com");
        registration.setUserName("user_example");
        registration.setPassword("p@$$Word987user_example");
    }
}
