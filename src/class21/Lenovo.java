package class21;

public class Lenovo extends Computers {

    Lenovo(String name, String model, double screenSize) {
        super(name, model, screenSize);
    }

    @Override
    void printInfo(){
        System.out.println(name+" "+model+" with "+screenSize+" monitor size.");
    }
    @Override
    void solve(){
        System.out.println("Lenovo computers have a built in calculator.");
    }
    @Override
    void communicate(){
        System.out.println("Lenovo enables us to access apps and websites to connected with the world.");
    }
    @Override
    void entertain(){
        System.out.println("Lenovo enables us to access sites and apps to play games.");
    }

    void access(){
        System.out.println("Lenovo created computers that are touchscreen.");
    }
}
