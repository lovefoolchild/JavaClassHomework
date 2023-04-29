package class14;

public class HW1SayHello {
    /*
    Create a method that will say Hello in different language based on the country
    that will pass when method is executed.
     */
    void sayHello(String country){
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Hello!");
                break;
            case "philippines":
                System.out.println("Mabuhay!");
                break;
            case "france":
                System.out.println("Bonjour!");
                break;
            case "turkey":
                System.out.println("Merhaba!");
                break;
            case "spain":
                System.out.println("Hola!");
                break;
            case "germany":
                System.out.println("Guten Tag!");
                break;
            case "china":
                System.out.println("Ni hao!");
                break;
            default:
                System.out.println("Sorry, I have not learn to say hello in that language.");
        }
    }

    public static void main(String[] args) {
        HW1SayHello obj=new HW1SayHello();
        String country="philippines";
        obj.sayHello(country);
    }
}
